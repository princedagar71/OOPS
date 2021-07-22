package com.company;

import java.util.Scanner;

public class ArrayDSA1 {
    public static void main(String[] args){
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n= sc.nextInt();
        System.out.println("Enter Elements:");
        for (int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for (int i=0;i<=n;i++){
           if(max<=a[i])
                max=a[i];
            if (min>=a[i])
                min=a[i];
        }
        System.out.println("Maximum Element:"+max+"\nMinimum Element:"+min);
    }
}
