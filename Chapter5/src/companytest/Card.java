package companytest;

public class Card {
    private static int cardID = 10000;
    private int cardNum;

    public Card() {
        cardID++;
        cardNum = cardID;
    }

    public int getCardNum() { return cardNum; }

    public void setCardNum() { this.cardNum = cardNum; }
}
