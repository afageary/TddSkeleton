package com.develogical;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class RecentlyUsedListTest {

    @Test
    public void emptyWhenInitialized() {
        RecentlyUsedList list = new RecentlyUsedList();
        assertTrue(list.isEmpty());

    }
}
