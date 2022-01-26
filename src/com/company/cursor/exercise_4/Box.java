package com.company.cursor.exercise_4;

import java.util.Arrays;
import java.util.List;

public class Box {
    public static int count = 0;
    private int id;
    private List<Thing> things;

    public Box() {
        this.things = null;
    }

    public Box(int id, List<Thing> things) {
        this.id = id;
        this.things = things;
    }

    public List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Thing getThing() {
        if (count > getThings().size()) {
            count = 0;
        }
        List<Thing> thingList = getThings();
        Thing thing = thingList.get(count);
        count++;

        return thing;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", things=" + Arrays.toString(new List[]{things}) +
                '}';
    }
}
