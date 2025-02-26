public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Волков");
        Author author2 = new Author("Маленький принц", "де Сент-Экзюпери");
        Book book1 = new Book("Маленький принц", author2, 1943);
        Book book2 = new Book("Волшебник Изумрудного города", author1, 1939);

    }
}