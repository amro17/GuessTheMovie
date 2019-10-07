import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangMan extends TheGame  {

    public static void main(String[] args) throws Exception {

        //Declare global variables
        int numOfMovies = 0;
        int randomMovie = 0;
        String secretWord = "";
        String movies = "";


        //Initialize classes
        File movieFile = new File("movies.txt");
        Scanner scanner = new Scanner(movieFile);

        //Get number of movies
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            movies += (line + "\n");
            numOfMovies++;
        }


        //Print test number of movies
        System.out.println("Number of movies: " + numOfMovies);


        //Get random movie number based on text file
        randomMovie = (int) (Math.random() * numOfMovies);

        //Print test random movie number
        System.out.println("Random movie number: " + randomMovie);


        //Get selected Movie
        File movieFile2 = new File("movies.txt");
        Scanner scanner2 = new Scanner(movieFile2);
        int i = 1;
        while (i <= randomMovie) {
            secretWord = scanner2.nextLine();
            i++;
        }
        // System.out.println(secretWord);
         guess(secretWord,10);


    }
}

