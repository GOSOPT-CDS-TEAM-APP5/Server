package com.sopt.cds5.controller.dto.response;

import com.sopt.cds5.domain.Multiplex;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TheaterResponseDto {

    private String theaterName;

    public List<MultiplexResponseDto> multiplexList;

    public static TheaterResponseDto of(String theaterName,List<MultiplexResponseDto> multiplexList){
        return new TheaterResponseDto(theaterName,multiplexList);
    }
}
