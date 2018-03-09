package com.twu.biblioteca;

import java.util.ArrayList;

public class Painel {
    private ArrayList<Menu> menus = new ArrayList<>();

    public void populateMenu(){
        menus.add(new Menu(1, "List Books", "listAll"));
    }

    public String chooseAnOption(int number){
        System.out.println(menus.contains(number));
        if(!menus.contains(number)){
            return "Select a valid option!";
        }else {
            return "";
        }
    }


}
