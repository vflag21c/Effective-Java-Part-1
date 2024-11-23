package example.chapter01.item05.factorymethod;

import example.chapter01.item05.Dictionary;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }
}
