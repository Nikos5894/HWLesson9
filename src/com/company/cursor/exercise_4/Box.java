package com.company.cursor.exercise_4;

import java.util.Arrays;

public class Box {
    public static int count = 0;
    private int id;
    private Thing[] things;

    public Box() {
        this.things = null;
    }

    public Box(int id, Thing[] things) {
        this.id = id;
        this.things = things;
    }

    public Thing[] getThings() {
        return things;
    }

    public void setThings(Thing[] things) {
        this.things = things;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Thing getThing() {
        if (count > getThings().length) {
            count = 0;
        }
        Thing[] things = getThings();
        Thing thing = things[count];
        count++;

        return thing;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", things=" + Arrays.toString(things) +
                '}';
    }
}
