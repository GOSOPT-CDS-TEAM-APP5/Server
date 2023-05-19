package com.sopt.cds5.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
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

    @Column(columnDefinition = "TEXT")
    private String synopsis;        //영화 시놉시스

    public static class MovieBuilder{
        //essential parameter
        private Long movieId;
        private String movieName;       //영화이름
        private float reservationRatio; //예매율
        private float scoreOfStar;      //별점
        private int age;                //연령제한
        private boolean isRelease;
        private int releaseDate;
        private boolean isArtte;

        //detail parameter
        private String genre;           //detail
        private int playFullTime;       //detail
        private String synopsis;        //detail
        public MovieBuilder(Long movieId, String movieName, float reservationRatio, float scoreOfStar, int age, boolean isRelease,int releaseDate,
                            boolean isArtte){
            this.movieId = movieId;
            this.movieName = movieName;
            this.reservationRatio = reservationRatio;
            this.scoreOfStar = scoreOfStar;
            this.age = age;
            this.isRelease = isRelease;
            this.releaseDate = releaseDate;
            this.isArtte = isArtte;
        }
        public MovieBuilder setDetailMovie(String genre, int playFullTime, String synopsis){
            this.genre = genre;
            this.playFullTime = playFullTime;
            this.synopsis = synopsis;
            return this;
        }
        public Movie build(){
            return new Movie(this);
        }


    }

    private Movie(MovieBuilder builder){
        this.movieId = builder.movieId;
        this.movieName = builder.movieName;
        this.reservationRatio = builder.reservationRatio;
        this.scoreOfStar = builder.scoreOfStar;
        this.age = builder.age;
        this.isRelease = builder.isRelease;
        this.releaseDate = builder.releaseDate;
        this.isArtte = builder.isArtte;
        this.genre = builder.genre;
        this.playFullTime = builder.playFullTime;
        this.synopsis = builder.synopsis;
    }
}
