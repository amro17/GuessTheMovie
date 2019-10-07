import java.util.ArrayList;
import java.util.Scanner;

public class TheGame  {

    static public void guess(String word , int life){
        char [] filler = new char[word.length()];
        int i = 0;
        while (i < word.length()){
            filler[i] = '-';
            if (word.charAt(i) == ' '){
                filler[i] = ' '; // leave the space the way it is.
            }
            i ++;

        }
        // System.out.println(filler);
        // System.out.println("Life remaining " + life);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter");
        ArrayList<Character> l = new  ArrayList<Character>();

        while (life > 0 ){
            char x = input.next().charAt(0);
            if (l.contains((x))){
                System.out.println("Already entered");
                continue;
            }
            l.add(x);
            // in case user enter space
            if(word.contains(x+"")){ // a way to comparing string to char
                // this loop will check all index for the character
                // and will replace '-' by the character
                // taking the word in char switch it to string and check if word contains char
                for (int y = 0 ; y < word.length(); y++){
                    if (word.charAt(y) == x ){
                        filler[y] = x;
                    }
                }
            }
            else {
                life--;
            }
            if (word.equals(String.valueOf(filler))){ // checking if fillers == word
                System.out.println(filler);
                System.out.println("You win !!!");
                break;
            }
            System.out.println(filler);
            System.out.println("Life remaining " + life);
        }
        if (life == 0){
            System.out.println("You lose");
        }

    }
    /*
    public static void main(String[] args ){
        String s  = "Welcome to Java";
        int test = 5;
        guess(s,test);
    }

     */
}
