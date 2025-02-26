public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Волков");
        Author author2 = new Author("Антуан", "де Сент-Экзюпери");
        Book book1 = new Book("Маленький принц", author2, 1943);
        Book book2 = new Book("Волшебник Изумрудного города", author1, 1939);

        book1.setYearOfPublication(1938);
        System.out.println(book1.getYearOfPublication());
        System.out.println(book1);
        Book book3 = new Book("Волшебник Изумрудного города", author1, 1939);
        System.out.println(book2.equals(book3));
    }
}
