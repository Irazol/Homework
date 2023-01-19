package Lesson9.Task1;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        title.setTitle("Відьмак ");
        title.showTitle();

        Author author = new Author();
        author.setAuthor("Анджей Сапковський");
        author.showAuthor();

        Content content = new Content();
        content.setContent("Цикл романів в стилі фентезі. Головним героєм серії є Ґеральт із Рівії," +
                "\nвідьмак — мисливець на чудовиськ, що становлять загрозу для життя людей. У дитинстві" +
                "\nйому, як і іншим відьмакам, за допомогою мутацій було надано високих бойових якостей:" +
                "\nвеликої сили, блискавичної реакції, прискореного метаболізму і високої регенеративної здатності...");
        content.showContent();
    }
}
