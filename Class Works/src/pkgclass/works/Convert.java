
package pkgclass.works;

import java.util.Scanner;


public class Convert {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.println("Enter L,S,E,D or Q");
        ch=input.next().charAt(0);
        
        switch(ch)
        {
            case 'L':
                System.out.println("Load");
                break;
            case 'S':
                System.out.println("Save");
                break;
            case 'E':
                System.out.println("Enter");
                break;
            case 'D':
                System.out.println("Display");
                break;
            case 'Q':
                System.out.println("Quit");
                break;   
            default:
                System.out.println("Not Under Cgoise Option");
                break;
        
        }
    }
    
}
