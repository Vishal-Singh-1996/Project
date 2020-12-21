package com.company;

public class cwh_26_array {
    public static void main(String[] args) {
        int[]marks={1,2,3,4,5,6};
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("print array using for-each loop");
        for(int element:marks)
        {
            System.out.println(element);
        }
        System.out.println("Print array in reverse order");
        for(int i=marks.length-1; i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}
