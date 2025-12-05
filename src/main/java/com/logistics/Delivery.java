package com.logistics;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @Column(name = "delivery_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliveryId;

    @Column(name = "driver_id")
    private int driverId;

    @Column(name = "operation_date")
    private char operationDate;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "item_list")
    private char itemList;

    @Column(name = "delivery_route")
    private char deliveryRoute;

    // Getters and Setters
    public int getDeliveryId() {
        return deliveryIdId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getItemList(char itemList) {
        return itemList;
    }

    public void setDeliveryRoute(int deliveryRoute) {
        this.deliveryRoute = deliveryRoute;
    }
}
