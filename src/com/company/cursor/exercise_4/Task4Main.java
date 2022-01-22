package com.company.cursor.exercise_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task4Main {

    public static void main(String[] args) {
        List<Thing> thingList = new ArrayList<>();
        Thing thing = new Thing("Xbox", 1);
        Thing thing1 = new Thing("PlayStation", 123, true);
        Thing thing2 = new Thing("PSP", 7685, true);
        Thing thing3 = new Thing("Sony", 10953);
        Collections.addAll(thingList, thing, thing1, thing2, thing3);

        List<Thing> thingList1 = new ArrayList<>();
        Thing thing4 = new Thing("Xiaomi", 5);
        Thing thing5 = new Thing("Apple", 13, true);
        Thing thing6 = new Thing("Huawei", 5534);
        Thing thing7 = new Thing("Samsung", 10, true);
        Thing thing8 = new Thing("Oppo", 908532);
        Collections.addAll(thingList1, thing4, thing5, thing6, thing7, thing8);

        Box listBox = new Box(10242, thingList);
        Box listBox1 = new Box(90824, thingList1);
        List<Box> boxList = new ArrayList<>();
        boxList.add(listBox);
        boxList.add(listBox1);

        boxList.stream()
                .map(Box::getThings)
                .flatMap(Collection::stream)
                .filter(Thing::isFragile)
                .peek(Thing::addExtraPacking)
                .forEach(System.out::println);
    }

}
