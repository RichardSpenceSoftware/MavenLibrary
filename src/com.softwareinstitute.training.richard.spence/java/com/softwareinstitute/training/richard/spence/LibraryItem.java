package com.softwareinstitute.training.richard.spence;

public abstract class LibraryItem {

    //////////////////////////////Attributes//////////////////////////

    private String name;
    private int reference;
    private String genre;

    /////////////////////////////Constructors/////////////////////////
    public LibraryItem(String name){
        this.name=name;
    }

    public LibraryItem(String name, int reference, String genre){
        this.name =name;
        this.reference = reference;
        this.genre = genre;
    }


    ///////////////////Methods//////////////////////////////////



    public void setGenre(String genre) {
        this.genre = genre;
        System.out.println("Genre");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name");
    }

    public void setReference(int reference){
        System.out.println("Reference number: " + reference);
    }

    public void setAuthor(String name) {
        this.name = name;
        System.out.println("Authors name");
    }
}
