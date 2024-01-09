
package controllers;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
    
    public String string() {
        return sc.nextLine();
    }
    
    public int number() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
}
