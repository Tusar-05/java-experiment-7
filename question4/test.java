public class test{
    public static void main(String args[]){
        int a=10,b=0,c;
        int d[]= new int[3];
        d[0]=10;
        d[1]=20;
        d[2]=20;
        try{
            int s=a/b;
            System.out.println(s);
            System.out.println("the index 4 value"+d[4]);
        }
        catch(ArithmeticException e){
            System.out.println("Zero can be for demo");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("dont try out of bounds");
        }
        finally{
            System.out.println("I am ready to hanfle ant error");
        }

    }
}