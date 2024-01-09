
package controllers;

import models.Sentence;

public class MethodString {
    public void countCharacter(Sentence s) {
        String str = s.getSen();
        str = str.toLowerCase().replaceAll(" ", "");
        int i = 0;
        int total = 0;
        while(i < str.length()) {
            if (isAlphabet(str.charAt(i))) {
                System.out.print(str.charAt(i) + ": " + countCharacter(str.charAt(i), str) + "  |  ");
                total += countCharacter(str.charAt(i), str);
                str = str.replaceAll(Character.toString(str.charAt(i)), "");
            } else {
                i++;
            }        
        }
        
        System.out.println("\nTotal: " + total);
    }
    
    public int countWord(Sentence s) {
        String[] str = s.getSen().split(" ");
        return str.length;
    }
    
    public int countCharacter(char c, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    
    public boolean isAlphabet(char c) {
        return Character.isLetter(c);
    }
}
