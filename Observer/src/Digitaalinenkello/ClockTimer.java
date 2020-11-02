package Digitaalinenkello;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Observable {
	private int tunti, min, sek;
    private Timer timer = new Timer(true);
    private TimerTask tTask = new callTick();
    
    public ClockTimer(int tunti, int min, int sek) {
        this.tunti = tunti;
        this.min = min;
        this.sek = sek;
        timer.schedule(tTask, 0, 1000);
    }
    
  
    private void tick() {
        sek++;
        if (sek >= 60) {
            sek = 0;
            min++;
        }
        if (min >= 60) {
            min = 0;
            tunti++;
        }
        if (tunti >= 24) {
            tunti = 0;
        }
        setChanged();
        notifyObservers();
    }
    
    private class callTick extends TimerTask {

        @Override
        public void run() {
            tick();
        }        
    }
    
    public int getTunti() {
        return tunti;
    } 
    public int getMin() {
        return min;
    }
    public int getSek() {
        return sek;
    } 
}