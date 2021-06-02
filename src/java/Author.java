package java;

import java.util.Date;

public class Author {
    int AuthorId;
    String Name;
    String Description;
    String Gender;
    Date BirthDate;
    String Image;
    String Website;
    int BooksCount;

    public Author() {
    }

    public int getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(int authorId) {
        AuthorId = authorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public int getBooksCount() {
        return BooksCount;
    }

    public void setBooksCount(int booksCount) {
        BooksCount = booksCount;
    }
}
