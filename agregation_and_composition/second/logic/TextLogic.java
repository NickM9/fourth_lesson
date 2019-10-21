package by.epam.agregation_and_composition.second.logic;

/*
Создать объект класса текст, используя классы Предложение, Слово.
Методы:
    дополнить текст,
    вывести на консоль текст,
    заголовок текста.
 */

import by.epam.agregation_and_composition.second.entity.*;

public class TextLogic {

    public void addText(Text text, Sentence sentence){
        text.getSentences().add(sentence);
    }

    public void addText(Text text, Sentence sentence, int index){
        index--;
        text.getSentences().add(index, sentence);
    }

}
