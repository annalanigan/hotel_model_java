package People;

public class Party {

    private Guest organiser;
    private int partySize;

    public Party(Guest organiser, int partySize) {
        this.organiser = organiser;
        this.partySize = partySize;
    }

    public Guest getOrganiser() {
        return organiser;
    }

    public void setOrganiser(Guest organiser) {
        this.organiser = organiser;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }
}
