package task3;

import java.util.*;

public class FrequencyCounter {
    public Map<String, Integer> countFrequency(List<String> lines){
        Map<String, Integer> frequency = new HashMap<>();
        for(String line : lines){
            String[] words = line.split(" ");
            for(String word : words){
                if(frequency.containsKey(word)){
                    frequency.put(word, frequency.get(word) + 1);
                }
                else{
                    frequency.put(word, 1);
                }
            }
        }
        Map<String, Integer> sortedMap = sortMap(frequency);
        return sortedMap;
    }
    private Map<String, Integer> sortMap(Map<String, Integer> frequency){
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        while(frequency.size() > 0){
            String maxKey = "";
            Integer maxValue = Integer.MIN_VALUE;
            for(var entry : frequency.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            sortedMap.put(maxKey, maxValue);
            frequency.remove(maxKey);
        }
        return sortedMap;
    }


}
