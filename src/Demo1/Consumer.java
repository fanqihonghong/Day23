package Demo1;

public class Consumer implements Runnable{
    private  Movie movie=null;
    public Consumer(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                movie.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
