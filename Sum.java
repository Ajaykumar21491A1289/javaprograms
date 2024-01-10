import java.util.Scanner;
class Arrayadd{
public static void main(String args[]){
int sz,sz1,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter size of array 1: ");
sz=s.nextInt();
Scanner s1=new Scanner(System.in);
System.out.println("enter the size of an array 2");
sz1=s1.nextInt();
int ary[][]=new int[sz][sz];
int ary2[][]=new int[sz1][sz1];
int ary3[][]=new int[20][20];
System.out.println("enter " +(sz*sz)+" elements in array1: ");
for(i=0;i<sz;i++)
{
    for(j=0;j<sz;j++)
    {
        ary[i][j]=s.nextInt();
        }
}
System.out.println("enter "+(sz1*sz1)+" elements in array 2: ");
for(i=0;i<sz1;i++){
    for(j=0;j<sz1;j++){
        ary2[i][j]=s1.nextInt();
    }
}
System.out.println("1st array elements are: ");
for(i=0;i<sz;i++)
{
    for(j=0;j<sz;j++){
         System.out.print(ary[i][j]+" ");
    }
    System.out.println();
}
System.out.println("2nd array elements are: ");
for(i=0;i<sz1;i++)
{
    for(j=0;j<sz1;j++){
         System.out.print(ary2[i][j]+" ");
    }
    System.out.println();
}
System.out.println("ADDITION OF TWO MATRIX");
if(sz==sz1){
for(i=0;i<sz;i++)
{
    for(j=0;j<sz;j++){
       ary3[i][j]=ary[i][j]+ary2[i][j];
    }
    
}
}
System.out.println("the array elements after addition");
for(i=0;i<sz1;i++)
{
    for(j=0;j<sz1;j++){
         System.out.print(ary3[i][j]+" ");
    }
    System.out.println();
}
}
}