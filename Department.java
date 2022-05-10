
/**
 * Write a description of class Department here.
 *
 * @author (Hamiodu Diallo)
 * @version (2/8/2018)
 */
public class Department
{
    
    private final int STUDENT_IN_ONE_CLASS=28;
    private int totalStud110;
    private int totalStud142;
    private int totalStud143;
    private double totalBalance;
    //Constructors
    /**
     *  the empty Constructor
     */
    public Department()
    {
       this(0,0,0,0);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  totalStud110 type int
     * @param totalStud142 type int
     * @param totalStud143 type int
     * @param totalBalance type double
     * @return   
     */
    public   Department(int totalStud110,int totalStud142, int totalStud143,double totalBalnce)
    {   if (totalStud110<0 || totalStud142<0 || totalStud143<0){
        throw new IllegalArgumentException("the number of student in each class should be greatter than Zero");}
        if (totalBalance<0 ) throw new IllegalArgumentException("the total balance should be greatter than zero");
        this.totalStud110=totalStud110;
        this.totalStud142=totalStud142;
        this.totalStud143=totalStud143;
        this.totalBalance=totalBalance;
        
    }
    
    //Accesors
    /**
     * 
     *Accessor methtod getTotalCS110 from DP
     * @param  
     * @return   totalStud110
     */
    public int getTotalCS110()
    {
     
        return totalStud110;
    }
    
    /**
     *  
     *Accessor methtod getTotalCSC42 from DP
     * @param  
     * @return   totalCSC1142
     */
    public int getTotalCS142()
    {
       
        return totalStud142;
    } 

    /**
     *  
     *Accessor methtod getTotalCS143 from DP
     * @param  
     * @return   totalSCSC143
     */
    public int getTotalCS143()
    {
     
        return totalStud143;
    }

    
     /**
     *  
     *Accessor methtod getTotalStudent from DP
     * @param  
     * @return   totalStudent
     */
    public int getTotalStudent()
    {
        int totalStudent= totalStud110+totalStud142+totalStud143;
        return totalStudent;
    }
    
    /**
     *  
     *Accessor methtod getTotalBalance from DP
     * @param  
     * @return   totalBalance
     */
    public double getTotalBalance()
    {
       
        return totalBalance;
    }
    
   


    /**
      
     *Accessor methtod getTotalGr110 from DP
     * @param  
     * @return   totalGr110
     */
    public int getTotalGr110()
    {
       int totalGr110=totalStud110/STUDENT_IN_ONE_CLASS;
       if (totalStud110 % STUDENT_IN_ONE_CLASS !=0) totalGr110++;
        return totalGr110;
    }
 
    /**
     * *Accessor methtod getTotalGr143 from DP
     * @param  
     * @return   totalGr142
     */
    public int getTotalGr142()
    {
       int totalGr142=totalStud142/STUDENT_IN_ONE_CLASS;
       if (totalStud142 % STUDENT_IN_ONE_CLASS !=0) totalGr142++;
        return totalGr142;
    }
    
    /**
     * *Accessor methtod getTotalGr143 from DP
     * @param  
     * @return   totalGr143
     */
    public int getTotalGr143()
    {
       int totalGr143=totalStud143/STUDENT_IN_ONE_CLASS;
       if (totalStud143 % STUDENT_IN_ONE_CLASS !=0) totalGr143++;
        return totalGr143;
    }
    
    public void addStudent(Student newStudent){
        if (newStudent.getCSC110()) totalStud110++;
        else if (newStudent.getCSC142()) totalStud142++;
        else if (newStudent.getCSC143()) totalStud143++;
        totalBalance+=newStudent.getBalance();
}

    /**
     * a method toString to read the informations from DP
     *
     * @param  
     * @return  info
     */
    public String toString()
    {
        String info="The total students in CS110: "+totalStud110 + " which is in " + getTotalGr110()+ " groups.\n";
        info+="The total students in CS142: "+ totalStud142 + " which is in " + getTotalGr142() + " groups.\n";
        info+= "The total Students in CS143: " + totalStud143 + " which is in " +getTotalGr143() + "groups.\n";
        info+= "The total Students of department: " + getTotalStudent() + "\n";
        info+="Total Balance: $" + String.format("%.2f",getTotalBalance()) + "\n";
        return info;
    }

    
    /**
     * This method is called testMethod to test my DP
     * @return    
     */
    public static void testMethod()
    {
        Department testDp= new Department(50,100,150,165000);
        if (testDp.getTotalBalance()!=165000){
            System.out.print("Expected balance 165000, but  found "+ String.format("%.2f",testDp.getTotalBalance()) + "\n");}
        Student newStudent = new Student("Name","985774", "Last",true,false,false);
        testDp.addStudent(newStudent);
        if (testDp.getTotalBalance()!=550){
            System.out.println("Expected balance after adding a student is 165550 but found " + testDp.getTotalBalance());}
        if (testDp.getTotalStudent()!=301){
            System.out.println("Expected total of Students is: 301 ,but found "+ testDp.getTotalStudent());}
        if (testDp.getTotalCS110()!=51){
            System.out.println("Expected total CS110 Students is: 51 ,but found "+ testDp.getTotalCS110());}
        if (testDp.getTotalCS142()!=100){
            System.out.println("Expected total CS142 Students is: 100 ,but found "+ testDp.getTotalCS142());}
        if (testDp.getTotalCS143()!=150){
            System.out.println("Expected totalCS143 Students is: 150 ,but found "+ testDp.getTotalCS143());}
        
        if (testDp.getTotalGr110()!=2){
            System.out.println("Expected total  CS110 groups is: 2 ,but found "+ testDp.getTotalGr110());}
        if (testDp.getTotalGr142()!=4){
            System.out.println("Expected total CS142 groups is: 4 ,but found "+ testDp.getTotalGr142());}
        if (testDp.getTotalGr143()!=6){
            System.out.println("Expected total CS143 groups is: 6 ,but found "+ testDp.getTotalGr143());}
        
        
    }

}
