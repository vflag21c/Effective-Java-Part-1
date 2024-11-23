package example.chapter01.item05.factorymethod;

import example.chapter01.item05.DefaultDictionary;
import example.chapter01.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
