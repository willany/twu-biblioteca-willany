package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Panel {

    private Messages messages;
    private BookManagement bookManagement;
    private Menu menuOptions;

    public Panel(BookManagement bookManagement, Menu menuOptions) {
        this.bookManagement = bookManagement;
        this.menuOptions = menuOptions;
    }

    public void libraryStart() {
        messages = new Messages();
        System.out.println(messages.showWelcomeMessage());
        chooseOptions();
    }

    public void chooseOptions() {
        String userInput = "";
        while(!userInput.equals("Quit")) {
            System.out.println("------------MENU------------");
            System.out.println(menuOptions.menuList());
            userInput = returnUserOption();
            checkUserInput(userInput);
        }
    }

    public String returnUserOption() {
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public void checkUserInput(String userInput) {
        switch (userInput) {
            case "List Books":
                bookManagement.listAll();
                break;
            case "Checkout Book":
                System.out.println("Please, write the book's title: ");
                String bookToBeCheckedOut = returnUserOption();
                System.out.println(bookManagement.checkoutBook(bookToBeCheckedOut));
                break;
            case "Return Book":
                System.out.println("Please, write the book's title: ");
                String bookToBeCheckedIn = returnUserOption();
                System.out.println(bookManagement.checkInBook(bookToBeCheckedIn));
                break;
            case "Quit":
                return;
            default:
                System.out.println("Select a valid option!");
        }
    }


}
