package by.epam.agregation_and_composition.second.entity;

import java.util.List;
import java.util.Objects;

public class Text {

    private String header;
    private List<Sentence> sentences;

    public Text(String header, List<Sentence> sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", sentences=" + sentences +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, sentences);
    }
}
