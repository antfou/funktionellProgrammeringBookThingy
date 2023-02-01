package LegoBooks;

import javax.sound.midi.Soundbank;
import java.util.Collections;

public class Main {
    Methods methods = new Methods();


    public Main(){
        //System.out.println("Books by Michelle Obama: "+methods.getBookByAuthor(methods.generateBookList(),"Michelle Obama").stream().map(Book::getTitle).toList());
        //System.out.println("Red books: "+methods.getBookByColor(methods.generateBookList(),"Red").stream().map(Book::getTitle).toList());
        //System.out.println("Books owned by Melvin Larsson: "+methods.getBookByOwner(methods.generateBookList(),"Melvin Larsson").stream().map(Book::getTitle).toList());
        //System.out.println("All books: "+methods.getStringListTitles(methods.generateBookList()));
        //System.out.println("All authors: "+methods.getStringListAuthors(methods.generateBookList()));
        //System.out.println("All books owned by Isak: "+methods.getStringListTitlesByOwner(methods.generateBookList(),"Isak Folke"));
        //System.out.println("All book titles from List<List>:"+methods.getStringListBookTitlesFromBookListList(methods.generateBookListList()));
        //System.out.println("Avarage book score: "+methods.getAverageScore(methods.generateBookList()));
        //System.out.println("All book titles: "+methods.getAllTitlesInSameString(methods.generateBookList()));
        //System.out.println("Avarage book score again: "+methods.getAvarageThroughSummaryStatistics(methods.generateBookList()));
        //System.out.println("Amount of brown books owned by Anton: "+methods.getAmountOfBooksByColorAndOwner(methods.generateBookList(),"Brown","Anton Fougner"));
        //System.out.println("Has Jeannette McCurdy written any of these books? "+methods.getIfAuthorExistsInList(methods.generateBookList(),"Jeannette McCurdy"));
    }


    public static void main(String[] args) {
        new Main();
    }
}
