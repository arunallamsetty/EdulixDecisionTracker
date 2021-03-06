package com.edulix.utils;

import java.util.HashMap;
import java.util.Map;

public class PropertiesUtility {

    public static Map<String, String> addDataToMap(String data, String delim, String subDelim) {
        
        Map<String, String> dataMap = new HashMap<String, String>();
        String[] delimitedDataArray = data.split(delim);
        
        for (int i = 0; i < delimitedDataArray.length; i++) {
            String[] pair = delimitedDataArray[i].trim().split(subDelim);
            
            dataMap.put(pair[0].trim(), pair[1].trim());
        }
        
        return dataMap;
    }
    
}
