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
<<<<<<< HEAD

    /**
     * 200 FIND
     */
    SEARCH_SUCCESS(HttpStatus.OK,"조회에 성공했습니다.");
=======
    /*
    movie
     */
    CREATE_SUCCESS(HttpStatus.CREATED, "영화등록이 완료되었습니다."),
    FIND_SUCCESS(HttpStatus.CREATED, "상세조회 성공"),
    TIME_SUCCESS(HttpStatus.CREATED, "시간조회 성공")
    ;
>>>>>>> #10
    private final HttpStatus httpStatus;

    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
