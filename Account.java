
import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;

class Account{
    Double chBal;
    Double amt;
    int k,t,n;
     int sec;
    String tamt1;
    Double Bal;
    String userAcc;
    double tamt;
    

    public String accType="Saving Account",accNumber;



AccountHolder ac=new AccountHolder();
BankTransaction bt=new BankTransaction();

    Scanner sc1=new Scanner(System.in);
    BankAtm batm=new BankAtm();

    
    public  Double CheckBal()
    {
        int abc=-1;
         Bal=ac.getBal();
        System.out.println(Bal);
        
        
        return ac.getBal();
    }

    public Double Withdraw()
    {
        
        
       
        chBal=CheckBal();
        System.out.println("Enter the withdraw money: ");
        k=sc1.nextInt();
        if(chBal>1000 && Math.abs(k-chBal)>=1000){

            if(k<chBal)
            {
                chBal-=k;
                ac.setBal(chBal);
                
                bt.History("Withdraw money is : " +k);
              
            }else{
                System.out.println("Balance is not Suffecient");
            }

        }else
        {
            


            System.out.println("You can't withdraw from your fix money(1000 rupees is Fix money)");
        }
      return chBal;
    }

    public Double Deposite()
    {
        
        System.out.println("Enter the the Deposite Amount");
        int abc=-1;
        
        amt=sc1.nextDouble();
        if(amt>0){
            
            Bal+=amt;
            ac.setBal(Bal);
       
            bt.History("Deposite  money is : " +amt);
            
            
            
        }
        
      
       return Bal;
    }
  

 
    


    

    public void transfer(){
        
        System.out.println("Enter the Transfer Amount");
         tamt=sc1.nextInt();
        double chBal=CheckBal();
        
        
        
        
        if(tamt<chBal && Math.abs(tamt-chBal)>=1000)
        {
            
            
            System.out.println("Enter the Account number That you have to send the Money");
            tamt1=sc1.next();

            if(tamt1.equals("787553") || tamt1.equals("826202") )
            {
                userAcc=tamt1;
                chBal=Math.abs(chBal-tamt);
                System.out.println(chBal);
                ac.setBal(chBal);
               
                bt.History("Transfer money is : " +tamt+"to the "+tamt1);
            }else{
                System.out.println("Please check Account Number");
                transfer();
            }
           
            
            
            
        }else{
            System.out.println("You can't Transfer Money Because You don't have suffecint Balance at The Time,Please Kindly Check Your Balnce,Thank you");
    
        }
    
  
    }

   
}