package patterns.Observer.Service;

import patterns.Observer.Clients.Observer;

public interface Observable {
    void notifyMember();
    void addMember(Observer any);
    void removeMember(Observer any);
}
