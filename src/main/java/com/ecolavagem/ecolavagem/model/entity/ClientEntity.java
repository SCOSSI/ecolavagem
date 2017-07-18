package com.ecolavagem.ecolavagem.model.entity;

import com.ecolavagem.ecolavagem.model.Enum.PaymentTypeEnum;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
public class ClientEntity extends UserEntity {
    //private List<PaymentTypeEnum> paymentType;
    //private PaymentTypeEnum paymentData;
    private String cpf;
    //private List<CarEntity> cars;

    /*public List<PaymentTypeEnum> getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(List<PaymentTypeEnum> paymentType) {
        this.paymentType = paymentType;
    }*/

    /*public PaymentTypeEnum getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(PaymentTypeEnum paymentData) {
        this.paymentData = paymentData;
    }*/

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }*/
}
