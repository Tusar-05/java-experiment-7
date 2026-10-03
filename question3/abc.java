import pack.test;
public class abc{
    public static void main(String args[]){
        test ob = new test();
        int a=10,b= 20,c,d,e,f;
        c=ob.mul(a,b);
        d=ob.add(a,b);
        e=ob.div(a,b);
        f=ob.sub(a,b);
        System.out.println("mul="+c);
        System.out.println("add="+d);
        System.out.println("div="+e);
        System.out.println("sub="+f);
    }
}