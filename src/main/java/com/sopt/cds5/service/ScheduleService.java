package com.sopt.cds5.service;

import com.sopt.cds5.controller.dto.request.ScheduleRequestDto;
import com.sopt.cds5.controller.dto.response.MultiplexResponseDto;
import com.sopt.cds5.controller.dto.response.ScheduleResponseDto;
import com.sopt.cds5.controller.dto.response.TheaterResponseDto;
import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Multiplex;
import com.sopt.cds5.domain.Schedule;
import com.sopt.cds5.domain.Theater;
import com.sopt.cds5.infrastructure.MovieRepository;
import com.sopt.cds5.infrastructure.MultiplexRepository;
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
    private final MultiplexRepository multiplexRepository;
    public List<TheaterResponseDto> getSchedule(LocalDate date,Long movieId,List<Long> TheaterIdList){
        List<TheaterResponseDto> scheduleList=new ArrayList<>();
        Optional<Movie> movie= movieRepository.findByMovieId(movieId);
        for (Long TheaterId:TheaterIdList
             ) {
            Theater theater=theaterRepository.findById(TheaterId);
            List<Multiplex> multiplexList=multiplexRepository.findAllByTheater(theater);
            List<MultiplexResponseDto> multiplexResponseDtoList=new ArrayList<>();
            for (Multiplex multiplex:multiplexList
                 ) {
                List<Schedule> schedules=scheduleRepository.findByTheaterAndDateAndMovieAndMultiplex(theater,date,movie.get(),multiplex);
                List<ScheduleResponseDto> scheduleResponseDtoList=new ArrayList<>();
                for (Schedule schedule:schedules
                     ) {
                    scheduleResponseDtoList.add(ScheduleResponseDto.of(schedule.getStartTime(),schedule.getEndTime(),schedule.getCurrentPeople(),schedule.getMaxPeople()));
                }
                multiplexResponseDtoList.add(MultiplexResponseDto.of(multiplex.getMultiplexType(),multiplex.getMultiplexName(),scheduleResponseDtoList));
            }


            scheduleList.add(TheaterResponseDto.of(theater.getTheaterName(),multiplexResponseDtoList));

        }
        return scheduleList;

    }
}
