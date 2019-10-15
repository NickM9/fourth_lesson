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

    public String addText(Text text, Sentence sentence){
        StringBuffer sb = new StringBuffer(text.toString());
        sb.append(sentence);

        return sb.toString();
    }

    public String giveText(Text text){
        StringBuffer sb = new StringBuffer(text.getHeader());
        sb.append("\n");

        for (int i = 0; i < text.getSentences().length; i++){
            for (int j = 0; j < text.getSentences()[i].getWords().length; j++){
                sb.append(text.getSentences()[i].getWords()[j].getWord());
                sb.append(" ");
            }
        }
        sb.append("\n");

        return sb.toString();
    }

    public String giveHeader(Text text){
        return text.getHeader();
    }

}
