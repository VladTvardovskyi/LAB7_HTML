package ua.lviv.iot;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.awt.SecondaryLoop;
import java.io.IOException;

public class SortHTML {

    public String secondText;
    private ArrayList<String> wordsList = new ArrayList<String>();

    public static String readInputText() {
        System.out.println("Enter your beautiful text");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public void processTextFromConsole() throws IOException {
        String text = readInputText();
        Pattern pattern = Pattern.compile("(<span>.+</span>)|(<table>.+</table>)|(<strong>.+</strong>)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String firstText = matcher.group();
            secondText = firstText.replaceAll("<.+?>", "");
            System.out.println(secondText);
            for (String st : secondText.split(" ")) {
                wordsList.add(st);
            }
        }
    }

    public ArrayList<String> sortByAlphabeticOrder() {

        Collections.sort(wordsList, new Comparator<String>() {
            @Override
            public int compare(final String obj1, final String obj2) {
                return obj1.compareTo(obj2);
            }
        });

        wordsList.sort((String o1, String o2) -> o1.compareTo(o2));
        wordsList.sort((o1, o2) -> o1.compareTo(o2));
        for (final String temp1 : wordsList) {
            System.out.println(temp1);
        }
        return wordsList;
    }
}