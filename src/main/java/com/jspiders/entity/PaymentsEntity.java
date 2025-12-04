package com.jspiders.entity;

import com.jspiders.enums.MovieStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class PaymentsEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "booking_id",nullable = false)
    private Integer booking_id;
    @Column(name = "amount",nullable = false)
    private Integer amount;
    @Column(name = "method" ,nullable = false)
    private String method;
    @Column(name = "status",nullable = false)
    private MovieStatus status;
    @Column(name = "txn_ref",nullable = false)
    private Integer txn_ref;
    @Column(name = "paid_at")
    private LocalDate paid_at;

}
