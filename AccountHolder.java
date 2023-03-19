class AccountHolder{
    private String Fname;
    private String Lname;
    private String Pass;
    private String accNumber;
    private Double bal=1000.00;

    public AccountHolder(String Fname ,String Lname, String Pass,String accNumber)
    {
        this.Fname=Fname;
        this.Lname=Lname;
        this.Pass=Pass;
        this.accNumber=accNumber;
       
        
    }

    public  AccountHolder(String accNumber)
    {
        this.accNumber=accNumber;
    }
    public  AccountHolder()
    {
        
    }

    public void setBal(Double bal)
    {
        this.bal=bal;
      
    }
    
    public Double getBal(){

        return bal;

    }

    public String getFname()
    {
        return Fname;
    }
      public String getLname()
    {
        return Lname;
    }
      public String getPass()
    {
        return Pass;
    }
    public String getAccNumber()
    {
        return accNumber;
    }


}