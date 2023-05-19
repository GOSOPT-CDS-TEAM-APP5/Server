package com.sopt.cds5.controller;
import com.sopt.cds5.common.dto.ApiResponseDto;
import com.sopt.cds5.controller.dto.request.MovieDetailRequestDto;
import com.sopt.cds5.controller.dto.request.MovieRequestDto;
import com.sopt.cds5.controller.dto.request.MovieTimeRequestDto;
import com.sopt.cds5.controller.dto.response.MovieDetailResponseDto;
import com.sopt.cds5.controller.dto.response.MovieResponseDto;
import com.sopt.cds5.controller.dto.response.MovieTimeResponseDto;
import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.exception.SuccessStatus;
import com.sopt.cds5.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;


    @PostMapping("/movie/create") //메인에 넣을 영화 추가
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponseDto<MovieResponseDto> create(@RequestBody @Valid final MovieRequestDto request){
        return ApiResponseDto.success(SuccessStatus.CREATE_SUCCESS, movieService.create(request));
    }
//
    @GetMapping("/main")
    public List<Movie> showMovieList(){ //메인에 영화 뿌리는 코드
        return movieService.getMovieList();
    }

    @GetMapping("/detail/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto<MovieDetailResponseDto> showMovieDetail(
            @PathVariable("movieId") Long movieId){
        return ApiResponseDto.success(SuccessStatus.FIND_SUCCESS,movieService.getMovieDetail(movieId));
    }

    @GetMapping("/time/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto<MovieTimeResponseDto> showMovieTime(
            @PathVariable("movieId") Long movieId){
        return ApiResponseDto.success(SuccessStatus.TIME_SUCCESS,movieService.getMovieTime(movieId));
    }




}
