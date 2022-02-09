package com.company.javaprog;
//Interface program
    interface Animal{
        default void say(){
            System.out.println("This is Inheritance Demo Program");
        }
        // Abstract method
        void bark();
    }
    public class DemoInterface implements Animal{

        @Override
        public void bark() {
            System.out.println("Dog barks!");
        }
        public static void main(String[] args) {
            DemoInterface obj1 = new DemoInterface();
            obj1.bark();
            obj1.say();

        }
    }

