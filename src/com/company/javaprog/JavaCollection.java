package com.company.javaprog;
import java.util.*;
public class JavaCollection {
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            list.add("Prema");//Adding object in arraylist
            list.add("priya");
            list.add("Pallavi");
            list.add("Padmini");
//Traversing list through Iterator
            Iterator itr=list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            LinkedList<String> al=new LinkedList<String>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Shankar");
            al.add("Ajay");
            Iterator<String> itr1=al.iterator();
            while(itr1.hasNext()){
                System.out.println(itr1.next());
            }

        }
    }

