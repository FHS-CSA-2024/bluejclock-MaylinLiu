public class ClockDisplay {
    // Private NumberDisplay objects for hours and minutes
    private NumberDisplay hours;
    private NumberDisplay minutes;
    
    // Private String for the display
    private String displayString;

    // Constructor with no parameters
    public ClockDisplay() {
        hours = new NumberDisplay(24);  // Limit for hours is 24
        minutes = new NumberDisplay(60); // Limit for minutes is 60
        updateDisplay();  // Update display to current time
    }

    // Constructor with two parameters: hour and minute
    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);  // Limit for hours is 24
        minutes = new NumberDisplay(60); // Limit for minutes is 60
        setTime(hour, minute);  // Set the time using parameters
    }

    // Method to simulate time ticking forward by one minute
    public void timeTick() {
        minutes.increment();  // Increment the minute
        if (minutes.getValue()
