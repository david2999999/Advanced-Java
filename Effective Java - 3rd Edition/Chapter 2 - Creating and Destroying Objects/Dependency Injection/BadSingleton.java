public class BadSingleton {
    // Inappropriate use of singleton - inflexible & untestable!
    public class SpellChecker {
        private final Lexicon dictionary = ...;
        private SpellChecker(...) {}
        public static INSTANCE = new SpellChecker(...);
        public boolean isValid(String word) { ... }
        public List<String> suggestions(String typo) { ... }
    }
}