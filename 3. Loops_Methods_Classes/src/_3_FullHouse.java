import java.util.ArrayList;

public class _3_FullHouse {
	// Generate and print all full houses and print their number.
	public static void main(String[] args) {
		String[] deck = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "\u2660", "\u2663", "\u2665", "\u2666" };
		int cardsCount = 0;
		ArrayList<String> cards = new ArrayList<>(52);
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards.add(deck[i] + suits[j]);
			}
		}
		for (int i = 0; i < cards.size(); i++) {
			for (int j = i + 1; j < cards.size(); j++) {
				for (int k = j + 1; k < cards.size(); k++) {
					for (int l = 0; l < cards.size(); l++) {
						for (int m = l + 1; m < cards.size(); m++) {
							String card1 = cards.get(i);
							String card2 = cards.get(j);
							String card3 = cards.get(k);
							String card4 = cards.get(l);
							String card5 = cards.get(m);
							if (card1.charAt(0) == card2.charAt(0)
									&& card1.charAt(0) == card3.charAt(0)) {
								if (card1.charAt(0) != card4.charAt(0)
										&& card4.charAt(0) == card5.charAt(0)) {
									System.out.printf("%s%s%s%s%s\n", card1,
											card2, card3, card4, card5);
									cardsCount++;
								}
							}
						}
					}
				}
			}
		}
		System.out.printf("Full house: %d", cardsCount);
	}
}
