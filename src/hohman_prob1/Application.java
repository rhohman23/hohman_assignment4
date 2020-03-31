package hohman_prob1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

   public static void main(String[] args) throws IOException {
       DuplicateRemover d=new DuplicateRemover();
       d.remove("problem1.txt");
       d.Write("unique_words.txt");
      

   }

}