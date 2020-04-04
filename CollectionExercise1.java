package firstClasses.core;

import java.util.ArrayList;

public class CollectionExercise1 {
    public static void main(String[] args) {
        //The Task is to print an unique number and how
        //many times it repeats. I am given with the following array

        int a[]={4,5,5,5,4,6,6,9,4};
        //print unique number from the list - Amazon
        //4 -3, 5 -3 , 6 -2,9-1
        //arrayList concept
        //passing each member from a[] to the ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        //we need kind of container and to check it


        for (int i = 0; i <a.length; i++) {
            int k = 0;
            if(!al.contains(a[i])){//only if it doesnt contain
                al.add(a[i]);
                k++;
                for (int j = i+1; j <a.length; j++) {//to start from the next after 4
                    if(a[i]==a[j]){//if I find matching i am  increment
                        k++;//

                    }

                }
            //   System.out.println(a[i]);
            //    System.out.println(k);
                if (k==1){
                    System.out.println(a[i]+"it is unique number");
                }
            }
        }





    }
}
