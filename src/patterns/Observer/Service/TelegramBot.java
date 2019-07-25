package patterns.Observer.Service;
import patterns.Observer.Clients.Observer;

import java.util.LinkedList;


public class TelegramBot implements Observable {
    private String video;
    private String music;

    private LinkedList<Observer> members = new LinkedList<>();


    @Override
    public void addMember(Observer any) {
        members.add(any);
    }

    @Override
    public void removeMember(Observer any) {
        members.remove(any);
    }

    @Override
    public void notifyMember() {
        members.forEach(s -> s.action(video, music));
    }


    public void setVideo(String video, String music) {
        this.video = video;
        this.music = music;
        notifyMember();
    }
}
