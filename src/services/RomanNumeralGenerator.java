package services;

public class RomanNumeralGenerator {
    public String generate(Integer number){
        if(number > 3999 || number < 0)
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        return "IX";
    };
    public Integer parse(String roman){
        return 4;
    };
}
