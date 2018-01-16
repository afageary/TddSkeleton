package com.develogical;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {

    @Test
    public void emptyWhenInitialized() {
        RecentlyUsedList list = new RecentlyUsedList();
        assertTrue(list.isEmpty());

    }
    @Test
    public void addToList() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(123);
        assertFalse(list.isEmpty());

    }

    @Test
    public void getFromList(){
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(1);
        assertThat(1,equalTo(list.get(0)));

    }

    @Test
    public void mostRecentItemonTop() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(5);
        list.add(7);
        list.add(10);
        assertThat(10, equalTo(list.get(0)));
    }

}
