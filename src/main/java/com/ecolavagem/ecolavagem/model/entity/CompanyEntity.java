package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
public class CompanyEntity extends UserEntity {

    //private AccountEntity account;
    private String cnpj;
    private String contratoSocial;
    private boolean checked;
    //private List<String> comments;

    /*public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }*/

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContratoSocial() {
        return contratoSocial;
    }

    public void setContratoSocial(String contratoSocial) {
        this.contratoSocial = contratoSocial;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }


}
