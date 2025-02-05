package input_stream_reader.read_user_input_and_write;

import java.io.*;

public class ReadUserInputAndWrite {

    //method to read file
    public static void readFile(String fileName){
        //storing in file path
        String myFile = "src/main/java/input_stream_reader/read_user_input_and_write/" + fileName;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line; //line contains each line
            while((line = br.readLine()) != null ){
                System.out.println(line);
            }
        }
        catch (IOException e){     //Handling IO exception
            System.out.println("Exception occurred File not found"+ e.getMessage());
        }
    }

    //method to write in file
    public static void writeFile(String fileName, String content){
        String myFile = "src/main/java/input_stream_reader/read_user_input_and_write/" + fileName;
        try (FileWriter newFile = new FileWriter(myFile,true)){
            newFile.write(content + "\n");
        } catch (IOException e) {
            System.out.println("Exception caught IOException"+e.getMessage());
        }
    }
}
