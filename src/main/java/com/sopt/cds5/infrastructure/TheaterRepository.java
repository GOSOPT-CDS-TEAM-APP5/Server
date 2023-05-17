package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Region;
import com.sopt.cds5.domain.Theater;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TheaterRepository extends Repository<Theater,Long> {
    void save(Theater theater);
    Movie findById(Long Id);
    List<Movie> findAll();
    List<Movie> findAllByRegion(Region region);

}
