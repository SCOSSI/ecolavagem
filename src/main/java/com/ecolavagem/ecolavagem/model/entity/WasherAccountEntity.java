package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;

/**
 * Created by gabriel on 20/07/17.
 */
@Entity
@Table(name = "tb_washer_account")
public class WasherAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    private String bank;
    private String agency;
    private String number;
    @OneToOne
    private WasherEntity owner;
}
