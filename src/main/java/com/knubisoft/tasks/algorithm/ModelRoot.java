package com.knubisoft.tasks.algorithm;

import java.util.List;

/**
 * TODO fix model
 *
 * @see json and xml file
 */
public class ModelRoot {

    public List<Item> items;

    public static class Batter {
        public String id;
        public String type;
    }

    public static class Item {
        public int id;
        public String type;
        public String name;
        public double ppu;
        public Batters batters;
        public List<Topping> topping;
    }

    public static class Batters {
        public List<Batter> batter;
    }

    public static class Topping {
        public String id;
        public String type;
    }

}
