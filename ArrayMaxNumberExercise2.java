package firstClasses.core;

public class ArrayMaxNumberExercise2 {
        /*
    2 4 5
    3 4 7
    1 2 9
    Print the max number from Matrix
     */
        public static void main(String[] args) {
            int abc[][]={{2,4,5},{3,4,11},{1,2,9}};
            int max = abc[0][0];//assuming the first value is the max
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (abc[i][j]>max){
                        max=abc[i][j];
                    }
                }
            }
            System.out.println(max);
        }
}
