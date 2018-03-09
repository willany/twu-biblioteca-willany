package com.twu.biblioteca;

public class Menu {
    private int code;
    private String name;
    private String function;

    public Menu(int code, String name, String function){
        this.code = code;
        this.name = name;
        this.function = function;
    }

    public Menu(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String toString() {
        return this.name + ": " + this.code;
    }
}
