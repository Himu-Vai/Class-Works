
package pkgclass.works;


public class SumLoopDo {
    public static void main(String[] args) {
        int i=100,s=0;
        do
        {
            s=s+i;
            i=i-4;
        }while(i>=0);
        System.out.println("Sum is: "+s);
    }
    
}
