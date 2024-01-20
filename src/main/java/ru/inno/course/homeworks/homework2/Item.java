package ru.inno.course.homeworks.homework2;

public class Item {
    String name;
    String article;
    double price;
    int quantity;
    double amount;
    String color;


    public Item(String name, String article, int quantity) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
        this.price = 0;
        this.amount = 0;
    }
    public void print(){
        //System.out.println("Артикул - Название - Цена - Количество - [Цвет]");
        if (this.color == null || this.color.isEmpty())
            System.out.printf("%s - %s - %s - %s\n", this.article, this.name, this.price, this.quantity);
        else
            System.out.printf("%s - %s - %s - %s - %s\n", this.article, this.name, this.price, this.quantity, this.color);
    }
    public void sum() {
        this.amount = this.price * this.quantity;
        //System.out.println("Подитог: " + this.amount + "\n");
    }
}
