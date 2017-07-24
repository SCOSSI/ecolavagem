package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
@Table(name = "tb_account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(name="bank")
    private String bank;

    @Column(name="agency")
    private String agency;

    @Column(name="number")
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
