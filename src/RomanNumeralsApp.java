import services.RomanNumeralGenerator;

public class RomanNumeralsApp {
    public static void main(String[] args){
        RomanNumeralGenerator numeralGenerator = new RomanNumeralGenerator();
        System.out.println("Testing generate function");
        System.out.println("Testing invalid input 5000");
        try {
            System.out.println(numeralGenerator.generate(5000));
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("3997 is: " + numeralGenerator.generate(3997));
        System.out.println("2345 is: " + numeralGenerator.generate(2345));
        System.out.println("1699 is: " + numeralGenerator.generate(1699));
        System.out.println("723 is: " + numeralGenerator.generate(723));
        System.out.println("102 is: " + numeralGenerator.generate(102));
        System.out.println("43 is: " + numeralGenerator.generate(43));
        System.out.println("Testing parse function");
        System.out.println("Testing invalid input MMMM");
        try {
            System.out.println(numeralGenerator.parse("MMMM"));
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Testing parse function returns when input is valid:");
        System.out.println("MMCCCIX is: " + numeralGenerator.parse("MMCCCIX"));
        System.out.println("MMMCMXCIX is: " + numeralGenerator.parse("MMMCMXCIX"));
        System.out.println("I is: " + numeralGenerator.parse("I"));
        System.out.println("CXLVII is: " + numeralGenerator.parse("CXLVII"));
    }
}
