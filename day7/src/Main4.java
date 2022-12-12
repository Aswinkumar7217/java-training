public class Main4 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        Main4 t1=new Main4();
        //At the same time we can't use two threads
        t1.start();
        t1.start();
    }
}