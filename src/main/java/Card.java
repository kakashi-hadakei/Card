
public class Card{
	//following constants represent various terms in cards
	public static final int HEARTS = 0;
	public static final int SPADES = 1;
	public static final int CLUBS = 2;
	public static final int DIAMONDS = 3;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	//attributes of a card
	private int suit;
	private int value;
	
	//constructors
	public Card(){
		//initialize a card with no attributes
		//later set by the setter methods
	}
	
	public Card(int inSuit,int inValue){
		//constructors with input suit and value
		this.suit = inSuit;
		this.value =  inValue;
	}
	
	//getters and setters
	public int getSuit(){
		return this.suit;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setSuit(int chSuit){
		this.suit = chSuit;
	}
	
	public void setValue(int chValue){
		this.value = chValue;
	}

	//compare 2 card
	public boolean equal(Card card){
		boolean isSame = false;
	
		if(this.suit == card.getSuit() && this.value == card.getValue()){
			isSame = true;
		}		
		
		return isSame;
	}
	
	//overwritten toString method
	//return the current status of a card
	//in a format of "value of suit"
	public String toString(){
		int value = this.value;
		int suit = this.suit;
		String current = "";
	
		
		switch(value){
			case 1:
				current += "Ace of ";
				break;
			case 2:
				current += "2 of ";
				break;
				
			case 3:
				current += "3 of ";
				break;
				
			case 4:
				current += "4 of ";
				break;
				
			case 5:
				current += "5 of ";
				break;
				
			case 6:
				current += "6 of ";
				break;
				
			case 7:
				current += "7 of ";
				break;
				
			case 8:
				current += "8 of ";
				break;
				
			case 9:
				current += "9 of ";
				break;
			
			case 10:
				current += "10 of ";
				break;
				
			case 11:
				current += "Jack of ";
				break;
				
			case 12:
				current += "Queen of ";
				break;
				
			case 13:
				current += "King of ";
				break;
			
		}
		
		switch (suit){
		case 0:
			current += "Heart";
			break;
			
		case 1:
			current += "Spade";
			break;
			
		case 2:
			current += "Club";
			break;
			
		case 3:
			current += "Diamond";
			break;
			
		}
		
		return current;
		
	}

}