package is.oops.staticExample;

public class Account {
    int accountNo;
    static int totalAccounts;
    Account(){
        totalAccounts++;
        accountNo=totalAccounts;
    }
    static void showTotalAccounts(){
        System.out.println("Total Accounts:"+totalAccounts);
    }
}
class StaticExample{
    public static void main(String[] args){
        new Account();
        new Account();
        new Account();//this is an objet syntax if u do need the object back u can declare it like this if needed we shld follow the actual syntax
        Account.showTotalAccounts();
    }
}
