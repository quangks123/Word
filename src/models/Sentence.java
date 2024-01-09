
package models;

import controllers.Input;

public class Sentence {
    private String sentence;

    public Sentence() {
        sentence = new Input().string();
    }

    public Sentence(String word) {
        this.sentence = word;
    }

    public String getSen() {
        return sentence;
    }

    public void setSen(String word) {
        this.sentence = word;
    }

    @Override
    public String toString() {
        return sentence;
    }
    
    
}
