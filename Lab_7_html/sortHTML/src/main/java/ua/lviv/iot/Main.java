package ua.lviv.iot;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

         SortHTML sortHTML = new SortHTML();

        try {
            sortHTML.processTextFromConsole();
            sortHTML.sortByAlphabeticOrder();

        } catch (IOException e) {

        }
    }
}