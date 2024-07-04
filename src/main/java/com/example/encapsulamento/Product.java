package com.example.encapsulamento;

public class Product {
    private String name;
    private double price;
    private int quantity;
    //construtor colocamos depois dos atributos e antes dos metodos

    //construtor
    public Product(String name, double price, int quantity){
        // forçando a classe a receber dados no momento da instaciação.
        this.name = name;
        this.price = price;
        this.quantity = quantity;  //opcional, pois o java inicia objetos,arrays, com 0;
    }

    public Product(String name, double price){
        // forçando a classe a receber dados no momento da instaciação.
        this.name = name;
        this.price = price;
    }
    // getters e setters são feito depois dos construtores.
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){ //getters devem retonar o mesmo valor logico da variavel.
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    //não vamos criar o setQuantity para proteger o objeto produto, de alteraçãoes inconsistentes na quantiddade.
    //a quantidade do produto so pode mudar pela operações entradas e saidas do estoque.
    // assim garantindo a integradade do estoque
    public int getQuantity(){
        return quantity;
    }

    //Metodos
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", price) + "," + quantity + "units, Total: $" + String.format("%.2f", totalValueInStock());
    }
}
