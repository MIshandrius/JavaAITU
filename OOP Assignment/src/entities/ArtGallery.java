package entities;

public class ArtGallery {
    public ArtGallery(){

    }

    private String Artist;
    private String Artwork;
    private String Gallery;

    // Artist getter setter
    public String getArtist(){
        this.printArtist();
        return this.Artist;
    }

    public void setArtist(String name){
        this.Artist = name;
    }

    // Artwork getter setter
    public String getArtwork(){
        this.printArtwork();
        return this.Artwork;
    }

    public void setArtwork(String art){
        this.Artwork = art;
    }

    // Gallery getter setter
    public String getGallery(){
        this.printGallery();
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

    private void printArtist(){
        System.out.println(this.Artist);
    }

    private void printArtwork(){
        System.out.println(this.Artwork);
    }

    private void printGallery(){
        System.out.println(this.Gallery);
    }



}