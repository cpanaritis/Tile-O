/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-9e8af9e modeling language!*/

package ca.mcgill.ecse223.tileo.model;
import java.util.*;
import ca.mcgill.ecse223.tileo.application.TileOApplication;

import java.io.Serializable;

// line 30 "../../../../../main.ump"
public abstract class Tile implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Tile Attributes
  private int x;
  private int y;
  private boolean hasBeenVisited;

  //Tile Associations
  private List<Connection> connections;
  private Game game;

  private static final long serialVersionUID = 1267381293123L;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Tile(int aX, int aY, Game aGame)
  {
    x = aX;
    y = aY;
    hasBeenVisited = false;
    connections = new ArrayList<Connection>();
    boolean didAddGame = setGame(aGame);
    if (!didAddGame)
    {
      throw new RuntimeException("Unable to create tile due to game");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public abstract void land();

  public boolean setX(int aX)
  {
    boolean wasSet = false;
    x = aX;
    wasSet = true;
    return wasSet;
  }

  public boolean setY(int aY)
  {
    boolean wasSet = false;
    y = aY;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasBeenVisited(boolean aHasBeenVisited)
  {
    boolean wasSet = false;
    hasBeenVisited = aHasBeenVisited;
    wasSet = true;
    return wasSet;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public boolean getHasBeenVisited()
  {
    return hasBeenVisited;
  }

  public boolean isHasBeenVisited()
  {
    return hasBeenVisited;
  }

  public Connection getConnection(int index)
  {
    Connection aConnection = connections.get(index);
    return aConnection;
  }

  public List<Connection> getConnections()
  {
    List<Connection> newConnections = Collections.unmodifiableList(connections);
    return newConnections;
  }

  public int numberOfConnections()
  {
    int number = connections.size();
    return number;
  }

  public boolean hasConnections()
  {
    boolean has = connections.size() > 0;
    return has;
  }

  public int indexOfConnection(Connection aConnection)
  {
    int index = connections.indexOf(aConnection);
    return index;
  }

  public Game getGame()
  {
    return game;
  }

  public static int minimumNumberOfConnections()
  {
    return 0;
  }

  public static int maximumNumberOfConnections()
  {
    return 4;
  }

  public boolean addConnection(Connection aConnection)
  {
    boolean wasAdded = false;
    if (connections.contains(aConnection)) { return false; }
    if (numberOfConnections() >= maximumNumberOfConnections())
    {
      return wasAdded;
    }

    connections.add(aConnection);
    if (aConnection.indexOfTile(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aConnection.addTile(this);
      if (!wasAdded)
      {
        connections.remove(aConnection);
      }
    }
    return wasAdded;
  }

  public boolean removeConnection(Connection aConnection)
  {
    boolean wasRemoved = false;
    if (!connections.contains(aConnection))
    {
      return wasRemoved;
    }

    int oldIndex = connections.indexOf(aConnection);
    connections.remove(oldIndex);
    if (aConnection.indexOfTile(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aConnection.removeTile(this);
      if (!wasRemoved)
      {
        connections.add(oldIndex,aConnection);
      }
    }
    return wasRemoved;
  }

  public boolean addConnectionAt(Connection aConnection, int index)
  {  
    boolean wasAdded = false;
    if(addConnection(aConnection))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConnections()) { index = numberOfConnections() - 1; }
      connections.remove(aConnection);
      connections.add(index, aConnection);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveConnectionAt(Connection aConnection, int index)
  {
    boolean wasAdded = false;
    if(connections.contains(aConnection))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfConnections()) { index = numberOfConnections() - 1; }
      connections.remove(aConnection);
      connections.add(index, aConnection);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addConnectionAt(aConnection, index);
    }
    return wasAdded;
  }

  public boolean setGame(Game aGame)
  {
    boolean wasSet = false;
    if (aGame == null)
    {
      return wasSet;
    }

    Game existingGame = game;
    game = aGame;
    if (existingGame != null && !existingGame.equals(aGame))
    {
      existingGame.removeTile(this);
    }
    game.addTile(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<Connection> copyOfConnections = new ArrayList<Connection>(connections);
    connections.clear();
    for(Connection aConnection : copyOfConnections)
    {
      if (aConnection.numberOfTiles() <= Connection.minimumNumberOfTiles())
      {
        aConnection.delete();
      }
      else
      {
        aConnection.removeTile(this);
      }
    }
    Game placeholderGame = game;
    this.game = null;
    placeholderGame.removeTile(this);
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "x" + ":" + getX()+ "," +
            "y" + ":" + getY()+ "," +
            "hasBeenVisited" + ":" + getHasBeenVisited()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null")
     + outputString;
  }
  
  public List<Tile> getNeighbours(int aRolledNumber){
   
   List<Tile> neighbours = new ArrayList<Tile>();
   
   //Base case below: if rolled number equals/reduces to 1:
   if(aRolledNumber == 1){
    int i;
    for(i = 0; i < connections.size(); i++){
     Connection connection = connections.get(i); 
     //List of tiles for a particular connection can only contain 2 tiles.
     //If tile at index 0 of this list is "this" tile, then tile at index 1 must be added as neighbor.
     if(connection.getTile(0) == this)
      neighbours.add(connection.getTile(1));
     else
      neighbours.add(connection.getTile(0));    
    }
   }
   
   //If rolled number is greater than 1:
   else{
    int i;
    for(i = 0; i < connections.size(); i++){
     Connection connection = connections.get(i);
     if(connection.getTile(0) == this)
      (connection.getTile(1)).getNeighbours(aRolledNumber - 1);
     else
      connection.getTile(0).getNeighbours(aRolledNumber - 1);
    }
   }
   
   return neighbours;
  }
}