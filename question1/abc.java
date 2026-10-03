//Q1 . write a program to create a package and include a class inside it.
//  Demonstrate how to compile and run the package program
import pack.test;
public class abc{
    public static void main(String args[]){
        test ob = new test();
        int a=10,b= 20,c;
        c=ob.cal(a,b);
        System.out.println("mul="+c);
    }
}