// CSD feb 2015 Juansa Sendra

public class Pool1 extends Pool {   //no kids alone
    int niños = 0;
    int instructores = 0;
    
    
    public synchronized void init(int ki, int cap) {}
    public synchronized void kidSwims() throws InterruptedException {
        while(instructores < 1) {
            log.waitingToSwim();
            wait();
        }
        log.swimming();
        niños++;
        notifyAll();
    }
    public synchronized void kidRests() throws InterruptedException {
        log.resting(); 
        niños--;
        notifyAll();
    }
    public synchronized void instructorSwims() throws InterruptedException {
        log.swimming();
        instructores++;
        notifyAll();
    }
    public synchronized void instructorRests() throws InterruptedException {
        while(niños > 0 && instructores <= 1) {
            log.waitingToRest();
            wait();
        }
        log.resting(); 
        instructores--;
        notifyAll();
    }
}
