public class ClockDisplay12Hour extends ClockDisplay {
    // Private field to track AM/PM
    private boolean isAM;

    // Constructor with no parameters
    public ClockDisplay12Hour() {
        super();  // Call the no-argument constructor of ClockDisplay
        isAM = true;  // Initialize as AM by default
        updateDisplay();  // Update the display to reflect 12-hour time
    }

    // Constructor with hour and minute parameters
    public ClockDisplay12Hour(int hour, int minute) {
        super();  // Call the constructor of ClockDisplay
        setTime(hour, minute);  // Set the time using 12-hour format
    }

    // Override setTime to handle AM/PM
    @Override
    public void setTime(int hour, int minute) {
        // Convert 24-hour format to 12-hour format
        if (hour == 0) {
            hour = 12;  // 12 AM
            isAM = true;
        } else if (hour == 12) {
            isAM = false;  // 12 PM
        } else if (hour > 12) {
            hour = hour - 12;  // Convert to PM
            isAM = false;
        } else {
            isAM = true;  // AM if hour < 12
        }
        super.setTime(hour, minute);  // Call parent class method to set hour and minute
        updateDisplay();  // Update the display string to include AM/PM
    }

    // Override timeTick to handle the time ticking and AM/PM switching
    @Override
    public void timeTick() {
        super.timeTick();  // Call the parent method to tick the time forward
        int currentHour = getHour();  // Get current hour from the parent class
        if (currentHour == 12 && getMinute() == 0) {
            // Switch AM/PM when the clock goes from 11:59 to 12:00
            isAM = !isAM;
        }
        updateDisplay();  // Update the display string with new time
    }

    // Method to return the current hour value (useful for overriding timeTick)
    private int getHour() {
        String time = getTime();  // Get the time from the ClockDisplay
        String hourString = time.substring(0, 2);  // Extract the hour from HH:MM
        return Integer.parseInt(hourString);
    }

    // Method to return the current minute value
    private int getMinute() {
        String time = getTime();  // Get the time from the ClockDisplay
        String minuteString = time.substring(3, 5);  // Extract the minute from HH:MM
        return Integer.parseInt(minuteString);
    }

    // Override updateDisplay to add AM/PM to the time string
    @Override
    protected void updateDisplay() {
        String period = isAM ? "AM" : "PM";  // Determine whether it’s AM or PM
        super.updateDisplay();  // Update the time display in HH:MM format
        String time = super.getTime();  // Get the current time string
        // Add AM/PM to the display string
        displayString = time + " " + period;
    }
}
