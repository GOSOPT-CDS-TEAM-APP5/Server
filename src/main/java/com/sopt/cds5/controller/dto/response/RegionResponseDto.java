package com.sopt.cds5.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegionResponseDto {

    private Long regionId;
    private String regionName;
    private Long theaterCount;

    public static RegionResponseDto of(Long regionId, String regionName,Long theaterCount) {
        return new RegionResponseDto(regionId,regionName,theaterCount);
    }
}
