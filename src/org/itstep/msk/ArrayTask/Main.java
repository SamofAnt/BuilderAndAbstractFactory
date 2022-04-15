package org.itstep.msk.ArrayTask;

public class Main {
    public static boolean findSum(int[] arr, int num){
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == num)
                    return true;
            }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {1,7,9, 2,3};
        System.out.println(findSum(arr, 10));
    }
}
