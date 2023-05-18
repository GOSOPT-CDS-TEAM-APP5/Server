package com.sopt.cds5.service;

import com.sopt.cds5.controller.dto.request.MovieDetailRequestDto;
import com.sopt.cds5.controller.dto.request.MovieRequestDto;
import com.sopt.cds5.controller.dto.request.MovieTimeRequestDto;
import com.sopt.cds5.controller.dto.response.MovieDetailResponseDto;
import com.sopt.cds5.controller.dto.response.MovieResponseDto;
import com.sopt.cds5.controller.dto.response.MovieTimeResponseDto;
import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.infrastructure.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    @Transactional
    public MovieResponseDto create(MovieRequestDto request){
        Movie movie = new Movie.MovieBuilder(
                request.getMovieId(),
                request.getMovieName(),
                request.getReservationRatio(),
                request.getScoreOfStar(),
                request.getAge(),
                request.isRelease(),
                request.getReleaseDate(),
                request.isArtte()
                )
                .setDetailMovie(request.getGenre(), request.getPlayFullTime(), request.getSynopsis())
                .build();

        movieRepository.save(movie);
        return MovieResponseDto.of(movie.getMovieId(),movie.getMovieName());

    }

    public List<Movie> getMovieList(){
        return movieRepository.findAll();
    }

    public MovieDetailResponseDto getMovieDetail(Long wantMovieId){
        Optional<Movie> findMovieDetail = movieRepository.findByMovieId(wantMovieId);
        Movie findMovieEntity = findMovieDetail.get();
        return MovieDetailResponseDto.of(findMovieEntity.getMovieName(),findMovieEntity.getReservationRatio(),findMovieEntity.getScoreOfStar(),
                findMovieEntity.getAge(),findMovieEntity.getReleaseDate(),findMovieEntity.getGenre(),findMovieEntity.getPlayFullTime(),findMovieEntity.getSynopsis()); //?!
    }

    public MovieTimeResponseDto getMovieTime(Long wantMovieId){
        Optional<Movie> findMovieTime = movieRepository.findByMovieId(wantMovieId);
        Movie findMovieTimeEntity = findMovieTime.get();
        return MovieTimeResponseDto.of(findMovieTimeEntity.getMovieName(), findMovieTimeEntity.getReleaseDate(),findMovieTimeEntity.getGenre(), findMovieTimeEntity.getPlayFullTime());
    }

}
