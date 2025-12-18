package entities;

public class ArtGallery {
    public ArtGallery(){

    }

    private String Artist;
    private String Artwork;
    private String Gallery;

    // Artist setter

    public void setArtist(String name){
        this.Artist = name;
    }

    // Artwork setter

    public void setArtwork(String art){
        this.Artwork = art;
    }

    // Gallery getter setter
    public String getGallery(){
        return this.Gallery;
    }

    public void setGallery(String gal){
        this.Gallery = gal;
    }

    //What gallery
    public String whatGallery(){
        return this.Gallery;
    }

    //Output
    public String toString(){
        return "Artist : " + this.Artist + "; Artwork: " + this.Artwork + "; Gallery: " + this.Gallery;
    }




}