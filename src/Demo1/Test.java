package Demo1;

public class Test {
    public static void main(String[] args) {
        Movie movie=new Movie();
        Thread product=new Thread(new Product(movie));
        Thread coneumer=new Thread(new Consumer(movie));
        product.start();
        coneumer.start();
    }
}
