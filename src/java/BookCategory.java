package java;

public class BookCategory {
    int BookCategoryId;
    int BookId;
    int CategoryId;

    public BookCategory() {
    }

    public int getBookCategoryId() {
        return BookCategoryId;
    }

    public void setBookCategoryId(int bookCategoryId) {
        BookCategoryId = bookCategoryId;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }
}
