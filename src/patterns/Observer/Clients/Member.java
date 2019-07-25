package patterns.Observer.Clients;

public class Member implements Observer {

    @Override
    public void action(String video, String music) {
        System.out.println("You got the music: " + "\"" + music + "\" "+ "and video: " + "\"" + video + "\"" + " from the bot.");
    }
}
