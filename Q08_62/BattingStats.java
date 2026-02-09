/* Batting Statistics
*  Andereson, Franceschi
*/

public class BattingStats
{
  private int numberOfPlayers;
  private int [] atBats;
  private int [] hits;

  /** constructor
  *  @param startAtBats array with number of times each player batted
  *  @param startHits   array with number of hits per player
  *  startAtBats and startHits are equal length
  */
  public BattingStats( int [] startHits, int [] startAtBats )
  {
    //Add your code for the constructor here
  }

  /** accessor for numberOfPlayers
  * @return number of players
  */
  public int getNumberOfPlayers( )
  {
    //Add code to get number of players here.
  }

  /** accessor for atBats
  * @return array with number of at-bats per player
  */
  public int [] getAtBats( )
  {
    //Add code to get the number of at-bats for each player here
  }

  /** accessor for hits
  * @return array with number of hits per player
  */
  public int [] getHits( )
  {
    //Add code here to return the number of hits per player
  }

  /** mutator for atBats
  *  @param atBats number of times each player batted
  * @return a reference to this object
  */
  public BattingStats setAtBats( int [] atBats )
  {
    //add code here to set the number of At-Bats
  }

  /** mutator for hits
  *  @param hits number of times each player batted
  *  @return a reference to this object
  */
  public BattingStats setHits( int [] hits )
  {
  // Add code here to set the number of hits
  }

  // Note: we do not provide a mutator for numberOfPlayers
  //   because that number is derived from the size of the arrays
  //   when the constructor is called.

  /** toString
  * @return number of players, at bats, and hits
  */
  public String toString( )
  {
  //Add code here for toString
  }

  /** equals
  *   @param  o  another BattingStats object
  *   @return true if numberOfPlayers, atBats, and hits in this object
  *                are equal to those in parameter object; false otherwise.
  */
  public boolean equals( Object o )
  {
    //add code to compare two objects here
  }

  /** batting averages
  *  @return   array of batting averages for each player
  */
  public double [] battingAverages( )
  {
    //Add code here to return batting averages.
  }

  /** totalHits
  *  @return   total number of hits for the team
  */
  public int totalHits( )
  {
  //Add code here to return total number of hits
  }

  /** goodPlayers
  *  @return   number of players with a batting average > .300
  */
  public int goodPlayers( )
  {
    //Add code here to return the number of players with a batting average > .300
  }

  /** sortedHits
  *  @return   a sorted (in ascending order) array of hits
  */
  public int [] sortedHits( )
  {
    // Add code here to create and return a sorted array.
  }

  /** indexOfLargestElement
  *  @param    array an array of ints
  *  @param    size the size of the subarray
  *  @return   the index of the largest element in the subarray
  */
  private int indexOfLargestElement( int [] array, int size )
  {
    //Add code here to return the index of the largest element
  }

}