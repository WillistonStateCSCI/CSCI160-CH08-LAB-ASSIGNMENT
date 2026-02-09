/*  Student Grades
*   Anderson, Franceschi
*/
import java.util.Random;

public class Grades
{
  public final int MIN_GRADE = 0;
  public final int MAX_GRADE = 100;
  private int [] testGrades;

  /** constructor
  *  @param students number of students
  *    instantiates array with the size of students
  *    fills array with random grades between 0 and 100
  */
  public Grades( int students )
  {
  //Add code to create random grades arrays here.
  }

  /** accessor for testGrades
  *  @return copy of testGrades array
  */
  public int [] getTestGrades( )
  {
  // Add code to return test grades here
  }

  /** mutator for testGrades
  *  @param testGrades array to replace testGrades
  *  @return a reference to this object
  */
  public Grades setTestGrades( int [] testGrades )
  {
    // Add code to set test grades her
  }

  /** toString
  * @return elements of testGrades separated by a space
  */
  public String toString( )
  {
    //Add code for toString here
  }

  /** equals
  * @param o    another Grades object
  * @return     return true if elements of array in g2 are equal to
  *             corresponding elements in this object
  *             and arrays are the same length
  */
  public boolean equals( Object o )
  {
    //Add code to check if two objects are equal here.
  }

  /** sortGrades
  *   @return copy of testGrades in ascending order
  */
  public int [] sortGrades( )
  {
  //Add code to sort the grades here.
  }

  /**  indexOfLargestElement
  *    @param    array the array to search
  *    @param    size the size of the array to search
  *    @ return  the index of the largest element in the array
  */
  private int indexOfLargestElement( int [] array, int size )
  {
    //Add code to return the index of the largest element here.
  }

  /** highestGrade
  *   @return highest grade
  *      uses return value of indexOfLargestElement method
  */
  public int highestGrade( )
  {
    //Add code to return the highest grade here
  }

  /** averageGrade
  * @return the average of the grades in testGrades
  */
  public double averageGrade( )
  {
    //Add code to return the average of the grades
  }

  /** medianGrade
  *  @return the grade in the middle of the sorted testGrades array
  *  if number of elements is odd, return middle element
  *  if number of elements is even, return average of two middle elements
  */
  public int medianGrade( )
  {
    //Add code to return the median grade
  }

  /** modeGrade
  *  @return the grade that appears most often in the testGrades array
  */
  public int modeGrade( )
  {
    // create array of counters
    //Add code to return the mode grade.
  }
}