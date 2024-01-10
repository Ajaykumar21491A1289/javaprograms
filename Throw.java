public class Throw {
   public static void main(String args[]){
    int age=15;
    if(age<18)
    {
        throw new ArithmeticException("not Eligible");
    }
    else{
        System.out.println("eligible to vote");
    }
   } 
}
