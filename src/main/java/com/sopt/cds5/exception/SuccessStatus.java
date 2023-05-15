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
public class SuccessStatus {
    private final HttpStatus httpStatus;

    private final String message;
}
