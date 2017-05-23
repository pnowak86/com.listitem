package com.lists;

public class Main {

    public static void main(String[] args) {

        ListItem l1 = new ListItem(null, "kota");
        ListItem l2 = new ListItem(l1, "ma");
        ListItem l3 = new ListItem(l2, "Ala");


        ListItem current = l3;
        while (current != null){
            System.out.println(current.getData());
            current = current.getPrevious();
        }

        ListItemPlus lp1= new ListItemPlus(null,lp3, "x2");
        ListItemPlus lp2 = new ListItemPlus(lp1,lp3,"x");
        ListItemPlus lp3 = new ListItemPlus(lp2, null, "s");

    }
}
