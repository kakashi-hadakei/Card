
import java.util.*;
public class Deck{
	private List<Card> deck;
	
	//instance constructor
	public Deck(){
		this.deck = new ArrayList<Card>();
	}
	
	public Deck(List<Card> deckOfCard){
		this.deck = deckOfCard;
	}
	
	//instance method
	public List<Card> getDeck(){
		//getter methd 
		return this.deck;
	}
	
	public Card dealOneCard(){
		Random generator = new Random();
		int pos = generator.nextInt(this.deck.size());
		Card removed;
		
		try{
			//remove a card at a randomized position
			removed = this.deck.remove(pos);
		}

		catch(IndexOutOfBoundsException e){
			//if callers draws more card than the deck has
			//return null 
			removed = null;			
		}

		return removed;
	}
	
	//add a card at the end of the deck
	public boolean add(Card card){
		return this.deck.add(card);
	}
	
	//add a deck at the end
	public boolean addDeck(Deck anotherDeck){
		return this.deck.addAll(anotherDeck.getDeck());
	}
	
	//shuffle the deck 
	public void shuffle(){
		Collections.shuffle(this.deck);	
	}
	
}