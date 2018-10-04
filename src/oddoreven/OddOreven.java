/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;
import java.util.Scanner;
public class OddOreven {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        if(n%2==0){
        System.out.println(n+"is a even number");
    }
       else{
                System.out.println(n+"is a odd number");
                }
    }
    
}
