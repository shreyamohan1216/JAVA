package is.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
       String str="madam";
       boolean isPalindrome=true;
       int left=0;
       int right=str.length()-1;//use left and right pointers to check for palindrome questions
       while(left<right){
           if(str.charAt(left)!=str.charAt(right)){
               isPalindrome=false;//if l and r not equal
               break;
           }
           left++;
           right--;
       }
       if(isPalindrome){
           System.out.println("Palindrome.");
       }else{
           System.out.println("Not Palindrome.");
       }
    }
}
