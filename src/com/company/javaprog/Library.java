package com.company.javaprog;

public class Library {
    String name;
    public void Department() {
        System.out.println("computerScience");
        System.out.println("Electronics Engineering");
        System.out.println("Mathematics");

    }
}
class Book extends Library {
    public void display() {
        System.out.println("Name is "+ name);
    }
}
class Main {
    public static void main(String[] args) {
        Book B1= new Book();
        B1.name = "Prema";
        B1.Department();
        B1.display();
    }
}

