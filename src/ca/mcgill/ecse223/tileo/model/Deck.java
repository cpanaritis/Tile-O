/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-9e8af9e modeling language!*/

package ca.mcgill.ecse223.tileo.model;
import java.util.*;
import ca.mcgill.ecse223.tileo.application.TileOApplication;

import java.io.Serializable;

// line 57 "../../../../../main.ump"
public class Deck implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Deck Associations
  private List<ActionCard> cards;
  private ActionCard currentCard;
  private Game game;

  private static final long serialVersionUID = 7283492340912L;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Deck(Game aGame)
  {
    cards = new ArrayList<ActionCard>();
    if (aGame == null || aGame.getDeck() != null)
    {
      throw new RuntimeException("Unable to create Deck due to aGame");
    }
    game = aGame;
  }

  public Deck(int aCurrentConnectionPiecesForGame, Die aDieForGame)
  {
    cards = new ArrayList<ActionCard>();
    game = new Game(aCurrentConnectionPiecesForGame, this, aDieForGame);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public ActionCard getCard(int index)
  {
    ActionCard aCard = cards.get(index);
    return aCard;
  }

  public List<ActionCard> getCards()
  {
    List<ActionCard> newCards = Collections.unmodifiableList(cards);
    return newCards;
  }

  public int numberOfCards()
  {
    int number = cards.size();
    return number;
  }

  public boolean hasCards()
  {
    boolean has = cards.size() > 0;
    return has;
  }

  public int indexOfCard(ActionCard aCard)
  {
    int index = cards.indexOf(aCard);
    return index;
  }

  public ActionCard getCurrentCard()
  {
    return currentCard;
  }

  public boolean hasCurrentCard()
  {
    boolean has = currentCard != null;
    return has;
  }

  public Game getGame()
  {
    return game;
  }

  public static int minimumNumberOfCards()
  {
    return 0;
  }

  public static int maximumNumberOfCards()
  {
    return 32;
  }

  public boolean addCard(ActionCard aCard)
  {
    boolean wasAdded = false;
    if (cards.contains(aCard)) { return false; }
    if (numberOfCards() >= maximumNumberOfCards())
    {
      return wasAdded;
    }

    Deck existingDeck = aCard.getDeck();
    boolean isNewDeck = existingDeck != null && !this.equals(existingDeck);
    if (isNewDeck)
    {
      aCard.setDeck(this);
    }
    else
    {
      cards.add(aCard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCard(ActionCard aCard)
  {
    boolean wasRemoved = false;
    //Unable to remove aCard, as it must always have a deck
    if (!this.equals(aCard.getDeck()))
    {
      cards.remove(aCard);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addCardAt(ActionCard aCard, int index)
  {  
    boolean wasAdded = false;
    if(addCard(aCard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCards()) { index = numberOfCards() - 1; }
      cards.remove(aCard);
      cards.add(index, aCard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCardAt(ActionCard aCard, int index)
  {
    boolean wasAdded = false;
    if(cards.contains(aCard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCards()) { index = numberOfCards() - 1; }
      cards.remove(aCard);
      cards.add(index, aCard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCardAt(aCard, index);
    }
    return wasAdded;
  }

  public boolean setCurrentCard(ActionCard aNewCurrentCard)
  {
    boolean wasSet = false;
    currentCard = aNewCurrentCard;
    wasSet = true;
    return wasSet;
  }
  public void shuffle() throws Exception {
    Collections.shuffle(cards);
    try {
    	ActionCard topCard = cards.get(0);
    	setCurrentCard(topCard);
    } catch (Exception e) {
    	throw new Exception("Empty deck");
    }
  }
  public void clearDeck() {
	  while (cards.size() > 0)
	    {
	      ActionCard aCard = cards.get(cards.size() - 1);
	      aCard.delete();
	      cards.remove(aCard);
	    }
  }
  public void delete()
  {
    while (cards.size() > 0)
    {
      ActionCard aCard = cards.get(cards.size() - 1);
      aCard.delete();
      cards.remove(aCard);
    }
    
    currentCard = null;
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
  }

}