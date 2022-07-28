package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String cName = sc.next();
        System.out.print("Email: ");
        String cEmail = sc.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date cBDate = sdf.parse(sc.next());

        Client client = new Client(cName, cEmail, cBDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();
        Date knowTime = new Date();
        Order order = new Order(knowTime, OrderStatus.valueOf(orderStatus));

        System.out.print("How many items to this order? ");
        int numItems = sc.nextInt();

        for(int i = 1 ; i <= numItems ; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String prodName = sc.next();
            System.out.print("Product price: ");
            double prodPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int prodQuant = sc.nextInt();
            Product prod = new Product(prodName, prodPrice);
            OrderItem item = new OrderItem(prodQuant, prodPrice, prod);
            order.addItem(item);
        }
        System.out.println("ORDER SUMARY");
        System.out.println(order.toString());
        System.out.println(client.toString());
        System.out.println("Order Items: ");
        order.printAll();
        System.out.println("Total price: $" + order.total());
    }
}
