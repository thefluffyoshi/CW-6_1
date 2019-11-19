//programming practice 6.1
public class Grade
{
    private String grades;
    private int cutoff;

    public Grade()
    {
        grades = null;
        cutoff = 0;
    }//end zero-arg constructor

    public Grade (String newGrades, int newCuttoff)
    {
        grades = newGrades;
        cutoff = newCuttoff;
    }//end constructor
}//end Grade
