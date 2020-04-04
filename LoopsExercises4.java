package firstClasses.core;

public class LoopsExercises4 {
    public static void main(String[] args) {
        /*
          3
          6 9
          12 15 18
          */
        int k = 3;

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j < i ; j++) {

                System.out.print( k + " " );
                k=k+3;

            }

            System.out.println( );

        }
    }
}
