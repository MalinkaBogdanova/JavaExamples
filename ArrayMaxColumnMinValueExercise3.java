package firstClasses.core;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class ArrayMaxColumnMinValueExercise3 {
    /*
    2 4 5
    3 5 7
    1 12 9
    Print the min number from Matrix
    From the same column where the min value is try to take out the max value(the output is 4)
     */
    public static void main(String[] args) {
        int add[][]={{2,4,5},{3,5,7},{1,12,9}};
        int min = add[0][0];
        int columnMin = 0;
        //min number
        //identify the column of min value-j
        //find the max number in that column 
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                if(min>add[i][j]){
                    min = add[i][j];
                    columnMin = j;
                }
            }
        }
       
        System.out.println(("1) min = ")+min);
        System.out.println("2) columnMin ="+columnMin);

        int max = add[0][columnMin];

        for (int k = 0; k < 3 ; k++) {
            if (max < add[k][columnMin]){
                    max=add[k][columnMin];
                }
            }
        System.out.println("3) max ="+ max);
        }

    }

