package file_reader.read_file_line_by_line;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static String readFile(String filePath){

        //concatenate current path with user path
        String myPath = "src/main/java/file_reader/read_file_line_by_line/" + filePath;

        //try catch block if the exception occurred (file not found exception)
        try {

            //create a bufferreader to take input
            BufferedReader br = new BufferedReader(new FileReader(myPath));

            //create a variable to read file by line
            String line;

            //using try catch block to handle IOException if occurred
            try{
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred File Not Found"+ e.getMessage());
        }

        return myPath;
    }
}
