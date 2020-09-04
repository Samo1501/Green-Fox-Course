package Package_03_Variables;

public class SecondsInADay {
    public static void main(String[] args) {
        // Write a program that prints the remaining seconds (as an integer) from a day
        // if the current time is represented by the variables

        int secondsPerDay = 24 * 60 * 60;

        int currentHour = 15;
        int currentMinutes = 20;
        int currentSeconds = 36;
        int currentAlreadySpentSeconds = (currentHour*60*60) + (currentMinutes*60) + currentSeconds;

        System.out.println("Currently (since 15:20) we have " + (secondsPerDay - currentAlreadySpentSeconds) + " seconds left till end of the day.");
    }
}
