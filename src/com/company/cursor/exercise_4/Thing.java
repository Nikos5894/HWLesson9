package com.company.cursor.exercise_4;

public class Thing {
    private String name;
    private int id;
    private boolean isFragile;

    public Thing() {
        this.isFragile = false;
    }

    public Thing(String name, int id) {
        this.name = name;
        this.id = id;
        this.isFragile = false;
    }

    public Thing(String name, int id, boolean isFragile) {
        this.name = name;
        this.id = id;
        this.isFragile = isFragile;
    }

    public boolean addExtraPacking() {
        if (!isFragile()) return false;
        Protector.call(getName(), getId());
        return true;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isFragile=" + isFragile +
                '}';
    }
}
