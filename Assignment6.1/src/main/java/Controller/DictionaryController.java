package Controller;

import Model.Dictionary;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
        dictionary.addWord("java", "A high-level programming language used to build applications.");
        dictionary.addWord("python", "A versatile programming language known for readability.");
        dictionary.addWord("mvc", "Model-View-Controller — a design pattern for software architecture.");
    }

    public String search(String word) {
        try {
            return dictionary.searchWord(word);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
