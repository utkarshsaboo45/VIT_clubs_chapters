package hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal;

/**
 * Created by utkarsh saboo on 13-03-2018.
 */

public class EventsList {

    private String title;
    private String description;
    private int imageId;

    public EventsList(String title, String description, int imageId)
    {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
    }

    public String getTitle()
    {
        return title;
    }
    public String getDescription()
    {
        return description;
    }
    public int getImageId()
    {
        return imageId;
    }

}
