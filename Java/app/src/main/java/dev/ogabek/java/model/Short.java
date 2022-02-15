package dev.ogabek.java.model;

public class Short {

    private final String title;
    private final String view;
    private final int photo;

    public Short(String title, String view, int photo) {
        this.title = title;
        this.view = view;
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public String getView() {
        return view;
    }

    public int getPhoto() {
        return photo;
    }
}
