package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
public class WasherEntity extends UserEntity {
    private String cpf;
   // private Location location;
   // private AccountEntity account;
   // private CompanyEntity company;
    private boolean checked;
    //private List<String> comments;
    private String addressProof;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }*/

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }



    public String getAddressProof() {
        return addressProof;
    }

    public void setAddressProof(String addressProof) {
        this.addressProof = addressProof;
    }
}
