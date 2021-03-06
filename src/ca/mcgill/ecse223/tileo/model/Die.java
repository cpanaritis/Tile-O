/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-9e8af9e modeling language!*/

package ca.mcgill.ecse223.tileo.model;
import java.util.Random;
import ca.mcgill.ecse223.tileo.application.TileOApplication;

import java.io.Serializable;

// line 88 "../../../../../main.ump"
public class Die implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Die Associations
  private Game game;

  private static final long serialVersionUID = 2382713981239L;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Die(Game aGame)
  {
    if (aGame == null || aGame.getDie() != null)
    {
      throw new RuntimeException("Unable to create Die due to aGame");
    }
    game = aGame;
  }

  public Die(int aCurrentConnectionPiecesForGame, Deck aDeckForGame)
  {
    game = new Game(aCurrentConnectionPiecesForGame, aDeckForGame, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public Game getGame()
  {
    return game;
  }

  public void delete()
  {
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
  }
  
    public int roll(){
   int max = 6;
   int min = 1;
   Random rand = new Random();
   int randomNum = rand.nextInt((max - min) + 1) + min;
   return randomNum;
  }

}
