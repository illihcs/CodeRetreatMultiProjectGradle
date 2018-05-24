import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CSVTableKataTest {
    @Test
    public void testSemikolonReplacement() {
        CSVTableKata ctk = new CSVTableKata();
        String alt = "Name;Strasse;Ort;Alter";
        String neu = "Name|Strasse|Ort|Alter|";

        alt = ctk.convertLine(alt);

        assertThat(alt).isEqualTo(neu);
    }

    @Test
    public void testConvertLinesToOutput() {
        CSVTableKata ctk = new CSVTableKata();
        String[] alt = {
                "Name;Strasse;Ort;Alter",
                "Peter Pan;Am Hang 5;12345 Einsam;42",
                "Maria Schmitz;Kölner Straße 45;50123 Köln;43",
                "Paul Meier;Münchener Weg 1;87654 München;65"
        };
        String[] neu = {
                "Name|Strasse|Ort|Alter|",
                "-+-+-+-+",
                "Peter Pan|Am Hang 5|12345 Einsam|42|",
                "Maria Schmitz|Kölner Straße 45|50123 Köln|43|",
                "Paul Meier|Münchener Weg 1|87654 München|65|"
        };

        alt = ctk.convertLines(alt);

        assertThat(alt).containsExactlyElementsOf(Arrays.asList(neu));
    }
}
