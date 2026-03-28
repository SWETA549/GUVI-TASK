package task2;


import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class Java22{

    
    static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter PID, Price, Quantity:");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        
        Product maxProduct = products[0];
        for (Product p : products) {
            if (p.price > maxProduct.price) {
                maxProduct = p;
            }
        }

        System.out.println("Product with highest price PID: " + maxProduct.pid);

        
        double total = calculateTotal(products);
        System.out.println("Total amount spent: " + total);
    }
}
