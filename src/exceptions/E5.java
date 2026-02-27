package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class E5 {
    public static void main(String[] args)throws IOException {
        String str;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){//try()-it is used to call the resources without using catch and finally
            System.out.println("Enter and data:");
            str=br.readLine();
            System.out.println(str);
            br.close();
        }
    }
}
/*if we use br.close(); is used it shows redundant close how?---because BufferedReader automatically closes
to check press ctrl and click on BufferedReader,ctrl Reader,ctrl Closeable it shows it is automatically closed*/
