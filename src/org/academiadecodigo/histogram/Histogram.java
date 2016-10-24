package org.academiadecodigo.histogram;

import java.util.Iterator;
import java.util.Map;
import java.util.*;

/**
 * Created by codecadet on 21/10/16.
 */
public class Histogram {


    Map<String, Integer> map;

    public Histogram() {
        this.map = new TreeMap<>();
    }

    public void populateMap(String text) {

        String[] newText = splitString(text);

        for (int i = 0; i < newText.length; i++) {
            map.put(newText[i], map.containsKey(newText[i]) ? map.get(newText[i]) + 1 : 1 );
        }
    }

    public void populateOP(String text){

        String[] newText = splitString(text);

        for (int i = 0; i < newText.length; map.put(newText[i], map.containsKey(newText[i]) ? map.get(newText[i]) + 1 : 1 ), i++);


    }

    public void printMap() {
        System.out.println(this.map);
    }

    public String[] splitString(String text) {

        String[] splitText = text.split(" ");

        return splitText;
    }
}
