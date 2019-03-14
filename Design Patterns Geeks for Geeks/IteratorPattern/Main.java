package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        NameRespository namesRepository = new NameRespository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
