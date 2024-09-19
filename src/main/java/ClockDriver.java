public class ClockDriver {
    public static void main(String[] args) {
        // Tests for ClockDisplay
        System.out.println("Testing ClockDisplay:");
        ClockDisplay clock1 = new ClockDisplay();  // Test empty constructor
        System.out.println("Initial time (empty constructor): " + clock1.getTime());

        ClockDisplay clock2 = new ClockDisplay(3, 32);  // Test constructor with time
        System.out.println("Initial time (03:32 constructor): " + clock2.getTime());

        clock2.setTime(3, 9);  // Test setting time
        System.out.println("Time set to 03:09: " + clock2.getTime());

        clock2.timeTick();  // Test ticking from 03:09 to 03:10
        System.out.println("Tick from 03:09 to 03:10: " + clock2.getTime());

        clock2.setTime(1, 59);  // Test ticking from 01:59 to 02:00
        clock2.timeTick();
        System.out.println("Tick from 01:59 to 02:00: " + clock2.getTime());

        clock2.setTime(9, 59);  // Test ticking from 09:59 to 10:00
        clock2.timeTick();
        System.out.println("Tick from 09:59 to 10:00: " + clock2.getTime());

        clock2.setTime(23, 59);  // Test ticking from 23:59 to 00:00
        clock2.timeTick();
        System.out.println("Tick from 23:59 to 00:00: " + clock2.getTime());

        // Tests for ClockDisplaySeconds
        System.out.println("\nTesting ClockDisplaySeconds:");
        ClockDisplaySeconds clockSec1 = new ClockDisplaySeconds();  // Test empty constructor
        System.out.println("Initial time with seconds (empty constructor): " + clockSec1.getTime());

        ClockDisplaySeconds clockSec2 = new ClockDisplaySeconds(3, 32, 59);  // Test constructor with time
        System.out.println("Initial time (03:32:59 constructor): " + clockSec2.getTime());

        clockSec2.setTime(1, 0, 59);  // Test ticking from 01:00:59 to 01:01:00
        clockSec2.timeTick();
        System.out.println("Tick from 01:00:59 to 01:01:00: " + clockSec2.getTime());

        clockSec2.setTime(1, 59, 59);  // Test ticking from 01:59:59 to 02:00:00
        clockSec2.timeTick();
        System.out.println("Tick from 01:59:59 to 02:00:00: " + clockSec2.getTime());

        clockSec2.setTime(23, 59, 59);  // Test ticking from 23:59:59 to 00:00:00
        clockSec2.timeTick();
        System.out.println("Tick from 23:59:59 to 00:00:00: " + clockSec2.getTime());

        // Tests for ClockDisplay12Hour
        System.out.println("\nTesting ClockDisplay12Hour:");
        ClockDisplay12Hour clock12Hr1 = new ClockDisplay12Hour();  // Test empty constructor
        System.out.println("Initial 12-hour time (empty constructor): " + clock12Hr1.getTime());

        ClockDisplay12Hour clock12Hr2 = new ClockDisplay12Hour(3, 32);  // Test constructor with time
        System.out.println("Initial 12-hour time (03:32 PM constructor): " + clock12Hr2.getTime());

        clock12Hr2.setTime(11, 59);  // Test ticking from 11:59 PM to 12:00 AM
        clock12Hr2.timeTick();
        System.out.println("Tick from 11:59 PM to 12:00 AM: " + clock12Hr2.getTime());

        clock12Hr2.setTime(11, 59);  // Test ticking from 11:59 AM to 12:00 PM
        clock12Hr2.timeTick();
        System.out.println("Tick from 11:59 AM to 12:00 PM: " + clock12Hr2.getTime());

        clock12Hr2.setTime(12, 59);  // Test ticking from 12:59 PM to 01:00 PM
        clock12Hr2.timeTick();
        System.out.println("Tick from 12:59 PM to 01:00 PM: " + clock12Hr2.getTime());
    }
}
