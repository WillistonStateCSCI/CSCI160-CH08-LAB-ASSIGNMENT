/* BattingStats Client
*  Calculates batting statistics for a baseball team
*  Anderson, Franceschi
*/

//Do NOT make ANY changes in this file.

import java.text.DecimalFormat;

public class BattingStatsClient
{
  public static void main( String [] args )
  {
    int [] teamHits = { Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), 
      Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), 
      Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8]) };
    int [] teamAtBats = { Integer.parseInt(args[9]), Integer.parseInt(args[10]), Integer.parseInt(args[11]), 
      Integer.parseInt(args[12]), Integer.parseInt(args[13]), Integer.parseInt(args[14]),
      Integer.parseInt(args[15]), Integer.parseInt(args[16]), Integer.parseInt(args[17]) };

    // instatiate an object calling the overloaded constructor
    BattingStats bStat1 = new BattingStats( teamHits, teamAtBats );

    // call toString
    System.out.println( "bStat1:\n" + bStat1 );

    // instantiate identical object
    BattingStats bStat2 = new BattingStats( teamHits, teamAtBats );

    System.out.println( "\nbStat2:" );
    // calling accessors
    System.out.println( "The number of players is " + bStat2.getNumberOfPlayers( ) );

    System.out.print( "The hits for each player are: " );
    int [] tempHits = bStat2.getHits( );

    for ( int i = 0; i < tempHits.length; i++ )
    {
      System.out.print( tempHits[i] + " " );
    }
    System.out.println( );

    System.out.print( "The at-bats for each player are: " );
    int [] tempAtBats = bStat2.getAtBats( );

    for ( int i = 0; i < tempAtBats.length; i++ )
    {
      System.out.print( tempAtBats[i] + " " );
    }
    System.out.println( );

    // test equals
    if ( bStat1.equals( bStat2 ) )
        System.out.println( "Objects are equal" );
    else
        System.out.println( "Objects are not equal" );

    // change some data
    System.out.println( "\nUsing mutators to change bStat2 data" );
    teamAtBats[0] = 99;
    bStat2.setAtBats( teamAtBats );

    teamHits[0] = 30;
    bStat2.setHits( teamHits );

    // call toString
    System.out.println( "\nbStat2:\n" + bStat2 );

    // test equals again
    if ( bStat1.equals( bStat2 ) )
       System.out.println( "Objects are equal" );
    else
       System.out.println( "Objects are not equal" );

    double [] battingAverages = bStat2.battingAverages( );
    DecimalFormat batAvg = new DecimalFormat( "#.000" );

    System.out.println( "\nbStat2 batting averages:" );
    for ( int i = 0; i < battingAverages.length; i++ )
    {
      System.out.print( batAvg.format( battingAverages[i] ) + " " );
    }
    System.out.println( );

    System.out.println( "\nbStat2: The total number of hits is "
                        + bStat2.totalHits( ) );

    System.out.println( "\nbStat2: The number of players with "
                        + "a batting average greater than .300 is "
                        + bStat2.goodPlayers( ) );

    int [] hits = bStat2.getHits( );
    System.out.println( "The hits are: " );
    for( int i = 0; i < hits.length; i++ )
      System.out.print( hits[i] + " " );
    System.out.println( );

    int [] sortedHits = bStat2.sortedHits( );
    System.out.println( "The sorted hits are: " );
    for( int i = 0; i < sortedHits.length; i++ )
      System.out.print( sortedHits[i] + " " );
    System.out.println( );

  }
}