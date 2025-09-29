package com.lld.ufc.producer;

import com.lld.ufc.subscriber.Subscriber;

public interface Producer {

    void subscribe(Subscriber s);

    void unsubscribe(Subscriber s);

    void produce();
}
