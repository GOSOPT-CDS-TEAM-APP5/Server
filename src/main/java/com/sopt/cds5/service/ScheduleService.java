package com.sopt.cds5.service;

import com.sopt.cds5.controller.dto.response.TheaterResponseDto;
import com.sopt.cds5.domain.Schedule;
import com.sopt.cds5.domain.Theater;
import com.sopt.cds5.infrastructure.ScheduleRepository;
import com.sopt.cds5.infrastructure.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final TheaterRepository theaterRepository;
    public List<TheaterResponseDto> getSchedule(LocalDate date,Long TheaterId){
        Theater theater=theaterRepository.findById(TheaterId);
        List<Schedule> scheduleList =scheduleRepository.findByTheaterAndDate(theater,date);


        홍대입구:{
            2관:[Schedule],3관:[]
        }

    }
}
