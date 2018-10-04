package IteratorPattern;

public class NameRespository implements Container {

    public String name[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return name[index++];
            }

            return null;
        }
    }
}
