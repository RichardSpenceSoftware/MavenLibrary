package com.softwareinstitute.training.richard.spence;

public class NonFiction extends LibraryItem implements Reading{


    ///////////////////////////Attributes////////////////////////////////
    private String datepublished;




    ///////////////////////////////Constructors/////////////////////////
    public NonFiction(String name, String datepublished){
        super(name);
        this.datepublished = datepublished;
    }



    ////////////////////Methods///////////////////////////
    public void Author(){System.out.println("This is the author"); }

    @Override
    public void Read() {

    }
}
