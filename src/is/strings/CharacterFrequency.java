package is.strings;

public class CharacterFrequency {//How many times the letter is repeated
    public static void main(String[] args) {
        System.out.println('a' - 'a');//asci value 65-65
        System.out.println('A' - 'a');//65-97
        System.out.println('A' + 32);//65+32
        System.out.println((char) ('A' + 32));
        System.out.println((char) ('a' - 32));
        String str = "sapthagiri";
        int[] freq = new int[26];//All Alphabets included
        /*pangram -if a sentence all the 26 letters then it is called as pangram
        Eg: A quick brown fox jumps over the lazy dog
         */
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;//index 0++ means A++ that is B then C....
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {//if this statement is not given then it will print values with 0 aswell
                System.out.println((char) (i + 'a') + "->" + freq[i]);
            }
        }
    }
}
//check notes for working