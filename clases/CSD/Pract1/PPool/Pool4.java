// CSD feb 2015 Juansa Sendra

public class Pool4 extends Pool{ //max kids/instructor
    int ni�os = 0;
    int instructores = 0;
    int k = 0;
    int capMax = 0;
    int insToRest = 0;

    public synchronized void init(int ki, int cap) { 
        k = ki;
        capMax = cap;        
    }

    public synchronized void kidSwims() throws InterruptedException {
        while(instructores < 1 || ((ni�os+1) > (k * instructores)) || (capMax < (ni�os + instructores + 1)) ||(insToRest > 0)) {
            log.waitingToSwim();
            wait();
        }
        log.swimming();
        ni�os++;     
    }

    public synchronized void kidRests() throws InterruptedException {
        log.resting(); 
        ni�os--;
        notifyAll();
    }

    public synchronized void instructorSwims() throws InterruptedException {
        while(capMax < (ni�os + instructores + 1)) {
            log.waitingToSwim();
            wait();
        }
        log.swimming();        
        instructores++;
        notifyAll();
    }

    public synchronized void instructorRests() throws InterruptedException {
        insToRest++;
        while((ni�os > 0 && instructores <= 1) || ni�os > (k * (instructores-1))) {
            log.waitingToRest();
            wait();
        }
        insToRest--;
        notifyAll();
        log.resting(); 
        instructores--;
    }
}

