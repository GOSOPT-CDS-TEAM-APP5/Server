package com.sopt.cds5.infrastructure;


import com.sopt.cds5.controller.dto.response.MovieDetailResponseDto;
import com.sopt.cds5.domain.Movie;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends Repository<Movie, Long> {
    void save(Movie movie);

    List<Movie> findAll(); //전체 다 read하는거
    Optional<Movie> findByMovieId(Long movieId);


}
