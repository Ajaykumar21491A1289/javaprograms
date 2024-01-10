// Inheritance 
class Dimensions 
{ 
 double length; 
 double width; 
 void display()
 { 
 System.out.println("Length is: "+length); 
 System.out.println("Width is: "+width); 
 } 
} 
class Rect extends Dimensions 
{ 
 void area()
 { 
 System.out.println(length*width); 
 } 
} 
public class Inheritance
{ 
 public static void main(String args[]) 
 { 
 Rect school=new Rect(); 
 school.length=15; 
 school.width=10; 
 school.display(); 
 school.area(); 
 } 
}

