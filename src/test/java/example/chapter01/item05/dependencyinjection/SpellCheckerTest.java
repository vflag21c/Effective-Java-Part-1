package example.chapter01.item05.dependencyinjection;

import example.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid1() {
        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        spellChecker.isValid("word");
    }

    @Test
    void isValid2() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        spellChecker.isValid("word");
    }

    @Test
    void isValid3() {
        SpellChecker spellChecker = new SpellChecker(DictionaryFactory::get);
        spellChecker.isValid("word");
    }

}