package videoExercise;

import java.util.Scanner;

public class CountLetterNumberSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        coutnt(test);

    }

    public static void coutnt(String s){
        char[] ch = s.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i=0; i<s.length(); i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }else if(Character.isSpaceChar(ch[i])){
                space++;
            }else if(Character.isDigit(ch[i])){
                number++;
            }else {
                other++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);

    }
}
