package com.sopt.cds5.controller;

import com.sopt.cds5.common.dto.ApiResponseDto;
import com.sopt.cds5.domain.Region;
import com.sopt.cds5.domain.Theater;
import com.sopt.cds5.exception.ErrorStatus;
import com.sopt.cds5.exception.SuccessStatus;
import com.sopt.cds5.service.RegionService;
import com.sopt.cds5.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TheaterController {

    private final TheaterService theaterService;
    private final RegionService regionService;
    @GetMapping("/theater/{regionId}")
    public ApiResponseDto<List<String>> getTheaterList(@PathVariable final Long regionId){
        List<Theater> theaters=theaterService.getTheaterByRegion(regionId);
        List<String> theaterNameList=new ArrayList<>();
        if(theaters.size()==0){
            return ApiResponseDto.error(ErrorStatus.VALIDATION_NOTFOUND);
        }
        for (Theater theater:theaters
             ) {
            theaterNameList.add(theater.getTheaterName());
        }
        return ApiResponseDto.success(SuccessStatus.SEARCH_SUCCESS,theaterNameList);
    }
}
