package com.sopt.cds5.controller.dto.response;

import lombok.*;
//직접 만든 객체만 넣어서 그냥 of로 들어갔는지 id,movieName 정도만 확인하는 responseDto
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MovieResponseDto {

    private Long movieId;
    private String movieName;


    public static MovieResponseDto of(Long movieId, String movieName){
        return new MovieResponseDto(movieId, movieName);
    }


}
