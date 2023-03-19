import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;
class BankAtm{

   
public static void main(String arg[])
{
 
String accNumber;
int dh=1;
int ch=-1;
Double bal=0.0;
 String pin;
 
Scanner sc=new Scanner(System.in);
Scanner atk=new Scanner(System.in);
 
AccountHolder ac=new AccountHolder("Dipak","Mali","8262","9087123"); 

BankName bn=new BankName();

BankTransaction bt=new BankTransaction();
AccountHolder tranA=new AccountHolder();
Account acc=new Account();

String name=bn.getName();
System.out.println("Wellcome to "+name+ " ATm Machine\n");


String b=bn.MakeUid();
System.out.println(b);


String kt=sc.nextLine();
System.out.println("user ID "+b);
String id=sc.nextLine();

System.out.println("Enter the User password");
pin=sc.nextLine();


String a=ac.getPass();;


if(pin.equals(a) && id.equals(b))
{
    
    System.out.println("Login Successfully\n");
    
    System.out.println("\nWelcome "+ac.getFname()+" "+ac.getLname());
    System.out.println("\nTo "+bn.getName());
    
    bal=ac.getBal();


    System.out.println("Choose the Option that you want");
    
    while(dh!=0){
    System.out.println("\n 0-For Exit \n1-For History \n 2-For Deposite \n 3-For Withdraw \n 4-For Check Balance \n5-For Transfer ");
    if(sc.hasNextLine()){
        try {
            ch=sc.nextInt();
            
        } catch (NoSuchElementException e) {
           System.out.println(e);
        }
        
    }
        
    
    switch (ch) {

        case 0:
        dh=0;
        System.out.println("Log out from The account");
        break;

        case 1:
           bt.Historydisplay();
            break;
        case 2:
            Double amt=acc.Deposite();
            System.out.println("Amount added Succefully"+acc.amt);
            
            break;
        case 3:
            Double with=acc.Withdraw();
            System.out.println("Your Amount is "+with);
            
            break;
        case 4:
            
            Double bal1=acc.CheckBal();
            System.out.println("Account Balance is: "+bal1);
            break;
        case 5:
            acc.transfer();
            Double bal_2=acc.CheckBal();
            
            break;
        
        default:
        System.out.println("Your choosing wrong option please select Right Option");
        break;
        
       
        
    }
    
    }

    
}else
{
 System.out.println("Password and User id is Wrong");

}

sc.close();;

}



}

