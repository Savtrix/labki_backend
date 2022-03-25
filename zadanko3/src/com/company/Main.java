package com.company;

public class Main {

    static void findIndex(int[] arr, int val ){
        int first = 0;
        int last = arr.length -1;
        int mid = (first+last)/2;
        while( first <= last ){
            if ( arr[mid] < val ){
                first = mid + 1;
            }else if ( arr[mid] == val ){
                System.out.println("index nr: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("not exist!");
        }


    }

    public static void main(String[] args) {
    int[] array = { 4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
        findIndex(array, 11);
    }
}
