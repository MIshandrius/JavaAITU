package entities;

public abstract class GalleryItem {
    protected int id;
    protected String title;

    public GalleryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public abstract double getPrice();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
