package vector;

import java.util.Locale;
import java.util.Scanner;

import vector.entities.Product;

public class Program {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        sc.close();
    }    
    
}
