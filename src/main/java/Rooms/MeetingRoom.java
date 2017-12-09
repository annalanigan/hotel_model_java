package Rooms;

import People.Party;

public class MeetingRoom extends Room{

    private double rate;
    private Party party;

    public MeetingRoom(String name, int capacity, double rate) {
        super(name, capacity);
        this.rate = rate;
    }

    public Party getParty() {
        return party;
    }

    public double getRate() {
        return rate;
    }

    public void checkInParty(Party party) {
        if (party.getPartySize() <= this.getCapacity()){
            this.party = party;
            this.party.getOrganiser().addToBill(this.getRate());}
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
