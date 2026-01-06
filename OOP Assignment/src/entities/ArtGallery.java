package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArtGallery {
    private List<Artwork> artworks = new ArrayList<>();

    // Add artwork
    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    // Filter by artist name
    public List<Artwork> filterByArtist(String artistName) {
        return artworks.stream()
                .filter(a -> a.getArtist().getName().equalsIgnoreCase(artistName))
                .collect(Collectors.toList());
    }

    // Search by title
    public Artwork searchByTitle(String title) {
        return artworks.stream()
                .filter(a -> a.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    // Sort by price
    public List<Artwork> sortByPrice() {
        return artworks.stream()
                .sorted(Comparator.comparingDouble(Artwork::getPrice))
                .collect(Collectors.toList());
    }

    // Display all artworks
    public void displayAll() {
        artworks.forEach(System.out::println);
    }
}

