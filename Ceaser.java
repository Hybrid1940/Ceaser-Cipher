import java.util.*;
import java.io.*;
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
            String val = "" + PreCipher.charAt(i);
            if(alpha.contains(val)==true){
                temp=temp+change;
                temp=temp%26;
                while(temp<0){
                    temp=temp+26;
                }
                PostCipher += alpha.charAt(temp);
            }else{
                PostCipher+=PreCipher.charAt(i);
            }
       }
       System.out.println("Ciphered String: " + PostCipher);
   } 
}
