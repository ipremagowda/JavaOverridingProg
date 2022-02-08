package com.company.javaprog;

//Inheritance Program

class Base{
    int x;

    public int getX(){

        return x;

    }
    public void  setX(int x){
        System.out.println("X Value is");
        this.x = x;
    }

    public void Print()
    {
        System.out.println("Welcome to Intellij");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;

    }
}

public class DemoInheritance {
    public static void main(String[] args)
//    creating an object of base class
    {
        Base b = new Base();
        b.Print();
        b.setX(29);
        System.out.println(b.getX());
//
    }
}
