package com.develogical;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class RecentlyUsedList {
    private ArrayList<Integer> list;

    public RecentlyUsedList(){
        list = new ArrayList();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(int item) {
        if(list.contains(item)) {
            list.remove(new Integer(item));
        }
        list.add(0,item);
    }

    public <T> T get(int i) {
        return (T)list.get(i);
    }

    public int size() {
        return list.size();
    }
}
