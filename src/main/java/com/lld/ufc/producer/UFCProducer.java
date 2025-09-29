package com.lld.ufc.producer;

import com.lld.ufc.dto.Fight;
import com.lld.ufc.dto.UFCEvent;
import com.lld.ufc.subscriber.Subscriber;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UFCProducer implements Producer {

    Set<Subscriber> st;
    public List<UFCEvent> ufcEvents;

    public UFCProducer(List<UFCEvent> events) {
        st = new HashSet<>();
        ufcEvents = events;
    }

    @Override
    public void subscribe(Subscriber s) {
        st.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        st.remove(s);
    }

    @Override
    public void produce() {
        for(Subscriber s : st) {
            for(UFCEvent e : ufcEvents) {
                s.processEvent(e.getFights());
            }
        }
    }
}
