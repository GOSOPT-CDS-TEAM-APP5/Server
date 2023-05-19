package com.sopt.cds5.controller;

import com.sopt.cds5.common.dto.ApiResponseDto;
import com.sopt.cds5.controller.dto.response.RegionResponseDto;
import com.sopt.cds5.exception.SuccessStatus;
import com.sopt.cds5.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RegionController {
    private final RegionService regionService;

    @GetMapping("/region")
    public ApiResponseDto<List<RegionResponseDto>> getRegion(){
        return ApiResponseDto.success(SuccessStatus.SEARCH_SUCCESS,regionService.getRegionAll());
    }


}
