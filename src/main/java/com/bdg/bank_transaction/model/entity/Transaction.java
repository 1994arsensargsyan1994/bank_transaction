package com.bdg.bank_transaction.model.entity;

import com.bdg.bank_transaction.constant.StatusTransaction;
import com.bdg.bank_transaction.constant.TypeTransaction;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;



    @Enumerated(EnumType.STRING)
    private StatusTransaction status;



    @Enumerated(EnumType.STRING)
    private TypeTransaction type;

}
