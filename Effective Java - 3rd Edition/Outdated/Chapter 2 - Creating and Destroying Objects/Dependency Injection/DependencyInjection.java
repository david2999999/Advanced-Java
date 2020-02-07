public class DependencyInjection {
    // Dependency injection provides flexibility and testability
    public class SpellChecker {
        private final Lexicon dictionary;
        public SpellChecker(Lexicon dictionary) {
            this.dictionary = Objects.requireNonNull(dictionary);
        }
        public boolean isValid(String word) { ... }
        public List<String> suggestions(String typo) { ... }
    }
}

// What is required is the ability to support multiple instances of the class (in our
//example, SpellChecker), each of which uses the resource desired by the
// client (in our example, the dictionary). A simple pattern that satisfies this
//requirement is to pass the resource into the constructor when creating a new
//instance. This is one form of dependency injection: the dictionary is a
//dependency of the spell checker and is injected into the spell checker when it is
//created.