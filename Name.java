public class Name {
    private int hours;
    private int minutes;
    private int seconds;

    public Name() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Name(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int calculateTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void decreaseTime(int minutesToDecrease) {
        this.minutes -= minutesToDecrease;
        if (this.minutes < 0) {
            this.hours += this.minutes / 60;
            this.minutes = (this.minutes % 60 + 60) % 60;
            if (this.hours < 0){
                this.hours = (this.hours % 24 + 24) % 24;
            }
        }
    }
    
    @Override
    public String toString() {
        return "Time: " + hours + ":" + minutes + ":" + seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
