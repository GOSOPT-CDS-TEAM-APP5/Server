package com.sopt.cds5.infrastructure;


import com.sopt.cds5.domain.Movie;
import org.springframework.data.repository.Repository;

public interface MovieRepository extends Repository<Movie, Long> {
    void save(Movie movie);
}
