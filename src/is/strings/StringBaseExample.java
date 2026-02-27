package is.strings;

public class StringBaseExample {
    public static void main(String[] args){
        char[]letters={'S','I','R','I'};
        //String name=letters.toString();//Wrapper class
        String name=new String (letters);
        System.out.println(name);
        String jumbled="Surabhi1Is1From1ISE1B1Section";
        //{"Surabhi","Is","From,"B","section"}
        String[]words=jumbled.split("1");
        System.out.println(words[3]);
        for(Object o:words){
            System.out.print(o+" ");
        }
        System.out.println();
        String data="   SNPSU ISE   ";
        System.out.println(data.trim());//trim is used to cancel out the spaces in beginning and end
    }
}
