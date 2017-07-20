package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CarWasher")
public class CarWasher extends UserEntity{

    @OneToOne
    private Localization localization;

    public Localization getLocalization() {
        return localization;
    }

    public void setLocalization(Localization localization) {
        this.localization = localization;
    }

}
