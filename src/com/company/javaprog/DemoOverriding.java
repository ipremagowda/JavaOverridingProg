package com.company.javaprog;
//Method Overriding Program

    class A{
        public void meth1(){
            System.out.println(" method 1 of class A");
        }
    }

    class B extends A{
        @Override
        public void meth1(){
            System.out.println("method 1 of class B");
        }


    }
public class DemoOverriding {
        public static void main(String[] args) {
            A a = new A();
            a.meth1();

            B b = new B();
            b.meth1();
        }
    }


