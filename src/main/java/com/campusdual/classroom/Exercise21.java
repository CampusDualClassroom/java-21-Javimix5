package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("ELEMENT KPRBC");
        hashSet.add("ELEMENT YPBTM");
        hashSet.add("ELEMENT AADXU");
        hashSet.add("ELEMENT RXCGJ");
        hashSet.add("ELEMENT WYMVD");
        hashSet.add("ELEMENT WFGEJ");
        hashSet.add("ELEMENT TYGBS");
        hashSet.add("ELEMENT MAPTK");
        hashSet.add("ELEMENT GJXVE");
        hashSet.add("ELEMENT BAFGL");
        return hashSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("ELEMENT KPRBC");
        treeSet.add("ELEMENT YPBTM");
        treeSet.add("ELEMENT AADXU");
        treeSet.add("ELEMENT RXCGJ");
        treeSet.add("ELEMENT WYMVD");
        treeSet.add("ELEMENT WFGEJ");
        treeSet.add("ELEMENT TYGBS");
        treeSet.add("ELEMENT MAPTK");
        treeSet.add("ELEMENT GJXVE");
        treeSet.add("ELEMENT BAFGL");
        return treeSet;
    }

    private static void printSet(Set<String> customSet) {
for(String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        if (set == null || elementToAdd == null) {
            return false;
        }
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        System.out.println("HashSet:");
        printSet(hashSet);

        System.out.println("\nTreeSet:");
        printSet(treeSet);

        String newElement = "ELEMENT NEW";
        boolean addedToHashSet = addElementToSet(hashSet, newElement);
        boolean addedToTreeSet = addElementToSet(treeSet, newElement);

        System.out.println("\nAdded to HashSet: " + addedToHashSet);
        System.out.println("Added to TreeSet: " + addedToTreeSet);

    }

}
