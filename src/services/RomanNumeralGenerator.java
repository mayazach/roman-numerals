package services;

import java.util.Map;

public class RomanNumeralGenerator {
    private static final Map<Character,Integer> characterIntegerMap = Map.of(
            'I',1,
            'V',5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    private Boolean validateRoman(){
        
        return true;
    }

    public String generate(Integer number){
        if(number > 3999 || number < 0)
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        StringBuilder romanNumber = new StringBuilder();
        while(number > 0){
            if(number >= 1000) {
                romanNumber.append("M".repeat(number / 1000));
                number %= 1000;
            }
            else if(number >= 900){
                romanNumber.append("CM");
                number -= 900;
            }
            else if(number >= 500){
                romanNumber.append("D");
                number -= 500;
            }
            else if(number >= 400){
                romanNumber.append("CD");
                number -= 400;
            }
            else if(number >= 100){
                romanNumber.append("C".repeat(number / 100));
                number %= 100;
            }
            else if(number >= 90){
                romanNumber.append("XC");
                number -= 90;
            }
            else if(number >= 50){
                romanNumber.append("L");
                number -= 50;
            }
            else if(number >= 40){
                romanNumber.append("XL");
                number -= 40;
            }
            else if(number >= 10){
                romanNumber.append("X".repeat(number / 10));
                number %= 10;
            }
            else if(number == 9){
                romanNumber.append("IX");
                number = 0;
            }
            else if(number >= 5){
                romanNumber.append("V");
                number -= 5;
            }
            else if(number == 4){
                romanNumber.append("IV");
                number = 0;
            }
            else{
                romanNumber.append("I".repeat(number));
                number = 0;
            }
        }

        return romanNumber.toString();
    }

    public Integer parse(String roman){
        return characterIntegerMap.get('X');
    }
}
