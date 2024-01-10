class Voter 
{ 
 final int attain_age=18; 
 void status(int age)
 { 
 if (age>=attain_age) 
 System.out.println("Eligible to vote");
 else 
 System.out.println("NOT Eligible to vote");
 } 
} 
public class Finalkeyword
{ 
 public static void main(String args[]) 
 { 
 Voter ramu= new Voter(); 
 ramu.status(25);
 } 
} 
