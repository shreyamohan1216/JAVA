package is.oops.thisKeywordExample;

public class Demo {
    //this keyword refers to current class members
    String i;//instance variable
    void change(String i){
        this.i=i;//->To remove ambiguity(confusion)

    }
    void display() {
        System.out.println("The Value of i is:" + i);

    }
public static void main(String[]args){
    Demo d= new Demo();
    d.change("ISE");
    d.display();
    }
}
