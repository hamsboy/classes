
/**
 * Write a description of class Student here.
 *
 * @author (Hamidou diallo)
 * @version (Homework 4)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String id;
    private boolean cs110;
    private boolean cs142;
    private boolean cs143;
    private double balance;
    
    
    private final int CREDITS=5;
    private final int CREDIT_PRICE=110;
    
    //Constructors

    /**
     * Constructor for objects of class Student
     * 
     */
    public Student(String firstName,String lastName,String id){
        this(firstName,lastName,id,false,false,false);
    }
    public Student(String firstName,String lastName,String id,boolean cs110,boolean cs142,boolean cs143)
    {
       if (firstName.equals("") || lastName.equals("") || id.equals("")){
           throw new IllegalArgumentException("the Student Name or id should not be empty");}
       this.firstName=firstName;
       this.lastName=lastName;
       this.id=id;
       this.cs110=cs110;
       this.cs142=cs142;
       this.cs143=cs143;

       setCS110(cs110);
       setCS142(cs142);
       setCS143(cs143);
        
    }

    
    
    //Accessors
    public String getFirstName( ){
        return this.firstName;
        
    }
    
    public String getLastName(){
        return lastName;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    public boolean getCSC110(){
        return this.cs110;
    }
    
    public boolean getCSC142(){
        return this.cs142;
        
    }
    
    
    public boolean getCSC143(){
        return this.cs143;
    }
    
    public double getBalance(){
        balance=CREDITS*CREDIT_PRICE;
        return balance;
    }
        
    //Mutators
    public void setCS110(boolean cs110){
        this.cs110=cs110;
        if (cs110){
            cs142=false;
            cs143=false;}
    }
    
    public void setCS142(boolean cs142){
         this.cs142=cs142;
         if (cs142){
             cs110=false;
             cs143=false;
            }
    }
    
    public void setCS143(boolean cs143){
         this.cs143=cs143;
         if (cs143){
             cs110=false;
             cs142=false;}
    }
    
    /**
     * this method called tostring() is to make the information readalble from the constuctor
     *
     * @param  
     * @return    infomation
     */
    

    public String toString(){
        String course="CSC110";
        if (this.cs142) course="CS142";
        else if (this.cs143) course="CS143";
        String information="The name:"+ firstName +" " + lastName +"\n";
        information+= "Student ID:" +id + "\n";
        information+= "The actualclass is:"+ course+"\n";
        information+="Number of credit:" + CREDITS + "\n";
        information +="The credit price is:" + CREDIT_PRICE+ "\n";
        information +="The balance is:" + String.format("%.2f",getBalance());
        return information;  
    }
    
    /**
     * the test method to test the student class
     *
     * @param  
     * @return   
     */
   
    public static void test(){
       Student stud= new Student("Hamidou","Diallo","123456789",false,true,false);
       if (!stud.getFirstName().equals("Hamidou")){
 System.out.println("Expected name of Students is: Hamidou ,but found "+ stud.getFirstName());
  }
     if (!stud.getLastName().equals("Diallo")){
 System.out.println("Expected Lastname of Students is: Diallo ,but found "+ stud.getLastName());
 
    }
     if (!stud.getId().equals("123456789")){
 System.out.println("Expected Lastname of Students is: Diallo ,but found "+ stud.getLastName());
} 
}
}