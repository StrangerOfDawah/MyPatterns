package patterns.Observer;

public interface Observable {
    void notifyMember();
    void addMember(Observer any);
    void removeMember(Observer any);
}
