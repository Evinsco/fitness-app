public class BMICalculator {

    public double calculateBmiImperial(double weightInPounds, double weightInInches){
        return weightInPounds / (weightInInches * weightInInches) * 703;
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters){
        return weightInKilos / (heightInMeters * heightInMeters);
    }
}
