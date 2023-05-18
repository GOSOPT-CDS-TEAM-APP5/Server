package com.sopt.cds5.service;

import com.sopt.cds5.controller.dto.response.ScheduleResponseDto;
import com.sopt.cds5.controller.dto.response.TheaterResponseDto;
import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Schedule;
import com.sopt.cds5.domain.Theater;
import com.sopt.cds5.infrastructure.MovieRepository;
import com.sopt.cds5.infrastructure.ScheduleRepository;
import com.sopt.cds5.infrastructure.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final TheaterRepository theaterRepository;
    private final MovieRepository movieRepository;
    public List<TheaterResponseDto> getSchedule(LocalDate date,Long movieId,List<Long> TheaterIdList){
        List<TheaterResponseDto> scheduleList=new ArrayList<>();
        Optional<Movie> movie= movieRepository.findByMovieId(movieId);
        for (Long TheaterId:TheaterIdList
             ) {
            Theater theater=theaterRepository.findById(TheaterId);
            List<Schedule> schedules =scheduleRepository.findByTheaterAndDateAndMovie(theater,date,movie.get());
            List<ScheduleResponseDto> scheduleResponseDtoList=new ArrayList<>();
            for (Schedule schedule:schedules
                 ) {
                scheduleResponseDtoList.add(ScheduleResponseDto.of(schedule.getMovieType(),schedule.getMultiplex(),schedule.getStartTime(),schedule.getEndTime(),schedule.getCurrentPeople(),schedule.getCurrentPeople()));

            }
            scheduleList.add(TheaterResponseDto.of(theater.getTheaterName(),scheduleResponseDtoList));
        }
        return scheduleList;

    }
}
