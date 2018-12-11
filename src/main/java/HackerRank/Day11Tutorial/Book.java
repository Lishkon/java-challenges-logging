package HackerRank.Day11Tutorial;

public class Book {

    // Properties, fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayChackedOut = -1;

    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsChechedOut() {
        return this.isCheckedOut;
    }

    public int getDayChackedOut() {
        return this.dayChackedOut;
    }

    // Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayChackedOut(currentDayCheckedOut);
    }

    private void setDayChackedOut(int day) {
        this.dayChackedOut = day;
    }


}
