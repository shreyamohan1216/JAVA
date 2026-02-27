package exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=null;//shld be always initialized to null
        String str;
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter and data:");
            str=br.readLine();
            System.out.println(str);
        }catch(Exception e){
            br.close();
        }
    }
}
//BUfferReader-to take in input values it also is a keyword