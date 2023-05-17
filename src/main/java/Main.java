public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "Пылесос";
        card1.url = "https://site.by";

        Description description1 = new Description();
        description1.price = 120;
        description1.description = "Мощный, энергосберегающий пылесос";

        card1.description = description1;
    }
}
