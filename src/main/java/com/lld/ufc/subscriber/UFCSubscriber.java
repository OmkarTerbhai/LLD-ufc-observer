package com.lld.ufc.subscriber;

import com.lld.ufc.dto.Fight;
import com.lld.ufc.dto.UFCEvent;
import com.lld.ufc.producer.Producer;

import java.util.List;

public class UFCSubscriber implements Subscriber {


    public UFCSubscriber(List<Producer> producers) {
        for(Producer p: producers) {
            p.subscribe(this);
        }
    }
    @Override
    public void processEvent(List<Fight> fights) {
        for(Fight f : fights) {
            System.out.println(f.getResult());
        }
    }
}
