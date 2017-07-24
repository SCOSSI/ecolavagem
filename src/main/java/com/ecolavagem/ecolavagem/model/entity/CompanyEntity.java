package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
@Table(name = "tb_company")
public class CompanyEntity extends UserEntity {

    @OneToOne
    private AccountEntity account;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "contrato_social")
    private String contratoSocial;

    @Column(name = "checked")
    private Boolean checked;

    @OneToMany(mappedBy="company",cascade = CascadeType.ALL)
    private List<WasherEntity> washers;

    @OneToMany(mappedBy="company",cascade = CascadeType.ALL)
    private List<CommentEntity> comments;


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

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public Optional<AccountEntity> getAccount() {
        return Optional.ofNullable(account);
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }
}
