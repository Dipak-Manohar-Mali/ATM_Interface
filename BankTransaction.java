import java.util.*;



public class BankTransaction{

AccountHolder ach=new AccountHolder();


static ArrayList<String> make=new ArrayList<>();




public static void History(String str)
{

    make.add(str);
    
    
    
}

public static void Historydisplay(){
    
    System.out.println("Transaction history:");
    
    for (String transaction : make) {
        System.out.println(transaction);
        
    }


}


}