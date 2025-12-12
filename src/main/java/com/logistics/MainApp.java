package com.logistics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        String sql =
                "SELECT " +
                "CONCAT(o.last_name, ' ', o.first_name, ' ', o.middle_name) AS operator_name, " +
                "CONCAT(d.last_name, ' ', d.first_name, ' ', d.middle_name) AS driver_name, " +
                "del.operation_date, del.order_id, del.item_list, del.delivery_route, " +
                "d.transport_type, o.experience, b.address, b.phone " +
                "FROM public.deliveries del " +
                "JOIN public.operators o ON del.operator_id = o.operator_id " +
                "JOIN public.drivers d ON del.driver_id = d.driver_id " +
                "JOIN public.base b ON o.base_id = b.base_id " +
                "ORDER BY del.delivery_id ASC";

        NativeQuery<Object[]> q = session.createNativeQuery(sql);
        List<Object[]> rows = q.getResultList();

        System.out.println("=== DENORMALIZED DELIVERY TABLE ===");
        for (Object[] r : rows) {
            System.out.println(
                    r[0] + " | " +
                    r[1] + " | " +
                    r[2] + " | " +
                    r[3] + " | " +
                    r[4] + " | " +
                    r[5] + " | " +
                    r[6] + " | " +
                    r[7] + " | " +
                    r[8] + " | " +
                    r[9]
            );
        }

        session.close();
        factory.close();
    }
}
