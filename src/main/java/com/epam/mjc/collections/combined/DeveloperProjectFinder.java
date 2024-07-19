package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new LinkedList<>();
        Set<String> keySet = projects.keySet();
        for (String s : keySet) {
            if (projects.get(s).contains(developer)) result.add(s);
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return -1;
                else if (o1.length() < o2.length()) {
                    return 1;
                }
                if (o1.length() == o2.length()) {
                    if (o1.compareTo(o2) > 0) return -1;
                    if (o1.compareTo(o2) < 0) return 1;

                }
                return 0;

            }
        };

        result.sort(comparator);
        return result;
    }
}
