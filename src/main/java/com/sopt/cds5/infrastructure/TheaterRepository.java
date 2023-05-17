package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Region;
import com.sopt.cds5.domain.Theater;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TheaterRepository extends Repository<Theater,Long> {
    void save(Theater theater);
    Theater findById(Long Id);
    List<Theater> findAll();
    List<Theater> findAllByRegion(Region region);

}
