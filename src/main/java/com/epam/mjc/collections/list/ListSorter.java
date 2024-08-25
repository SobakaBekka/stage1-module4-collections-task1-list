package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);

        int value1 = 5 * x1 * x1 + 3;
        int value2 = 5 * x2 * x2 + 3;

        if (value1 == value2) {
            return Integer.compare(x1, x2); // If function values are the same, compare the integers directly
        }

        return Integer.compare(value1, value2); // Otherwise, compare by function values
    }
}
