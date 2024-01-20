import java.util.Scanner;

public class removechar {
    public static void main(String[] args) {
        
//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

        Scanner s2 = new Scanner(System.in);
        String email = s2.next();
        String userName = "";

        for(int i=0; i<email.length(); i++){
            if (email.charAt(i)=='@') {
                break;
            }else{
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
