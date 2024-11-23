package example.chapter01.item05.factorymethod;

import example.chapter01.item05.Dictionary;
import example.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
