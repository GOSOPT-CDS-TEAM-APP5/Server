package com.sopt.cds5.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="schedule_id")
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "theater_id")
    private Theater theater;

    private Long multiplex;
    private String startTime;
    private String endTime;
    private String currentPeople;
    private String maxPeople;
    private LocalDate date;

    private String MovieType;
}
