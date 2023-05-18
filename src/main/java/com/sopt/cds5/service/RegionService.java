package com.sopt.cds5.service;

import com.sopt.cds5.controller.dto.response.RegionResponseDto;
import com.sopt.cds5.domain.Region;
import com.sopt.cds5.infrastructure.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;

    public List<RegionResponseDto> getRegionAll(){
        List<RegionResponseDto> regionList=new ArrayList<>();
        List<Region> regions=regionRepository.findAll();

        for (Region region:regions
             ) {
            regionList.add(RegionResponseDto.of(region.getId(), region.getRegionName(), region.getTheaterCount()));
        }
        return regionList;
    }


}
