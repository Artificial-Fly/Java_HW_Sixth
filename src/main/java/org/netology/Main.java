package org.netology;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Hello World", 2026, "Name", "Surname", 4.75,206);
        System.out.println(book.isBig()?"book is big":"book is not big");
        System.out.println(book.matches("ame")?"contains ame":"contains not ame");
        System.out.println("cost: "+book.estimatePrice());
    }
}