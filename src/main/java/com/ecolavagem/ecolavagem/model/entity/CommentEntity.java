package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;

/**
 * Created by gabriel on 20/07/17.
 */
@Entity
@Table(name = "tb_comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name="id_client")
    private ClientEntity client;
}
