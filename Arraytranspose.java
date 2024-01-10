import java.util.Scanner;
class Arraytranspose{
public static void main(String args[]){
int sz,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter size of array 1: ");
sz=s.nextInt();
int ary[][]=new int[sz][sz];
int ary1[][]=new int[20][20];
System.out.println("enter " +(sz*sz)+" elements in array1: ");
for(i=0;i<sz;i++)
{
    for(j=0;j<sz;j++)
    {
        ary[i][j]=s.nextInt();
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

System.out.println("TRANSPOSE OF A MATRIX IS");
for(i=0;i<sz;i++)
{
    for(j=0;j<sz;j++){
        ary1[i][j]=ary[j][i];
       }
    
}
System.out.println("the array elements after Transpose");
for(i=0;i<sz;i++)
{
    for(j=0;j<sz;j++){
         System.out.print(ary1[i][j]+" ");
    }
    System.out.println();
}
}
}