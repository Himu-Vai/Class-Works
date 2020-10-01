
package pkgclass.works;

import java.util.Scanner;


public class Temp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int temp;
        System.out.println("Enter the temperature: ");
        temp=input.nextInt();
        
        if(temp<0)
        {
            System.out.println("ICE");
        }
        else if(temp>=0 && temp<=100)
        {
            System.out.println("WATER");
        }
        else if(temp>100)
        {
            System.out.println("STEM");
        }
        else
        {
            System.out.println("Invalid");
        }
                
    }
    
}
