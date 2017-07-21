package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CarWasher")
public class CarWasherEntity extends UserEntity{

    @OneToOne
    private LocalizationEntity localization;

    public LocalizationEntity getLocalization() {
        return localization;
    }

    public void setLocalization(LocalizationEntity localization) {
        this.localization = localization;
    }

}
