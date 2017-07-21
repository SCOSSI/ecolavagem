package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;

/**
 * Created by gabriel on 19/07/17.
 */

@Entity
@Table(name = "tb_payment_type")
public class PaymentTypeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String type;
    private Boolean isDefault;
    @ManyToOne
    @JoinColumn(name="id_client")
    private ClientEntity client;

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
