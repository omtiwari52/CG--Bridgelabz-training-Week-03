package fileReader.read_file_line_by_line;

import org.junit.jupiter.api.Test;

import static file_reader.read_file_line_by_line.ReadFile.readFile;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTest1 {

    @Test
    void ReadFileByLine1(){
        assertEquals("src/main/java/file_reader/read_file_line_by_line/sampleFile.txt", readFile("sampleFile.txt"));
    }
    @Test
    void ReadFileByLine2(){
        assertEquals("src/main/java/read_file_line_by_line/sampleFile.txt", readFile("sampleFile.txt"));
    }
}
