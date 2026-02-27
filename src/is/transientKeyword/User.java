package is.transientKeyword;

import java.io.*;

//to achieve Serializable we implement the Serializable interface
public class User implements Serializable {
    String username="Surabhi";
    transient String password="0614";
}
class TransientDemo{
    public static void main(String[] args)throws Exception {
        User user=new User();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.ser"));
        //converting obj to file so we use ObjectOutputStream to send it to the output or to store it
        oos.writeObject(user);
        oos.close();//till here serialization
        //object to file
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.ser"));
        User user1=(User) ois.readObject();//we have to typecasting means we have to say User
        //till here  deserialization
        //file to object
        System.out.println(user1.username);
        System.out.println(user1.password);
    }
}
//the output we get null because we have used null if int o/p is 0...and so on