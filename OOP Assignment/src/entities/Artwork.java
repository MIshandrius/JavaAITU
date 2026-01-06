package entities;

import java.util.Objects;

public class Artwork extends GalleryItem {
    private Artist artist;
    private int year;
    private double price;

    public Artwork(int id, String title, Artist artist, int year, double price) {
        super(id, title);
        this.artist = artist;
        this.year = year;
        this.price = price;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Artwork info : by id " + id + ", title '" + title + '\'' + ", artist " + artist.getName() + ", year " + year + ", price " + price + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artwork)) return false;
        Artwork artwork = (Artwork) o;
        return id == artwork.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

