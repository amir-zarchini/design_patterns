public class IteratorDemo {

    public static void main(String[] args) {
        PeopleCollection peopleCollection = new PeopleCollection();
        Iterator peopleIterator = peopleCollection.getIterator();
        while (peopleIterator.hasNext()) {
            System.out.println(peopleIterator.next());
        }
    }
}
