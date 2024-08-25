package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) { // Index starts at 0, so index 2 is the 3rd element
            String word = sourceList.get(i);
            resultList.add(word);
            resultList.add(word);
        }
        return resultList;
    }
}
