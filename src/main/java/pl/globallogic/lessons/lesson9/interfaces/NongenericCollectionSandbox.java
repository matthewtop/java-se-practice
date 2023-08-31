package pl.globallogic.lessons.lesson9.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NongenericCollectionSandbox {
    public static void main(String[] args) {
        List nonGenericNameStorage = new ArrayList();
        nonGenericNameStorage.add("Joe");
        nonGenericNameStorage.add("Jane");
        nonGenericNameStorage.add("Jack");
        //nonGenericNameStorage.add(new Integer(3));
        nonGenericNameStorage.add(new StringBuilder("cos tam"));
        for(Object name:
                nonGenericNameStorage){
            if (name instanceof String)
            System.out.println(((String)name).toUpperCase());
        }
    }
}
