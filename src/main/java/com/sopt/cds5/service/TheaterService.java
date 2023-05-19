package com.sopt.cds5.service;

import com.sopt.cds5.domain.Region;
import com.sopt.cds5.domain.Theater;
import com.sopt.cds5.infrastructure.RegionRepository;
import com.sopt.cds5.infrastructure.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TheaterService {

    private final TheaterRepository theaterRepository;
    private final RegionRepository regionRepository;

    public List<Theater> getTheaterByRegion(Long regionId){

        Region region=regionRepository.findById(regionId);

        return theaterRepository.findAllByRegion(region);
    }
}
