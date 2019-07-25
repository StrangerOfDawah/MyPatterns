package patterns.Observer;

public class Application {
    public static void main(String[] args) {
        TelegramBot bot = new TelegramBot();
        bot.addMember(new Member());
        bot.setVideo("By Kenye West", "Stronger" );
}
}
