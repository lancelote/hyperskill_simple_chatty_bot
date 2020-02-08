package stage4.hw5;

public class Time {

    int hours;
    int minutes;
    int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }
}
