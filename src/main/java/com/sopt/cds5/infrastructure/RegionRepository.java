package com.sopt.cds5.infrastructure;

import com.sopt.cds5.domain.Movie;
import com.sopt.cds5.domain.Region;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RegionRepository extends Repository<Region, Long> {

    void save(Region region);
    Region findById(Long Id);
    List<Region> findAll();

}
