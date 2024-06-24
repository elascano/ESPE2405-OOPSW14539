import java.util.Scanner;
/**
 * Program that reads an integer N and displays the multiplication table of that number.
 * @author Leydi
 */
public class MultiplyTable {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");                                                         
        n = sc.nextInt();
        System.out.println("Table of the " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                
        }
    }
}