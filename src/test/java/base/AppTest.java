package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_quote_and_origin() {
        App myApp = new App();
        String quote = "These aren't the droids you're looking for.";
        String origin = "Obi-Wan Kenobi";

        String expectedOutput = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualOutput = myApp.generateOutputString(quote, origin);

        assertEquals(expectedOutput, actualOutput);
    }
}