package com.spring.kubernetes.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookMark {

    @Id
    @SequenceGenerator(name = "bm_id_seq_gen",sequenceName = "bm_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bm_id_seq_gen")
    private Long Id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String url;
    private Instant createdAt;


}
