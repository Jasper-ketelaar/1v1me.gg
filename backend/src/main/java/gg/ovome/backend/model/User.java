package gg.ovome.backend.model;

import java.util.HashMap;
import java.util.HashSet;

public class User {
   private String name;
   private HashMap<String, Integer> scoreForGame;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
