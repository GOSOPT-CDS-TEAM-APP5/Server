package com.sopt.cds5.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="region_id")
    private Long id;

    private String regionName;
    private Long theaterCount;

    @Builder
    private Region(String regionName,Long theaterCount{
        this.regionName=regionName;
        this.theaterCount=theaterCount;
    }

}
