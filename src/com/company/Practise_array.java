package com.company;

public class Practise_array {
    public static void main(String[] args) {
      /*  float sum=0;
        float []marks={1.2f,1.3f,1.4f,1.5f};
//        for (float mark : marks)
        for(int i=0;i<marks.length;i++)
        {
//            sum = sum + mark;
            sum=sum+marks[i];
        }
        System.out.println(sum);
        //practice problem 2
        float []marks={1.2f,1.3f,1.4f,1.5f};
        float num=1.8f;
        boolean isInArray = false;
//        for(int i=0;i<marks.length;i++)
        for(float mark:marks)
        {
//            if(num==marks[i])
            if(num==mark)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Value present in arrray");
        }
        else{
            System.out.println("Not present in array");
        }
     //practice problem 3
        int [][]mat1={{1,2,3},
                     {4,5,6}};
        int [][]mat2={{1,2,3},
                     {4,5,6}};
        int [][]result={{0,0,0},
                       {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++) {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print("["+result[i][j]+"]"+" ");
            }
//            System.out.println(" ");
        }
        for(int i=0;i<mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                System.out.print("[" + result[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
//        problem 4 to reverse a array
        int[] arr={1,2,3,4,5,6};
        int l=arr.length,temp;
//        int l=arr.length/2,n=arr.length;
//        int temp;
        int n=Math.floorDiv(l,2);
//        System.out.println(n);
        for(int i=0;i<n;i++)
        {
           temp=arr[i];
           arr[i]=arr[l-i-1];
           arr[l-i-1]=temp;
        }
//        for(int element:arr)
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
      //problem 5
        int[] arr={1,2,3,444,5656,6};
        int max=0;
//        int min=0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("the value of max is:-"+"("+max+")");
//        System.out.println("the value of max is:-"+"("+max+")");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);*/
        int[] arr={1,2,3,444,5656,6};
        

    }
}
