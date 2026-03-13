package Assignment_2;
// a program to demonstrate the difference between String, StringBuilder, and
//StringBuffer
public class Str {

    public static void main(String[] args) {

        String s = "hai";
        s = s + " good morning";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuffer sf = new StringBuffer("He");
        sf.append(" wow");
        System.out.println(sf);
    }
}