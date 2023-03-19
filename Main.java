import java.util.*;
public class Main {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.print("Enter String: ");
                String str = input.nextLine();

                if (isPalindrome(str)) {
                    System.out.println("THAT IS A PALINDROME!");
                } else {
                    System.out.println("NOT A PALINDROME!");
                }
                //The isPalindrome method checks whether the string which will be inputted is a palindrome or no
                //It does this by using stack that compares first half and second half of the string

            }

            public static boolean isPalindrome(String str) {
        //isPalindrome method creates the stack object to store the first half of the string
                Stack<Character> stack = new Stack<>();
                int length = str.length(); //Length calculated

                for (int i = 0; i < length / 2; i++) {
                    stack.push(str.charAt(i));
                //The first half of the input string is pushed onto the stack
                    //Using for loop that iterates from the beginning of the string to the middle of the string.
                }

                for (int i = length / 2 + length % 2; i < length; i++) {
                    if (stack.isEmpty()) {
                        return false;
                        //If the stack is empty before the end of the string is reached, the input string is not a palindrome
                        // the method returns false.
                    }
                    if (stack.pop() != str.charAt(i)) {
                        return false;
                        //If the top element of the stack is not equal to the current character of the string,
                        // the input string is not a palindrome and
                        // the method returns false.
                    }
                }
                 return true;
                //If the stack is not empty and all characters are matched, the input string is a palindrome
                // the method returns true.
    }
}
