package com.develogical;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class RecentlyUsedList {

    private ArrayList list;

    public RecentlyUsedList(){
        list = new ArrayList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(int i) {
        ArrayList copy = new ArrayList();
        copy.add(i);
        copy.addAll(list);
        list = copy;
    }

    public <T> T get(int i) {
        return (T)list.get(i);
    }
}
