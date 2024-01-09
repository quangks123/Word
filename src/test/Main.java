
package test;

import views.Program;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"Count word", "Count alphabet character", "Re-enter sentence", "Exit"};
        new Program("-----MENU-----", choices).run();
    }
}
