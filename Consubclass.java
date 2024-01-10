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
 Rect(int l, int w)
 { 
 length=l; 
 width=w; 
 } 
 void area() 
 { 
 System.out.println(length*width); 
 } 
} 
public class Consubclass
{ 
 public static void main(String args[]) 
 { 
 Rect school=new Rect(15,10);
 
 school.display(); 
 school.area(); 
 } 
}
    

