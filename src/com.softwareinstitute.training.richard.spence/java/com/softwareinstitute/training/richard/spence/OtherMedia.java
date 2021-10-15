package com.softwareinstitute.training.richard.spence;

public class OtherMedia extends LibraryItem{

    //////////////////////Attributes/////////////////////////////////

    private String MediaType;



    ///////////////////////////////Constructors/////////////////////////
    public OtherMedia(String name, String MediaType){
        super(name);
        this.MediaType = MediaType;
    }


    ////////////////////Methods///////////////////////////
    public String getMedia() {
        return MediaType;
    }

    public void getMedia(String MediaType) {
        this.MediaType = MediaType;
    }

}
