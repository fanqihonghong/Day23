package Demo1;

public class Movie {
    private  String name;
    private  String info;
    private Boolean faly=true;
    public Movie() {
    }
    public Movie(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public  synchronized  void set(String name ,String info) throws InterruptedException {
        if (!faly){
            super.wait();
        }
        this.name = name;
        try {
            Thread.sleep(200 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.info = info;
        faly=false;
        super.notify();
    }
    public synchronized void get() throws InterruptedException {
        if (faly){
            super.wait();
        }
        System.out.println(this.name+" "+this.name);
        Thread.sleep(200);
        faly=true;
        super.notify();
    }
}
