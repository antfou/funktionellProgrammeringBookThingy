package LegoBooks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Methods {



    public Methods(){}


    public List<Book> generateBookList(){
        List<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book("Harry Potter and the Philisopher's Stone","J.K. Rowling","Fantasy",true,10,"Red","Olivia Fougner"));
        bookArrayList.add(new Book("The Lord of the Rings","J.R.R. Tolkien","Fantasy",true,10,"Green","Olivia Fougner"));
        bookArrayList.add(new Book("The Holy Bible","God","Fandom",false,8,"Yellow","Melvin Larsson"));
        bookArrayList.add(new Book("The Lion the Witch and the Warderobe","C.S. Lewis","Fantasy",true,8,"Brown","Anton Fougner"));
        bookArrayList.add(new Book("The Wheel of Time","Robert Jordan and Brandon Sanderson","Fantasy",true,9,"Red","Anton Fougner"));
        bookArrayList.add(new Book("Spare","Prince Harry","Biography",false,5,"Grey","Melvin Larsson"));
        bookArrayList.add(new Book("The Light We Carry","Michelle Obama","Biography",false,10,"White","Isak Folke"));
        bookArrayList.add(new Book("The Nazi Conspiracy"," Brad Meltzer and Josh Mensch","History",false,2,"Yellow","Isak Folke"));
        bookArrayList.add(new Book("I'm Glad My Mom Died","Jeannette McCurdy","Biography",false,5,"Yellow","Melvin Larsson"));
        bookArrayList.add(new Book("Friends, Lovers, and the Big Terrible Thing","Matthew Perry","Biography",false,7,"Blue","Linnéa Fougner"));
        return bookArrayList;
    }

    public List<List<Book>> generateBookListList(){
        List<List<Book>> bookArrayListList = new ArrayList<>();
        List<Book> bookArrayList1 = new ArrayList<>();
        List<Book> bookArrayList2 = new ArrayList<>();
        List<Book> bookArrayList3 = new ArrayList<>();
        bookArrayList1.add(new Book("Harry Potter and the Philisopher's Stone","J.K. Rowling","Fantasy",true,10,"Red","Olivia Fougner"));
        bookArrayList2.add(new Book("The Lord of the Rings","J.R.R. Tolkien","Fantasy",true,10,"Green","Olivia Fougner"));
        bookArrayList3.add(new Book("The Holy Bible","God","Fandom",false,8,"Brown","Melvin Larsson"));
        bookArrayList1.add(new Book("The Lion the Witch and the Warderobe","C.S. Lewis","Fantasy",true,8,"Brown","Anton Fougner"));
        bookArrayList2.add(new Book("The Wheel of Time","Robert Jordan and Brandon Sanderson","Fantasy",true,9,"Red","Anton Fougner"));
        bookArrayList3.add(new Book("Spare","Prince Harry","Biography",false,5,"Grey","Melvin Larsson"));
        bookArrayList1.add(new Book("The Light We Carry","Michelle Obama","Biography",false,10,"White","Isak Folke"));
        bookArrayList2.add(new Book("The Nazi Conspiracy"," Brad Meltzer and Josh Mensch","History",false,2,"Yellow","Isak Folke"));
        bookArrayList1.add(new Book("I'm Glad My Mom Died","Jeannette McCurdy","Biography",false,5,"Yellow","Melvin Larsson"));
        bookArrayList3.add(new Book("Friends Lovers and the Big Terrible Thing","Matthew Perry","Biography",false,7,"Blue","Linnéa Fougner"));
        bookArrayListList.add(bookArrayList1);
        bookArrayListList.add(bookArrayList2);
        bookArrayListList.add(bookArrayList3);
        return bookArrayListList;
    }


    public List<Book> getBookListByAuthor(List<Book> bookList, String author) {
        return bookList.stream().filter(b -> b.author.equals(author)).toList();
    }


    public List<Book> getBookListByColor(List<Book> bookList, String color) {
        return bookList.stream().filter(b -> b.color.equals(color)).toList();
    }


    public List<Book> getBookListByOwner(List<Book> bookList, String owner) {
        return bookList.stream().filter(b -> b.owner.equals(owner)).toList();
    }


    public List<String> getStringListTitles(List<Book> bookList){
        return bookList.stream().map(Book::getTitle).toList();
    }


    public List<String> getStringListAuthors(List<Book> bookList){
        return bookList.stream().map(Book::getAuthor).distinct().toList();
    }


    public List<String> getStringListTitlesByOwner(List<Book> bookList, String owner){
        return getBookListByOwner(bookList,owner).stream().map(Book::getTitle).distinct().toList();
    }


    public List<String> getStringListBookTitlesFromBookListList(List<List<Book>> bookListList){
        return bookListList.stream().flatMap(Collection::stream).map(Book::getTitle).toList();
    }


    public double getAverageScore(List<Book> bookList){
        return bookList.stream().map(Book::getScore).toList().stream().mapToDouble(e -> e).reduce(0,(sum,elem) -> sum + elem) /bookList.size();
    }


    public String getAllTitlesInSameString(List<Book> bookList){
        return bookList.stream().map(Book::getTitle).toList().stream().reduce("",(sum,elem) -> sum+elem+", ");
    }


    public double getAvarageThroughSummaryStatistics(List<Book> bookList){
        return bookList.stream().map(Book::getScore).toList().stream().mapToDouble(e->e).summaryStatistics().getAverage();
    }


    public double getAmountOfBooksByColorAndOwner(List<Book> bookList, String color, String owner){
        return getBookListByColor(getBookListByOwner(bookList,owner),color).stream().count();
    }


    public boolean getIfAuthorExistsInList(List<Book> bookList, String author){
        return bookList.stream().anyMatch(book -> book.getAuthor().equals(author));
    }
}
