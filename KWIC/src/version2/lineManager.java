package version2;

import java.util.ArrayList;

public class lineManager {
    private ArrayList<String> allLines;

    public lineManager() {
        allLines = new ArrayList<String>();
    }

    public void addLine(String line) {
        allLines.add(line);
    }

    public String getLine(int lineNumber) {
        return allLines.get(lineNumber);
    }

    public void setLine(int lineNumber, String line) {
        allLines.set(lineNumber, line);
    }

}