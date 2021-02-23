package com.bdg.bank_transaction.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    private LocalDate creatTime;



}
