public class Literature {
    private String code;
    private String type;
    private String title;
    private int year;
    private String publisher;
    private Integer pages;
    private String author;

    // Конструктор без author и pages
    public Literature(String code, String type, String title, int year, String publisher) {
        this.code = code;
        this.type = type;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.pages = null;
        this.author = null;
    }

    // Геттеры и сеттеры
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getPages() {
        if (pages == null) {
            return "??";
        }
        return pages.toString();
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getAuthor() {
        if (author == null || author.isEmpty()) {
            return "??";
        }
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return String.format("Code: %s\nType: %s\nTitle: %s\nYear: %d\nPublisher: %s\nPages: %s\nAuthor: %s",
                code, type, title, year, publisher, getPages(), getAuthor());
    }
}
