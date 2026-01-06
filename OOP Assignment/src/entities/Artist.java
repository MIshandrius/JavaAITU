package entities;

import java.util.Objects;

public class Artist {
    private int artistId;
    private String name;
    private String country;

    public Artist(int artistId, String name, String country) {
        this.artistId = artistId;
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist info : id " + artistId + ", name '" + name + "', country '" + country + "'.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return artistId == artist.artistId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId);
    }
}
