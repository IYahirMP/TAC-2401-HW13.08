package com.solvd.laba.computer_repair_service.data_structures;

public class LinkedListTest {
    private static LinkedList<String> test;

    public static void test(){
        test = new LinkedList<>();
        test.add("10");
        test.add("20");
        test.add("30");
        test.add("40");
        test.add("50");
        printList();
        String i = "30";
        test.remove(i);
        printList();
        test.prepend("220");
        printList();
        test.add(2, "550");
        printList();
        test.remove(3);
        printList();
        test.set(3, "990");
        printList();
    }

    public static void printList(){
        for(int i = 0; i < test.size(); i++){
            System.out.println("index " + i + ": " + test.get(i));
        }
        System.out.println("---------------------------------------------------");
    }
}
