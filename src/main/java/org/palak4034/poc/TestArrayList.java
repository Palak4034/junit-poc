package org.palak4034.poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestArrayList
{

    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<String>();
        
        
        System.out.println("strings size originally : " + strings.size());
       // System.out.println("Eighty-Ninth Element is : " + strings.get(89));   
        System.out.println("Size of strings now is : " + strings.size());
        
        
        
        Map<String, String> stringsMap = new HashMap<String, String>();
        System.out.println("Map size is : " + stringsMap.size());
        
        System.out.println("Lets get an element in map : " + stringsMap.get("Nitin"));
        
    }

}
