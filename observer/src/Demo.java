public class Demo {


    public static void main(String[] args) {
        NewsNetwork newsNetwork = new NewsNetwork();

        Channel tv = new Tv();
        Channel radio = new Radio();

        newsNetwork.attach(tv);
        newsNetwork.attach(radio);

        newsNetwork.setNews("News 1");
        newsNetwork.setNews("News 2");

        System.out.println("----------------");

        newsNetwork.detach(radio);
        newsNetwork.setNews("News 3");
    }
}
