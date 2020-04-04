package firstClasses.core;

public class ArrayMinNumberExercise1 {
    /*
    2 4 5
    3 4 0
    1 2 9
    Print the min number from Matrix
      */
    public static void main(String[] args) {
       int abc[][] = {{2, 4, 5}, {3, 4, 0}, {1, 2, 9}};
        int min = abc[0][0];// assuming that the first value is the smallest
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min)//2
                {
                     min = abc[i][j];
                }
            }
        }
        System.out.println(min);

    }
}