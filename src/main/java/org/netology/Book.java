package org.netology;

public class Book {
    String title;
    int releaseYear;
//    String author;
    Author author;
    int pages;

    public Book(String title, int releaseYear, String authorName, String authorSurname, double authorRating, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = new Author(authorName, authorSurname, authorRating);
        this.pages = pages;
    }

    public boolean isBig(){
        return (pages>500);
    }
    public boolean matches(String word){
        return (title.contains(word)||author.getName().contains(word)||author.getSurname().contains(word));
    }
    public int estimatePrice(){
        int initialPrice = (int) Math.floor(pages*3*Math.sqrt(author.getRating()));
        if(initialPrice<250){
            return 250;
        }else{
            return initialPrice;
        }
    }
}
