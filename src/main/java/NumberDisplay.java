public class NumberDisplay {
    // Private variables for limit and value
    private int limit;
    private int value;

    // Constructor that sets the limit and initializes value to 0
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    // Getter for limit
    public int getLimit() {
        return limit;
    }

    // Setter for limit
    public void setLimit(int newLimit) {
        limit = newLimit;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value with validity check
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            value = newValue;
        } else {
            System.out.println("Invalid value: " + newValue);
        }
    }

    // Method to return the display value as a two-digit string
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;  // Add a leading zero if value is less than 10
        } else {
            return "" + value;  // Otherwise return the value as a string
        }
    }

    // Method to increment the value, rolling over if the limit is reached
    public void increment() {
        value++;
        if (value == limit) {
            value = 0;  // Reset to 0 if limit is reached
        }
    }
}
