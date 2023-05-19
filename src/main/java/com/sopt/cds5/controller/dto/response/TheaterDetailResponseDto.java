package com.sopt.cds5.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TheaterDetailResponseDto {

    private Long theaterId;

    private String theaterName;

    public static TheaterDetailResponseDto of(Long theaterId,String theaterName){
        return new TheaterDetailResponseDto(theaterId,theaterName);
    }
}
