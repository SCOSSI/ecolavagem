package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;

/**
 * Created by gabriel on 20/07/17.
 */
@Entity
@Table(name = "tb_washer_comment")
public class WasherCommentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String comment;
    @ManyToOne
    @JoinColumn(name="id_washer")
    private WasherEntity washer;
    @ManyToOne
    @JoinColumn(name="id_client")
    private ClientEntity client;
}
