public class Exception {
    public static void main(String args[])
    {
        int n=40,d=0,res;
        try{
            res=n/d;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        }
    }

