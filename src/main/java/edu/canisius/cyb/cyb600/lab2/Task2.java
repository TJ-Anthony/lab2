package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    public String method1(String parameter1){
        if (parameter1 == null) {
            return "";
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = parameter1.length() - 1; i >= 0; i--) {
            reversed.append(Character.toUpperCase(parameter1.charAt(i)));
        }
        return reversed.toString();
    }

    public String method2(String parameter2){
        if (parameter2 == null || parameter2.isEmpty()){
            return "";
        }

        char firstChar = parameter2.charAt(0);
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            repeated.append(firstChar);
        }
        return repeated.append(parameter2.substring(1)).toString();
    }

    public String method3(String parameter3){
        if (parameter3 == null) {
            return "";
        }
        String[] words = parameter3.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i>= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
