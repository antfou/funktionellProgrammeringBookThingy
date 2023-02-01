package LegoBooks;




import org.junit.jupiter.api.Test;

class MethodsTest {

    @Test
    void genereateBookListTest(){
        Methods m = new Methods();
        assert(m.generateBookList().get(0).title.equals("Harry Potter and the Philisopher's Stone"));
        assert(m.generateBookList().get(0).isFiction);
    }


    @Test
    void getBookListByAuthorTest(){
        Methods m = new Methods();
        assert(m.getBookListByAuthor(m.generateBookList(),"Michelle Obama").get(0).author.equals("Michelle Obama"));
    }


    @Test
    void getBookListByColorTest(){
        Methods m = new Methods();
        assert(m.getBookListByColor(m.generateBookList(),"Red").get(0).color.equals("Red"));
    }


    @Test
    void getBookListByOwnerTest(){
        Methods m = new Methods();
        assert(m.getBookListByOwner(m.generateBookList(),"Anton Fougner").get(0).owner.equals("Anton Fougner"));
    }


    @Test
    void getStringListTitlesTest(){
        Methods m = new Methods();
        assert(m.getStringListTitles(m.generateBookList()).get(3).equals("The Lion the Witch and the Warderobe"));
    }


    @Test
    void getStringListAuthorsTest(){
        Methods m = new Methods();
        assert(m.getStringListAuthors(m.generateBookList()).get(3).equals("C.S. Lewis"));
    }


    @Test
    void getStringListTitlesByOwnerTest(){
        Methods m = new Methods();
        assert(m.getStringListTitlesByOwner(m.generateBookList(),"Anton Fougner").get(0).equals("The Lion the Witch and the Warderobe"));
    }


    @Test
    void generateBookListListTest(){
        Methods m = new Methods();
        assert(m.generateBookListList().get(1).get(2).getTitle().equals("The Nazi Conspiracy"));
    }


    @Test
    void getStringListBookTitlesFromBookListListTest(){
        Methods m = new Methods();
        assert(m.getStringListBookTitlesFromBookListList(m.generateBookListList()).get(0).equals("Harry Potter and the Philisopher's Stone"));
    }


    @Test
    void getAverageScoreTest(){
        Methods m = new Methods();
        assert(m.getAverageScore(m.generateBookList()) == (7.4));
    }


    @Test
    void getAllTitlesInSameStringTest(){
        Methods m = new Methods();
        assert(m.getAllTitlesInSameString(m.generateBookList()).equals("Harry Potter and the Philisopher's Stone, The Lord of the Rings, The Holy Bible, The Lion the Witch and the Warderobe, The Wheel of Time, Spare, The Light We Carry, The Nazi Conspiracy, I'm Glad My Mom Died, Friends, Lovers, and the Big Terrible Thing, "));
    }


    @Test
    void getAvarageThroughSummaryStatisticsTest(){
        Methods m = new Methods();
        assert(m.getAvarageThroughSummaryStatistics(m.generateBookList()) == 7.4);
    }


    @Test
    void getAmountOfBooksByColorAndOwnerTest(){
        Methods m = new Methods();
        assert(m.getAmountOfBooksByColorAndOwner(m.generateBookList(),"Yellow","Melvin Larsson") == 2);
    }


    @Test
    void getIfAuthorExistsInListTest(){
        Methods m = new Methods();
        assert(m.getIfAuthorExistsInList(m.generateBookList(),"Jeannette McCurdy"));
    }
}