package com.sopt.cds5.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Multiplex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "multiplex_id")
    private Long multiplexId;


    private String multiplexName;

    private String multiplexType;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "theater_id")
    private Theater theater;
}
