package netlib.core.task;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public abstract class Task implements Runnable{

    private final int delay;
    private final long period;

    final TimerTask tt;

    public Task(final int delay, final long period, final TimeUnit unit){
        this.delay = delay;
        this.period = unit.toMillis(period);

        tt = new TimerTask(){
            public void run(){
                Task.this.run();
            }
        };
    }

    public Task(final long period, final TimeUnit unit){
        this(0, period, unit);
    }

    public Task(final long period){
        this(period, TimeUnit.MILLISECONDS);
    }

    public int getDelay(){
        return delay;
    }

    public long getPeriod(){
        return period;
    }

    public boolean stop(){
        return tt.cancel();
    }
}
