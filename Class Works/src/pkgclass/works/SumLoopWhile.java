
package pkgclass.works;


public class SumLoopWhile {
    public static void main(String[] args) {
        int i=100,s=0;
        while(i>=0)
        {
            s=s+i;
            i=i-4;
        }
        System.out.println("Sum is: "+s);
    }
    
}
