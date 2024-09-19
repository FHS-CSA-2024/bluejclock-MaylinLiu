public class ClockDisplaySeconds extends ClockDisplay {
    // Private NumberDisplay object for seconds
    private NumberDisplay seconds;

    // Constructor with no parameters
    public ClockDisplaySeconds() {
        super();  // Call the no-argument constructor of ClockDisplay
        seconds = new NumberDisplay(60);  // Limit for seconds is 60
        updateDisplay();  // Update the display to include seconds
    }

    // Constructor with hour, minute, and second parameters
    public ClockDisplaySeconds(int hour, int minute, int second) {
        super(hour, minute);  // Call the constructor of ClockDisplay with hour and minute
        seconds = new NumberDisplay(60);  // Limit for seconds is 60
        setTime(hour, minute, second);  // Set time with the seconds included
    }

    // Override the timeTick method to include ticking of seconds
    @Override
    public void timeTick() {
        seconds.increment();  // Increment the seconds
        if (seconds.getValue() == 0) {  // If seconds roll over, increment the minutes
            super.timeTick();  // Call the parent class method to increment minutes
        }
        updateDisplay();  // Update the display to include the new time with seconds
    }

    // Method to set the time with hours, minutes, and seconds
    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute);  // Set hour and minute using parent method
        seconds.setValue(second);  // Set the seconds value
        updateDisplay();  // Update the display to reflect the new time
    }

    // Override getTime to include seconds in the returned string
    @Override
    public String getTime() {
        return displayString;  // Return the updated display string
    }

    // Override updateDisplay to include seconds in the time string
    @Override
    protected void updateDisplay() {
        String parentDisplay = super.getTime();  // Get the HH:MM display from parent
        displayString = parentDisplay + ":" + seconds.getDisplayValue();  // Add seconds to HH:MM:SS
    }
}
