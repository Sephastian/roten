package Uppgifter;

public class Countbox {

    boolean stop;
    int chars = 0;
    int rows = 0;

    public boolean isAddStop(String nextText) {
        if(nextText.equals("stop")){
            stop = false;
        }else stop = true;
        return stop;
    }

    public void addRows() {
        rows = rows + 1;
    }

    public int countCharacter(String nextText) {
       chars = chars + nextText.length();

        return chars;
    }

    public int getRowCount() {
        return rows;
    }

    public int getCharacterCount() {
        return chars;
    }
}
