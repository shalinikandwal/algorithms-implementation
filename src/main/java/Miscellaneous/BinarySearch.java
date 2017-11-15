package Miscellaneous;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] arr, int ele) {
        Arrays.sort (arr);
        int low = 0;
        int high = arr.length - 1;

        while (low  + 1 < high ) {
            int mid = (high - low)/2 + low;

            System.out.println("low : " + low + " mid : " + mid + " high : " + high + " arr [mid] : " + arr [mid]);

            if (low == mid) break;
            if (arr[mid] <= ele) low = mid;
            else high = mid - 1;
        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int [] { 1, 1, 1, 2, 4, 6, 10 }, 1));
    }
}
