package brains;//package java;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

@ManagedBean(name="book")
@SessionScoped
public class Book extends BaseDbModel {
    int AuthorId;
    String Name = "lolo";
    String Description;
    int PagesCount;
    Date PublishedAt;
    String Image;
    float price;
    int CommentsCount;
    float AvgRate;
    int RatesCount;

    public Book() {
        super();
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

    public int getPagesCount() {
        return PagesCount;
    }

    public void setPagesCount(int pagesCount) {
        PagesCount = pagesCount;
    }

    public Date getPublishedAt() {
        return PublishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        PublishedAt = publishedAt;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCommentsCount() {
        return CommentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        CommentsCount = commentsCount;
    }

    public float getAvgRate() {
        return AvgRate;
    }

    public void setAvgRate(float avgRate) {
        AvgRate = avgRate;
    }

    public int getRatesCount() {
        return RatesCount;
    }

    public void setRatesCount(int ratesCount) {
        RatesCount = ratesCount;
    }

    public String BooksCount() throws Exception{

        prepareDbc();

        PreparedStatement ps = dbc.prepareStatement("select count(*) as booksCount from book");

        ResultSet rs = ps.executeQuery();

        rs.next();

        return String.valueOf(rs.getInt("booksCount"));
    }
}
