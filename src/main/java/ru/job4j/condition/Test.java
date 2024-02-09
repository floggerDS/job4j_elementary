package ru.job4j.condition;

public class Test {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                String concat = String.valueOf(symbol) + "" + String.valueOf(counter==1?"":String.valueOf(counter));
                result += concat;
                symbol = input.charAt(i++);
                counter = 1;
            }


        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(encode("a"));//"a"+
        //System.out.println(encode("aa"));//"a2"+
        System.out.println(encode("aaabbc"));//"a3b2c"+
        //System.out.println(encode("abbccc"));//"ab2c3"+
        //System.out.println(encode("aaabcc"));//"a3bc2"+
        //System.out.println(encode("abc"));//"abc"+
        //System.out.println(encode("aaabbbccc"));//"a3b3c3"+
        //System.out.println(encode("aaaaaaaaaaaabbbcdddd"));//"a12b3cd4"+
        //System.out.println(encode("aaabbbbaaabbcccddddd"));//a3b4a3b2c3d5"+
    }


}
