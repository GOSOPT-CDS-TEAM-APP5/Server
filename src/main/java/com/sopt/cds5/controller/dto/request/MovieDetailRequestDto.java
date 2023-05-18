package com.sopt.cds5.controller.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MovieDetailRequestDto {
    private Long movieId;
    public static class MovieDetailDtoBuilder{
        private Long movieId;

        public MovieDetailDtoBuilder(Long movieId){
            this.movieId = movieId;
        }
        public MovieDetailRequestDto build(){
            return new MovieDetailRequestDto((this));
        }
    }

    public MovieDetailRequestDto(MovieDetailDtoBuilder builder){
        this.movieId = builder.movieId;
    }

}
