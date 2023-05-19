package com.sopt.cds5.controller;

import com.sopt.cds5.common.dto.ApiResponseDto;
import com.sopt.cds5.controller.dto.request.ScheduleRequestDto;
import com.sopt.cds5.controller.dto.response.TheaterResponseDto;
import com.sopt.cds5.domain.Schedule;
import com.sopt.cds5.exception.SuccessStatus;
import com.sopt.cds5.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/schedule")
    public ApiResponseDto<List<TheaterResponseDto>> getSchedule(@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam  final LocalDate date, @RequestParam final Long movieId, @RequestParam final List<Long> theaterId){
        List<TheaterResponseDto> theaterResponseDtoList=scheduleService.getSchedule(date,movieId,theaterId);
        return ApiResponseDto.success(SuccessStatus.SEARCH_SUCCESS,theaterResponseDtoList);
    }
}
