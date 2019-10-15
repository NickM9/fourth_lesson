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

public class Main {
    public static void main(String[] args) {

        String header = "Header";
        Word hello = new Word("Hello");
        Word world = new Word("world.");
        Word peace = new Word("Peace");
        Word together = new Word("together.");
        Word neww = new Word("New");
        Word sentence = new Word("sentence.");

        Sentence firstSentence = new Sentence(hello, world);
        Sentence secondSentence = new Sentence(peace, together);

        Text text = new Text(header, firstSentence, secondSentence);

        TextLogic textLogic = new TextLogic();

        System.out.println("Наш текст");
        System.out.println(textLogic.giveText(text));

        System.out.println("Добавим ещё одно предложение");
        Sentence thirdSentence = new Sentence(neww, sentence);
        textLogic.addText(text, thirdSentence);
        System.out.println(textLogic.giveText(text));

        System.out.println("Заголовок нашего текста");
        System.out.println(textLogic.giveHeader(text));

    }
}
