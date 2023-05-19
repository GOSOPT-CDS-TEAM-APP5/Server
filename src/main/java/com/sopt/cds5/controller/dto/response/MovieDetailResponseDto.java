package com.sopt.cds5.controller.dto.response;

import com.sopt.cds5.controller.dto.request.MovieDetailRequestDto;
import com.sopt.cds5.domain.Movie.MovieBuilder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MovieDetailResponseDto {
    private String movieName;       //영화이름
    private float reservationRatio; //예매율
    private float scoreOfStar;      //별점
    private int age;                //연령제한
    private int releaseDate;        //개봉일

    //detail parameter
    private String genre;           //장르
    private int playFullTime;       //총 영화시간
    private String synopsis;        //시놉시스

//Artee, isRelease는 detail에서 필요하지 않다.
    public static MovieDetailResponseDto of(String movieName, float reservationRatio, float scoreOfStar, int age, int releaseDate,
                                             String genre, int playFullTime, String synopsis){
        return new MovieDetailResponseDto(movieName,reservationRatio,scoreOfStar,age,releaseDate,genre,playFullTime,synopsis);

    }
}
