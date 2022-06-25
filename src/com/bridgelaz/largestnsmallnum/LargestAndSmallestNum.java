package com.bridgelaz.largestnsmallnum;

public class LargestAndSmallestNum {

    int arr[] = new int[]{12, 56, 76, 89, 100, 343, 21, 234};
    int smallest = arr[0];
    int largest = arr[0];

    void largest() {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }

    public static void main(String[] args) {
        LargestAndSmallestNum a = new LargestAndSmallestNum();
        a.largest();


    }
}

