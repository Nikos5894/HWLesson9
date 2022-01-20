package com.company.cursor.exercise_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task4Main {
    public static void main(String[] args) {
        Thing thing = new Thing("Xbox", 1);
        Thing thing1 = new Thing("PlayStation",123,true);
        Thing thing2 = new Thing("PSP",7685,true);
        Thing thing3 = new Thing("Sony",10953);
        List<Thing> thingList = new ArrayList<>();
        Collections.addAll(thingList, thing,thing1,thing2,thing3);
        Thing[] things = new Thing[4];
        things[0] = thing;
        things[1] = thing1;
        things[2] = thing2;
        things[3] = thing3;

        Box box = new Box(10242,things);
        List<Box> boxList = new ArrayList<>();
        boxList.add(box);
        var makesmth = boxList.stream().filter(it -> it.getThing().isFragile() ).peek(it -> it.getThing().addExtraPacking()).collect(Collectors.toList());
        System.out.println(makesmth);



    }
}
