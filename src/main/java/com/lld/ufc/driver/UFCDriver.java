package com.lld.ufc.driver;

import com.lld.ufc.dto.Fight;
import com.lld.ufc.dto.UFCEvent;
import com.lld.ufc.dto.WeightClass;
import com.lld.ufc.producer.Producer;
import com.lld.ufc.producer.UFCProducer;
import com.lld.ufc.subscriber.Subscriber;
import com.lld.ufc.subscriber.UFCSubscriber;

import java.util.List;

public class UFCDriver {

    public static void run() {
        Fight f1 = new Fight("Alex Pereira", "Magomed Ankalaev",
                WeightClass.LightHeavyWeight, 5,
                "Ankalaev beats Pereira by Unanimous decision");

        Fight f2 = new Fight("Merab Dvalishvili", "Cory Sandhagen",
                WeightClass.Bantamweight, 5,
                "Merab beats Cory by Unanimous decision");

        Fight f3 = new Fight("Jiri Prochazka", "Khalil Roundtree",
                WeightClass.LightHeavyWeight, 3,
                "Prochazka beats Roundtree by KO");

        UFCEvent ufcEvent = new UFCEvent("UFC 320", List.of(f1, f2, f3), "Las Vegas");

        Producer p = new UFCProducer(List.of(ufcEvent));
        Subscriber s = new UFCSubscriber(List.of(p));

        p.produce();
    }
}
