import services.RomanNumeralGenerator;

public class RomanNumeralsApp {
    public static void main(String[] args){
        RomanNumeralGenerator numeralGenerator = new RomanNumeralGenerator();
        System.out.println(numeralGenerator.generate(100));
        try {
            System.out.println(numeralGenerator.generate(5000));
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
