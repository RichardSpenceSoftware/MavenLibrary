package com.softwareinstitute.training.richard.spence;

public class Fiction extends LibraryItem implements Reading{


    ///////////////////////////Attributes////////////////////////////////
    private String datepublished;




    ///////////////////////////////Constructors/////////////////////////
    public Fiction(String name, String datepublished){
        super(name);
        this.datepublished = datepublished;

    }


    ////////////////////Methods///////////////////////////

    public String getDate() {
        return datepublished;
    }

    public void getDate(String datepublished) {
        this.datepublished = datepublished;
    }

    @Override
    public void Read() {

    }
}
