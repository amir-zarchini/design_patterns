public class PeopleCollection implements Aggregate {

    String[] peoples = {"Ali", "Reza", "Ahmad", "Saman"};

    @Override
    public Iterator getIterator() {
        return new PeopleIterator();
    }

    private class PeopleIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index == peoples.length) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return peoples[index++];
            }
            return null;
        }
    }
}
