package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.*;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleRepository extends Repository<Schedule,Long> {

    void save(Schedule schedule);

    Schedule findById(Long Id);
    List<Schedule> findAll();
    List<Schedule> findByTheaterAndDateAndMovieAndMultiplex(Theater theater, LocalDate date, Movie movie, Multiplex multiplex);

}
