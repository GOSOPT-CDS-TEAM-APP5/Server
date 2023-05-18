package com.sopt.cds5.exception;
/*
error 상태를 표현하는 클래스입니다.
기본적인 틀을 만들어보았고, 회의와 erd 작성이 모두 끝나면 추가해서 기록하면 좋을 것 같습니다.
그나마 현재 생각나는 conflict는 movieName정도입니다.
 */
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorStatus {
    /*
    BAD_REQUEST
     */
    VALIDATION_EXCEPTION(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    VALIDATION_REQUEST_MISSING_EXCEPTION(HttpStatus.BAD_REQUEST, "요청값이 입력되지 않았습니다."),

    VALIDATION_NOTFOUND(HttpStatus.NOT_FOUND,"검색 결과가 없습니다"),
    /*
    CONFLICT
     */
    CONFLICT_MOVIENAME_EXCEPTION(HttpStatus.CONFLICT, "이미 등록된 영화제목입니다."),


    /*
    SERVER_ERROR
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "예상치 못한 서버 에러가 발생했습니다."),
    BAD_GATEWAY_EXCEPTION(HttpStatus.BAD_GATEWAY, "일시적인 에러가 발생하였습니다.\n잠시 후 다시 시도해주세요!"),
    SERVICE_UNAVAILABLE_EXCEPTION(HttpStatus.SERVICE_UNAVAILABLE, "현재 점검 중입니다.\n잠시 후 다시 시도해주세요!"),
    ;
    private final HttpStatus httpStatus;
    private final String message;

}
