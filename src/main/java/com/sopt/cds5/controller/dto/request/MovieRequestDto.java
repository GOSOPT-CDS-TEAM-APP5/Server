package com.sopt.cds5.controller.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MovieRequestDto { //create에 필요한 dto입니다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @NotNull(message = "영화제목이 존재하지 않습니다.")
    @Pattern(regexp = "^[가-힣a-zA-Z0-9]{1,20}$", message = "영화제목 형식에 맞지 않습니다.")
    private String movieName;
    @NotNull(message = "예매율이 존재하지 않습니다.")
    private float reservationRatio;
    @NotNull(message = "별점이 존재하지 않습니다.")
    private float scoreOfStar;
    @NotNull(message = "연령제한이 존재하지 않습니다.")
    private int age;
    @NotNull(message = "개봉여부가 존재하지 않습니다.")
    private boolean isRelease;
    @NotNull(message = "개봉일이 존재하지 않습니다.")
    private int releaseDate;
    @NotNull(message = "아르테인지 여부가 존재하지 않습니다.")
    private boolean isArtte;
    @NotNull(message = "장르가 존재하지 않습니다.")
    private String genre;
    @NotNull(message = "전체상영시간이 존재하지 않습니다.")
    private int playFullTime;
    @NotNull(message = "시놉시스가 존재하지 않습니다.")
    private String synopsis;

}
