package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

/**
 * Created by gabriel on 17/07/17.
 */
@Entity
@Table(name = "washer")
public class WasherEntity extends UserEntity {

    private String cpf;

    @OneToOne
    private LocalizationEntity localization;

    @OneToOne
    private AccountEntity account;

    @ManyToOne
    @JoinColumn(name="id_company")
    private CompanyEntity company;

    private boolean checked;

    @OneToMany(mappedBy="washer",cascade = CascadeType.ALL)
    private List<CommentEntity> comments;

    private String addressProof;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


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

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public Optional<AccountEntity> getAccount() {
        return Optional.ofNullable(account);
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public LocalizationEntity getLocalization() {
        return localization;
    }

    public void setLocalization(LocalizationEntity localization) {
        this.localization = localization;
    }
}
