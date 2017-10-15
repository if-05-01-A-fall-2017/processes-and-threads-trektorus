package at.htlleonding.fibonacci;

public class FibonacciThread extends Thread{
    
    private final int x;
    public int result;

    public FibonacciThread(int x) {
        this.x = x;
    }
    
    @Override
    public void run() {
        if( x < 2 )
            result = 1;
        else {
            try {
                FibonacciThread f1 = new FibonacciThread(x-1);
                FibonacciThread f2 = new FibonacciThread(x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                result = f1.result + f2.result;
            }
            catch(InterruptedException ex) { }
        }
    }
}
