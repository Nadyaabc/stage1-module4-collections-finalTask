package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        Set<String> keySet =  timetable.keySet();
        List<String> daySchedule = new ArrayList<>();
        for(String s : keySet){
            daySchedule = timetable.get(s);
            Iterator<String> it = daySchedule.listIterator();
            while (it.hasNext()){
                String aLesson = it.next();
                if (!result.contains(aLesson)) result.add(aLesson);
            }

        }
        return result;
    }
}
