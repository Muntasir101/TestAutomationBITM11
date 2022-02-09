package Rough;

import sun.rmi.transport.proxy.RMISocketInfo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //Creating a list
        List <String> list=new ArrayList<String>();

        //Adding data
        list.add("Mr.John");
        list.add("Mr.Smith");
       list.add("Mr.Kevin");

        System.out.println("Old List:" +list); //[Mr.John, Mr.Smith, Mr.Kevin]
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        list.set(1,"Superman");
        System.out.println("New List" +list);

        for (String userName:list){
            System.out.println(userName);
        }


    }
}
