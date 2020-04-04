package firstClasses.core;

import java.lang.reflect.Array;

public class ArraySortSwapLogicExercise4 {
    public static void main(String[] args) {
        int a[]={2,6,1,4,9};// sort the numbers in ascending order
       // int k;
        for (int i = 0; i < 5; i++) {

            for (int j =i+1; j < 5; j++) {//j will start from i+1 so to compare
                if (a[i]>a[j]){
                    //replace it
//                    k=a[i];
//                    a[i]=a[j];
//                    a[j]=k;
                    a[i]=a[i]+a[j];

                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];

                }
            }

        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(a[i]);

        }
        /*
        swap it without a virable
         int a =1;
        int b=3;
        a=a+b //1+3//4
        b=a-b //4-3//1
        a=a-b //4-1//3
         */


      
    }
}
