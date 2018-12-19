package hk.ust.cse.comp107x.vit_clubs_chapters.ContactClubChapter;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * Created by utkarsh saboo on 27-03-2018.
 */

public class ContactDetails {
    private int logo;
    private String clubChapterTitle;
    private String clubChapterDetail1;
    private String clubChapterDetail2;
    private int imageIDCall = R.drawable.phone;
    private int imageIDMail = R.drawable.mail;
    private String contactNumber;
    private String emailID;
    private String content = "Club/Chapter Details here!!";

    public ContactDetails(int logo, String clubChapterTitle, String clubChapterDetail1, String clubChapterDetail2, String contactNumber, String emailID, String content)
    {
        this.logo = logo;
        this.clubChapterTitle = clubChapterTitle;
        this.clubChapterDetail1 = clubChapterDetail1;
        this.clubChapterDetail2 = clubChapterDetail2;
        this.contactNumber = contactNumber;
        this.emailID = emailID;
        this.content = content;
    }

    public int getImageIDLogo()
    {
        return logo;
    }

    public String getClubChapterTitle()
    {
        return clubChapterTitle;
    }

    public String getClubChapterDetail1()
    {
        return clubChapterDetail1;
    }

    public String getClubChapterDetail2()
    {
        return clubChapterDetail2;
    }

    public int getImageIDCall()
    {
        return imageIDCall;
    }

    public int getImageIDMail()
    {
        return imageIDMail;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public String getEmailID()
    {
        return emailID;
    }

    public String getContent()
    {
        return content;
    }

}
