package com.lld.ufc.subscriber;

import com.lld.ufc.dto.Fight;
import com.lld.ufc.producer.Producer;

import java.util.List;

public interface Subscriber {

    void processEvent(List<Fight> fights);

}
