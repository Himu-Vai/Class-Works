
package pkgclass.works;


public class FindSum {
    public static void main(String args[]) 
    {
         int i,sum=0,a=0;
         for(i=100;i<=200;i++)
         {
             if(i%7==0)
             {
                 a++;
                 sum=sum+i;
             }
         }
         
         

         
    System.out.print("Total Number: "+a+"\nSum: "+sum);

    }
    
}
