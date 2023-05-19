package com.sopt.cds5.controller.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MovieTimeRequestDto {
    private Long movieId;
    public static class MovieTimeRequestDtoBuilder{
        private final Long movieId;

        public MovieTimeRequestDtoBuilder(Long movieId){
            this.movieId = movieId;
        }
        public MovieTimeRequestDto build(){
            return new MovieTimeRequestDto((this));
        }
    }

    public MovieTimeRequestDto(MovieTimeRequestDtoBuilder builder){
        this.movieId = builder.movieId;
    }

}