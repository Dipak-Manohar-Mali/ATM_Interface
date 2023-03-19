import java.util.*;
class BankName{

private String bankName;
private String uid;

public BankName()
{
    bankName="Bank Of Maharastra";
}

public String getName()
{
    return bankName;
}
public String MakeUid()
{
    Random rn=new Random();
		
		String uid="";
		
		for(int i=0;i<6;i++)
		{
		    uid+=(Integer.toString(rn.nextInt(10)));
		}
	
        return uid;
		
}

}