package firstClasses.core;
//reverse the string and print it
public class reverseStringPrint {
    public static void main(String[] args) {
        String m = "Malinka";
        String t = "";

        for(int i=m.length()-1; i>=0;i--){
           t=t+(m.charAt(i));

        }
        System.out.println(t);


    }
}
