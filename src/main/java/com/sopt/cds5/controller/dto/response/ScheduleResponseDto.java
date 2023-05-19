package com.sopt.cds5.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ScheduleResponseDto {

    private String startTime;
    private String endTime;
    private String currentPeople;
    private String maxPeople;

    public static ScheduleResponseDto of( String startTime, String endTime, String currentPeople, String maxPeople) {
        return new ScheduleResponseDto(startTime,endTime,currentPeople,maxPeople);
    }
}
