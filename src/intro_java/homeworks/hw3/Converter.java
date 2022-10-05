package intro_java.homeworks.hw3;

public class Converter {
    private static float MILE_TO_KM = 1.609f;

    public static float mileToKm(float mile) {
        return mile * MILE_TO_KM;
    }

    public static float kmToMile(float km) {
        return km / MILE_TO_KM;
    }
}
