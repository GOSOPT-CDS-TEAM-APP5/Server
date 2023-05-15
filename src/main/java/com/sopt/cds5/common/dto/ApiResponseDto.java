package com.sopt.cds5.common.dto;
/*
공통 api response dto를 만들어봤습니다.
code : 상태코드
message : 해당 상황에 맞는 메세지
data : 정상 작동할 때 넘어오는 data
 */

import com.sopt.cds5.exception.ErrorStatus;
import com.sopt.cds5.exception.SuccessStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponseDto<T>{
    private final int code;
    private final String message;
    private T data;

    public static ApiResponseDto success(SuccessStatus successStatus){
        return new ApiResponseDto<>(successStatus.getHttpStatus().value(), successStatus.getMessage());
    }

    public static <T> ApiResponseDto<T> success(SuccessStatus successStatus, T data){
        return new ApiResponseDto<T>(successStatus.getHttpStatus().value(), successStatus.getMessage(), data);
    }

    public static ApiResponseDto error(ErrorStatus errorStatus){
        return new ApiResponseDto<>(errorStatus.getHttpStatus().value(), errorStatus.getMessage());
    }

}
