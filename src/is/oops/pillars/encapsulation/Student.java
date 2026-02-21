package is.oops.pillars.encapsulation;
//Accessing
public class Student {
    private int USN;
    private String email;

    //setters->to assign attributes or values
    public void setUSN(int USN) {
        this.USN = USN;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //getters->used to retrieve attributes
    public int getUSN() {
        return this.USN;
    }

    public String getEmail() {
        return this.email;
    }
}
