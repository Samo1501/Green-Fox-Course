package Package_02_Types;

public class CodingHours {
    public static void main(String[] args) {
        System.out.println("If an average Green Fox attendee codes 6 hours daily, 5 days a week, it is " + (17*5*6) + " hours in total");

        //Problematic!!!!!!!!!! https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/expressions-and-control-flow/coding-hours/CodingHours.java !!!!!!
        ///We work only during workdays yes, but I guess we need to compare them to also duration with weekends included, if we want to know the percentage of total time.
        System.out.println("If there is average hours of 52 weekly, then the percentage of the coding hours is " + ((17*7*24) / (17*52)) + " % per semester.");
    }
}

/*
17 weeks x 52 avg hours = 884 hours in total (in average)
total hours of the course duration: 17x7x24 = 2856
 */