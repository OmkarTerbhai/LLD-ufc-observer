package com.lld.ufc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Fight {

    private String blueCorner;
    private String redCorner;
    private WeightClass weightClass;
    private int rounds;
    private String result;
}
