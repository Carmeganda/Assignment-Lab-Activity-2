// 5. Palindrome Check

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write a message: ");

            String str = scanner.nextLine() , reverseStr = "";
            int strLength = str.length();

            for (int i = (strLength - 1); i >=0; --i){
                reverseStr = reverseStr + str.charAt(i);
            }
            if (str.toLowerCase().equals(reverseStr.toLowerCase())){
                System.out.println(str + " is a Palindrome String.");
            }
            else{
                System.out.println(str + " is not a Palindrome String.");
            }
        }
    }
}