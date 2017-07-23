package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
@Table(name = "tb_company")
public class CompanyEntity extends UserEntity {

    @OneToOne
    private CompanyAccountEntity account;
    private String cnpj;
    private String contratoSocial;
    private boolean checked;
    @OneToMany(mappedBy="company",cascade = CascadeType.ALL)
    private List<WasherEntity> washers;

    @OneToMany(mappedBy="company",cascade = CascadeType.ALL)
    private List<CompanyCommentEntity> comments;


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


    public List<WasherEntity> getWashers() {
        return washers;
    }

    public void setWashers(List<WasherEntity> washers) {
        this.washers = washers;
    }

    public List<CompanyCommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CompanyCommentEntity> comments) {
        this.comments = comments;
    }
}
