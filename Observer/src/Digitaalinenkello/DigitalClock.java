package Digitaalinenkello;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer subjectClock) {
        timer = subjectClock;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (timer == o) {
            formatTime();
        }
    }
    
    private void formatTime() {        
    	
        int hour = timer.getTunti();
        int min = timer.getMin();
        int sec = timer.getSek();
        
        
              
        System.out.println(hour+":" + min+":" + sec);
    }
}