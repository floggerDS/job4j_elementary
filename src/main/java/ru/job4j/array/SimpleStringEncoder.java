package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        int j;

        for (j = 0; j < input.length(); j++) {

            if ((symbol == input.charAt(j)) && (j + 1) < input.length() && (symbol == input.charAt(j + 1))) {
                counter++;
            } else {
                result += symbol + (counter == 1 ? "" : String.valueOf(counter));
                counter = 1;
                symbol = j + 1 >= input.length() ? input.charAt(j) : input.charAt(j + 1);
            }

        }
        return result;
    }

}
