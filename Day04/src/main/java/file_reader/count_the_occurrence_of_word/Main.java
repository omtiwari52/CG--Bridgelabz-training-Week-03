package file_reader.count_the_occurrence_of_word;

public class Main {
    public static void main(String[] args) {

        //storing result from method countWordOccurrences
        int count = CountTheOccurrence.countWordOccurrences("demo_file.txt", 'w');

        //print the count
        System.out.println("Total count of word is: "+ count);
    }
}
