package Uppgifter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextboxTest {

    @Test
    public void testStopfalse(){

        //arrange
        String nextText = "stop";
        Countbox myText = new Countbox();

        //act
        boolean actual = myText.isAddStop(nextText);
        boolean expected = false;

        //assert
        assertEquals(expected, actual);

    }


    @Test
    public void testAddChar(){
        // Arrange
        String nextText = "vill";
        Countbox myText = new Countbox();

        // act

        int actual = myText.countCharacter(nextText);
        int expected = 4;
        //Assert


        assertEquals(expected, actual);

    }

    @Test
    public void testGetRows(){
        // Arrange

        Countbox myText = new Countbox();

        // act
        myText.addRows();
        myText.getRowCount();

        int actual = myText.getRowCount();
        int expected = 1;
        //Assert


        assertEquals(expected, actual);

    }



}
