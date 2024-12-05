import java.util.ArrayList;

public class lab3 {
    public static void main(String[] args) {

        Literature book1 = new Literature("001", "Book", "Java Basics", 2012, "Pearson");
        Literature book2 = new Literature("002", "Book", "Advanced Java", 2011, "O'Reilly");
        Literature article1 = new Literature("003", "Article", "AI Innovations", 2010, "Tech Publisher");


        book1.setPages(300);
        book1.setAuthor("John Smith");

        book2.setPages(500);
        book2.setAuthor("Jane Doe");

        article1.setAuthor("Emily White");


        GroupLiterature group = new GroupLiterature();


        group.addLiterature(book1);
        group.addLiterature(book2);
        group.addLiterature(article1);


        System.out.println("Групы до обработки");
        System.out.println(group);


        group.removeLiteratureByCode("002");


        group.sortLiteratureByYear();


        System.out.println("После: ");
        System.out.println(group);
    }
}
