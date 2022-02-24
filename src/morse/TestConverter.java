
package morse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    @Test
    public void testMorseToEng() {

        Converter convert = new Converter();

        String testdata = "*** --- ***";

        String actual = Converter.translateMorse(testdata);


        assertEquals("sos", actual);

        //

    }

    @Test
    public void testEngToMorse() {
        Converter convert = new Converter();

        String testdata = "S O S";

        String actual = Converter.translateEnglish(testdata);


        assertEquals("*** --- ***", actual);

        // Test för engelska till morsekod
    }

    @Test
    public void testConvert() {
        Converter convert = new Converter();

        String testdata = "BIG LETTERS";

        String actual = Converter.getInput(testdata);


        assertEquals("big letters", actual);

        // Test för att se att getInput gör om stora till små bokstäver
    }
}
