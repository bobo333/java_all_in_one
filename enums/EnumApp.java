public class EnumApp {
  public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}

  public static void main(String[] args) {
    CardSuit suit;
    suit = CardSuit.SPADES;
    System.out.println("The suit is " + suit);
  }
}