package uk.gov.meto.llama.server_a;

public class Example {
    private final String string;

    public Example(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public int length() {
        return string.length();
    }
}
