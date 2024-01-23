package inventory;

import java.util.Scanner;

public class ProductTester {
    Product one = new Product();
    Product two = new Product();
    Product p1 = new Product("Precious_diamond", "17", "sqrt(-1)", "1");
    Product p2 = new Product("Lemon", "12 Filipino pesos", "217,365,423", "2");
    Product p3 = new Product("Pizza_slice", "12 Mexican pesos", "four", "3");
    Product p4 = new Product("Lime", "12 Bolivian pesos", "eleventeen", "4");
    public void main(){
        Scanner in = new Scanner(System.in);
        System.out.println(one);
        System.out.println(two);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
