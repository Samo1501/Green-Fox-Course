package Package_03_Variables;

public class Bmi {
    public static void main(String[] args) {

        double massInKg = 81.2;
        double heightInM = 1.78;

        System.out.println("If the person is " + heightInM + "m high and " + massInKg +"kg heavy, the BMI of the person will " +
                "be " + massInKg/(heightInM*heightInM) + ".");
    }
}
