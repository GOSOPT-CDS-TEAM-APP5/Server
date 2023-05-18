package com.sopt.cds5.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MultiplexReseponseDto {

    private String movieType;
    private String multiplexLocation;
    private List<ScheduleResponseDto> scheduleList;

    public static MultiplexReseponseDto of(String movieType,String multiplexLocation,List<ScheduleResponseDto> scheduleList){
       return new MultiplexReseponseDto(movieType,multiplexLocation,scheduleList);
    }
}
