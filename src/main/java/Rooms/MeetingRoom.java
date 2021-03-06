package Rooms;

import People.Party;

public class MeetingRoom extends Room{

    private double rate;
    private Party party;

    public MeetingRoom(MeetingType type) {
        super(type.getPretty(), type.getCapacity());
        this.rate = type.getRate();
    }

    public Party getParty() {
        return party;
    }

    public double getRate() {
        return rate;
    }

    public boolean checkAvailable(){
        return this.party == null;
    }

    public void checkInParty(Party party) {
        if ((this.party == null)&&(party.getPartySize() <= this.getCapacity())){
            this.party = party;
            this.party.getOrganiser().addToBill(this.getRate());}
    }

    public void checkOutParty(){
        this.party = null;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
