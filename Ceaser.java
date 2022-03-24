import java.util.*;

public class Ceaser {
   public static void main(String[] args) {
       //Creates input
       String PostCipher = "";
       Scanner scan = new Scanner (System.in);
       String alpha = "abcdefghijklmnopqrstuvwxyz";
       //gains information
       System.out.println("Enter the String you would like to encrypt.");
       String PreCipher = scan.nextLine();

       System.out.println("How many charecters should the string be ciphered by.");
       int change = scan.nextInt();
       //creates output
       for(int i = 0; i<PreCipher.length(); i++){
            int temp = alpha.indexOf(PreCipher.charAt(i));
            temp=temp+change;
            temp=temp%26;
            PostCipher += alpha.charAt(temp);
       }
       System.out.println("Ciphered String: " + PostCipher);
   } 
}
