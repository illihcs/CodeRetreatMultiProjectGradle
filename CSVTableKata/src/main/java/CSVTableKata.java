import java.util.ArrayList;

public class CSVTableKata {

    public String convertLine(String alt) {
        alt = alt.replace(';', '|');
        alt += "|";
        return alt;
    }

    public String[] convertLines(String[] alt) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : alt) {
            result.add(convertLine(s));
        }
        result.add(1, "-+-+-+-+");
        return result.toArray(new String[0]);
    }
}
