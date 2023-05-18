package com.sopt.cds5.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MovieTimeResponseDto {
    private String movieName;       //영화이름
    private int releaseDate;        //개봉일
    private String genre;           //장르
    private int playFullTime;       //총 영화시간

    //Artee, isRelease는 detail에서 필요하지 않다.
    public static MovieTimeResponseDto of(String movieName, int releaseDate, String genre, int playFullTime){
        return new MovieTimeResponseDto(movieName,releaseDate,genre,playFullTime);

    }
}