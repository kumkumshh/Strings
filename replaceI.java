import java.util.Scanner;

public class replaceI {
    
    public static void main(String[] args) {
        
        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

        Scanner s1 = new Scanner(System.in);
        String str = s1.next();
        String result = "";

        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)=='e') {
                result += "i";
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
