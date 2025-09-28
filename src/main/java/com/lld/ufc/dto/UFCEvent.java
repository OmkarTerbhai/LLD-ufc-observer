package com.lld.ufc.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UFCEvent {

    private String eventName;
    private List<Fight> fights;
    private String location;
}
