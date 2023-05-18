package com.sopt.cds5.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;
    @Column(nullable = false)
    private String movieName;       //영화이름
    @Column(nullable = false)
    private float reservationRatio; //예매율
    @Column(nullable = false)
    private float scoreOfStar;      //별점
    @Column(nullable = false)
    private int age;                //연령제한
    @Column(nullable = false)
    private boolean isRelease;      //개봉여부
    @Column(nullable = false)
    private int releaseDate;        //개봉날짜 D-DAY
    @Column(nullable = false)
    private boolean isArtte;        //아르떼인지 여부
    @Column(nullable = false)
    private String genre;           //장르
    @Column(nullable = false)
    private int playFullTime;       //영화 총 플레이시간

    @Builder
    public Movie(String movieName, float reservationRatio, float scoreOfStar, int age, boolean isRelease,int releaseDate,
                 boolean isArtte, String genre, int playFullTime){
        this.movieName = movieName;
        this.reservationRatio = reservationRatio;
        this.scoreOfStar = scoreOfStar;
        this.age = age;
        this.isRelease = isRelease;
        this.releaseDate = releaseDate;
        this.isArtte = isArtte;
        this.genre = genre;
        this.playFullTime = playFullTime;
    }
}
