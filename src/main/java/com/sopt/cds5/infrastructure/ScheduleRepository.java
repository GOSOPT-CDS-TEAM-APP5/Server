package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Region;
import com.sopt.cds5.domain.Schedule;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ScheduleRepository extends Repository<Schedule,Long> {

    void save(Schedule schedule);

    Schedule findById(Long Id);
    List<Schedule> findAll();
    List<Schedule> findAllByRegion(Region region);
    List<Schedule> findAllByRegionOrderByMultiplex();
}
