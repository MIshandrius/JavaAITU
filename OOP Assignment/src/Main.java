import entities.Artwork;
import entities.ArtGallery;
import entities.Artist;

public class Main {
     public static void main(String[] args) {

          Artist vanGogh = new Artist(1, "Vincent van Gogh", "Netherlands");
          Artist daVinci = new Artist(2, "Leonardo da Vinci", "Italy");

          Artwork a1 = new Artwork(101, "Starry Night", vanGogh, 1889, 1000000);
          Artwork a2 = new Artwork(102, "Sunflowers", vanGogh, 1888, 850000);
          Artwork a3 = new Artwork(103, "Mona Lisa", daVinci, 1503, 5000000);

          ArtGallery gallery = new ArtGallery();
          gallery.addArtwork(a1);
          gallery.addArtwork(a2);
          gallery.addArtwork(a3);

          System.out.println(" All Artworks ");
          gallery.displayAll();

          System.out.println("\n Filter by Artist: Van Gogh ");
          gallery.filterByArtist("Vincent van Gogh").forEach(System.out::println);

          System.out.println("\n Sorted by Price ");
          gallery.sortByPrice().forEach(System.out::println);

          System.out.println("\n Search by Title ");
          System.out.println(gallery.searchByTitle("Mona Lisa"));
     }
}
