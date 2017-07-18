package com.ecolavagem.ecolavagem.model.entity;

import com.ecolavagem.ecolavagem.model.Enum.PaymentTypeEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
public class WashRegistryEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    /*private List<WasherEntity> whashers;
    private Location clientLocation;
    private Location carLocation;
    private String dateTime;
    private ClientEntity client;
    private CarEntity car;
    private PaymentTypeEnum paymentType;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
/*
    public List<WasherEntity> getWhashers() {
        return whashers;
    }

    public void setWhashers(List<WasherEntity> whashers) {
        this.whashers = whashers;
    }

    public Location getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(Location clientLocation) {
        this.clientLocation = clientLocation;
    }

    public Location getCarLocation() {
        return carLocation;
    }

    public void setCarLocation(Location carLocation) {
        this.carLocation = carLocation;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public PaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
    }*/
}
