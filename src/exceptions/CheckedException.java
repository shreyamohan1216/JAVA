package exceptions;
import java.io.IOException;
public class CheckedException {
    static void readFile()throws IOException{//(Exception/IOException)
        throw new IOException("File not found!");//throws-pass on the info (tucking)and taken care by try catch block
    }

    public static void main(String[] args) {
        try{
            display();
        }catch(IOException e){
            System.out.println(e.getMessage());//prints only message as the o/p-getMessage()
        }
    }
    static void display()throws IOException {
        readFile();
    }
}
//java.io.IOException-fully qualified class name
//for checked exception we always use try catch block mandatory
//the throws keyword doesn't handle the exception it only passes on the info to the calling method
//the calling method has to handle the exception  using try-catch
//the "throws" keyword is written in the method signature(method name)
