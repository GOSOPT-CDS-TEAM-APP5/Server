package com.sopt.cds5.service;

import com.sopt.cds5.controller.dto.response.ScheduleResponseDto;
import com.sopt.cds5.controller.dto.response.TheaterResponseDto;
import com.sopt.cds5.domain.Schedule;
import com.sopt.cds5.domain.Theater;
import com.sopt.cds5.infrastructure.ScheduleRepository;
import com.sopt.cds5.infrastructure.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final TheaterRepository theaterRepository;
    public List<TheaterResponseDto> getSchedule(LocalDate date,List<Long> TheaterIdList){
        List<TheaterResponseDto> scheduleList=new ArrayList<>();
        for (Long TheaterId:TheaterIdList
             ) {
            Theater theater=theaterRepository.findById(TheaterId);
            List<Schedule> schedules =scheduleRepository.findByTheaterAndDate(theater,date);
            List<ScheduleResponseDto> scheduleResponseDtoList=new ArrayList<>();
            for (Schedule schedule:schedules
                 ) {
                scheduleResponseDtoList.add(ScheduleResponseDto.of(schedule.getMovieType(),schedule.getMultiplex(),schedule.getStartTime(),schedule.getEndTime(),schedule.getCurrentPeople(),schedule.getCurrentPeople()))

            }
            scheduleList.add(TheaterResponseDto.of(theater.getTheaterName(),scheduleResponseDtoList));
        }
        return scheduleList;

    }
}
