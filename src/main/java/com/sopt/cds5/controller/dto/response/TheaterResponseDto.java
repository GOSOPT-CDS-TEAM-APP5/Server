package com.sopt.cds5.controller.dto.response;

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

    private List<ScheduleResponseDto> multiplexList;

    public static TheaterResponseDto of(String theaterName,List<ScheduleResponseDto> ScheduleList){
        return new TheaterResponseDto(theaterName,ScheduleList);
    }
}
