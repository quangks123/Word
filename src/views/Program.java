
package views;

import controllers.Input;
import controllers.MethodString;
import models.Sentence;

public class Program extends Menu{
    
    Sentence s;

    public Program(String title, String[] choices) {
        super(title, choices);
        System.out.println("Enter your sentence: ");
        s = new Sentence();

    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("---------------------------------------");
                System.out.println("The number of word in your sentence: " + new MethodString().countWord(s));
                break;
            case 2:
                System.out.println("---------------------------------------");
                System.out.println("The number of alphabet-character in your sentence: ");
                new MethodString().countCharacter(s);
                break;
            case 3:
                System.out.println("---------------------------------------");
                System.out.println("Enter your sentence: ");
                s = new Sentence(new Input().string());
                break; 
        }
    }
    
}
