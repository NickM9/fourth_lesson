package by.epam.agregation_and_composition.second;

/*
Создать объект класса текст, используя классы Предложение, Слово.
Методы:
    дополнить текст,
    вывести на консоль текст,
    заголовок текста.
 */

import by.epam.agregation_and_composition.second.entity.*;
import by.epam.agregation_and_composition.second.logic.TextLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Слова
        String header = "Header";
        Word hello = new Word("Hello");
        Word world = new Word("world.");
        Word peace = new Word("Peace");
        Word together = new Word("together.");
        Word neww = new Word("New");
        Word sentence = new Word("sentence.");

        // Предложения
        List<Word> firstWords = new ArrayList<Word>();
        firstWords.add(hello);
        firstWords.add(world);

        Sentence firstSentence = new Sentence(firstWords);

        List<Word> secondWords = new ArrayList<Word>();
        secondWords.add(peace);
        secondWords.add(together);

        Sentence secondSentence = new Sentence(secondWords);

        // Текст
        List<Sentence> sentences = new ArrayList<Sentence>();
        sentences.add(firstSentence);
        sentences.add(secondSentence);

        Text text = new Text(header, sentences);

        // Логика

        TextLogic textLogic = new TextLogic();

        System.out.println("Наш текст");
        System.out.println(printText(text));

        System.out.println("Добавим ещё одно предложение и поставим посередине");
        List<Word> thirdWords = new ArrayList<Word>();
        thirdWords.add(neww);
        thirdWords.add(sentence);
        Sentence thirdSentence = new Sentence(thirdWords);

        textLogic.addText(text, thirdSentence, 2);
        System.out.println(printText(text));

        System.out.println("Заголовок нашего текста");
        System.out.println(text.getHeader());

    }

    private static String printText(Text text){
        StringBuffer sb = new StringBuffer(text.getHeader());
        sb.append("\n");

        for (Sentence sentence : text.getSentences()){
            for (Word word : sentence.getWords()){
                sb.append(word.getWord());
                sb.append(" ");
            }
        }
        sb.append("\n");

        return sb.toString();
    }
}
