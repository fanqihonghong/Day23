package Demo1;

public class Product implements Runnable{
    private  Movie movie=null;
    Boolean faly=false;
    public Product(Movie movie) {
        this.movie = movie;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (faly) {
                try {
                    this.movie.set("变形精钢","科幻动漫电影");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                faly=false;
            }else {
                try {
                    this.movie.set("神偷奶爸","搞笑电影");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                faly=true;
            }
        }
    }
}
