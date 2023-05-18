package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Region;
import com.sopt.cds5.domain.Schedule;
import com.sopt.cds5.domain.Theater;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleRepository extends Repository<Schedule,Long> {

    void save(Schedule schedule);

    Schedule findById(Long Id);
    List<Schedule> findAll();
    List<Schedule> findByTheaterAndDateAndMovie(Theater theater, LocalDate date,Movie movie);
    List<Schedule> findAllByTheater(Theater theater);
    List<Schedule> findAllByMultiplex(Long multiplex);
    List<Schedule> findAllByOrderByMultiplex();
}
