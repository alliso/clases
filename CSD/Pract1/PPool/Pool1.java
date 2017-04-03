// CSD feb 2015 Juansa Sendra

public class Pool1 extends Pool {   //no kids alone
    int ni�os = 0;
    int instructores = 0;
    
    
    public synchronized void init(int ki, int cap) {}
    public synchronized void kidSwims() throws InterruptedException {
        while(instructores < 1) {
            log.waitingToSwim();
            wait();
        }
        log.swimming();
        ni�os++;
        notifyAll();
    }
    public synchronized void kidRests() throws InterruptedException {
        log.resting(); 
        ni�os--;
        notifyAll();
    }
    public synchronized void instructorSwims() throws InterruptedException {
        log.swimming();
        instructores++;
        notifyAll();
    }
    public synchronized void instructorRests() throws InterruptedException {
        while(ni�os > 0 && instructores <= 1) {
            log.waitingToRest();
            wait();
        }
        log.resting(); 
        instructores--;
        notifyAll();
    }
}
