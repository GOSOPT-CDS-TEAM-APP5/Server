package com.sopt.cds5.exception;
/*
성공 status의 공통 클래스를 작성했습니다.
 */
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus {
    /*
    movie
     */
    CREATE_SUCCESS(HttpStatus.CREATED, "영화등록이 완료되었습니다."),
    FIND_SUCCESS(HttpStatus.OK, "상세조회 성공"),
    TIME_SUCCESS(HttpStatus.OK, "시간조회 성공")
    ;
    private final HttpStatus httpStatus;

    private final String message;
}
