package com.company.javaprog;

public class DemoSwtich {

        public static void main(String args[]) {
       int Day = 4;
            switch (Day) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;

                default:
                    System.out.println("Invalid Choice. Enter a no between 1 and 5");
                    break;
            }
        }
    }

