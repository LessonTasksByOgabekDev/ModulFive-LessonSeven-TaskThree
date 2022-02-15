package dev.ogabek.java.model;

import java.util.List;

public class Feed {

    private int profilePhoto;
    private int picture;
    private String time;
    private String title;
    private String description;

    private List<Short> shorts;

    public Feed(List<Short> shorts) {
        this.shorts = shorts;
    }

    public Feed(int profilePhoto, int picture, String time, String title, String description) {
        this.profilePhoto = profilePhoto;
        this.picture = picture;
        this.time = time;
        this.title = title;
        this.description = description;
    }

    public List<Short> getShorts() {
        return shorts;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getPicture() {
        return picture;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
