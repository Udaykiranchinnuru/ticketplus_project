package com.jspiders.dao;

public interface PaymentDao
{
    void addPayment();
    void getPayment(Long audiId);
    void updatePayment(Long audiId);
    void deletePayment(Long audiId);
}
