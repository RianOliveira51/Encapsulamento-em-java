package com.example.encapsulamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class EncapsulamentoApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Product product2 = new Product("Rian", 10, 30);
        System.out.println("Enter product Data: ");
        System.out.println("Nome:");
        String name = sc.nextLine();
        System.out.println("Price:");
        double price = sc.nextDouble();
        Product product = new Product(name,price);

        product.setName("Computdaor");
        System.out.println("Updated name:" + product.getName());
        System.out.println();
        System.out.println("Product data:" + product);
        product.setPrice(1220.00);
        System.out.println("Updated price: " + product.getPrice());
        System.out.println();
        System.out.println("Enter the number of productc to be addred in stock");
        int quanttity = sc.nextInt();
        product.addProducts(quanttity);

        System.out.println();
        System.out.println("Update data:" + product);

        System.out.println();
        System.out.println("Enter number oif products to be removed from stock");
        quanttity = sc.nextInt();
        product.removeProducts(quanttity);

        System.out.println();
        System.out.println("Update data " + product);

        sc.close();
    }

}


