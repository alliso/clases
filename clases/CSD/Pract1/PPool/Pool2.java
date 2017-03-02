// CSD feb 2015 Juansa Sendra

public class Pool2 extends Pool{ //max kids/instructor
    int ni�os = 0;
    int instructores = 0;
    int k = 0;
    
    public synchronized void init(int ki, int cap) { k = ki; }

    public synchronized void kidSwims() throws InterruptedException {
        //System.out.println("ni�os antes: " + instructores);
        while(instructores < 1 || ((ni�os+1) > (k * instructores))) {
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
        log.swimming();        
        instructores++;
        notifyAll();
    }

    public synchronized void instructorRests() throws InterruptedException {
        while((ni�os > 0 && instructores <= 1) || ni�os > (k * (instructores-1))) {
             log.waitingToRest();
             wait();
        }
        log.resting(); 
        instructores--;
    }
}

