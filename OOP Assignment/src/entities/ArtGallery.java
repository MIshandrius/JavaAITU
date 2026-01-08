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
    // Создаём копию списка, чтобы не менять оригинальный data pool
    List<Artwork> sortedList = new ArrayList<>(artworks);

    int n = sortedList.size();

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (sortedList.get(j).getPrice() > sortedList.get(j + 1).getPrice()) {
                // обмен элементов
                Artwork temp = sortedList.get(j);
                sortedList.set(j, sortedList.get(j + 1));
                sortedList.set(j + 1, temp);
            }
        }
    }

    return sortedList;
}

    // Display all artworks
    public void displayAll() {
        artworks.forEach(System.out::println);
    }
}


