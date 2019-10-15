package by.epam.agregation_and_composition.second.entity;


import java.util.ArrayList;
import java.util.Arrays;

public class Text {

    private String header;
    private Sentence[] sentences;

    public Text(String header, Sentence... s) {
        this.header = header;
        this.sentences = s;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", sentences=" + Arrays.toString(sentences) +
                '}';
    }
}
