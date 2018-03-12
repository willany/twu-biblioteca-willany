package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> menuList = new ArrayList<>();


    public void add(String menuItem){
        menuList.add(menuItem);
    }

    public String menuList(){
       String menuOptions = String.join("\n", menuList);
       return menuOptions;
    }



}
