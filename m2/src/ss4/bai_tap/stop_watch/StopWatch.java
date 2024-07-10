package ss4.bai_tap.stop_watch;

import java.time.LocalTime;

class StopWatch{
    private double starTime, endTime;

    public StopWatch() {
    }
    public void star() {
        this.starTime = System.currentTimeMillis();
    }
    public double getStartTime() {
        return this.starTime;
    }
    public double getEndTime() {
        return this.endTime;
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        double elapsed;
        elapsed = endTime - starTime;
        return elapsed;
    }
}
