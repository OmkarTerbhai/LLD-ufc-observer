package com.lld.ufc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UFCEvent {

    private String eventName;
    private List<Fight> fights;
    private String location;
}
