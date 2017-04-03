// CSD feb 2015 Juansa Sendra

public class Pool3 extends Pool{ //max kids/instructor
    int niños = 0;
    int instructores = 0;
    int k = 0;
    int capMax = 0;

    public synchronized void init(int ki, int cap) { 
        k = ki;
        capMax = cap;        
    }

    public synchronized void kidSwims() throws InterruptedException {
        //System.out.println("niños antes: " + instructores);
        while(instructores < 1 || ((niños+1) > (k * instructores)) || (capMax < (niños + instructores + 1))) {
            log.waitingToSwim();
            wait();
        }
        log.swimming();
        niños++;     
    }

    public synchronized void kidRests() throws InterruptedException {
        log.resting(); 
        niños--;
        notifyAll();
    }

    public synchronized void instructorSwims() throws InterruptedException {
        while(capMax < (niños + instructores + 1)) {
            log.waitingToSwim();
            wait();
        }
        log.swimming();        
        instructores++;
        notifyAll();
    }

    public synchronized void instructorRests() throws InterruptedException {
        while((niños > 0 && instructores <= 1) || niños > (k * (instructores-1))) {
            log.waitingToRest();
            wait();
        }
        log.resting(); 
        instructores--;
    }
}

