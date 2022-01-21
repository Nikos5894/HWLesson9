package com.company.cursor.exercise_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task4Main {
    public static void main(String[] args) {
        Thing thing = new Thing("Xbox", 1);
        Thing thing1 = new Thing("PlayStation", 123, true);
        Thing thing2 = new Thing("PSP", 7685, true);
        Thing thing3 = new Thing("Sony", 10953);
        List<Thing> thingList = new ArrayList<>();
        Collections.addAll(thingList, thing, thing1, thing2, thing3);
        Thing[] things = new Thing[4];
        things[0] = thing;
        things[1] = thing1;
        things[2] = thing2;
        things[3] = thing3;

        Thing thing4 = new Thing("Xiaomi", 5);
        Thing thing5 = new Thing("Apple", 13, true);
        Thing thing6 = new Thing("Huawei", 5534);
        Thing thing7 = new Thing("Samsung", 10, true);
        Thing thing8 = new Thing("Oppo", 908532);

        Thing[] things1 = new Thing[5];
        things1[0] = thing4;
        things1[1] = thing5;
        things1[2] = thing6;
        things1[3] = thing7;
        things1[4] = thing8;

        Box box = new Box(10242, things);
        Box box1 = new Box(90824, things1);
        List<Box> boxList = new ArrayList<>();
        boxList.add(box);
        boxList.add(box1);
        // var makesmth = boxList.stream().filter(it -> it.getThing().isFragile() ).peek(it -> it.getThing().addExtraPacking()).collect(Collectors.toList());
        //System.out.println(makesmth);

        for (Box b : boxList) {
            System.out.println(b);
            var addPacking = Arrays.stream(b.getThings()).filter(Thing::isFragile).peek(Thing::addExtraPacking).collect(Collectors.toList());
            System.out.println(addPacking);
        }

    }
}
