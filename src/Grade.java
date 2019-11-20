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

    //Getters
    public String getGrades()
    {
      return grades;
    }//end grades getter

    public int getCutoff()
    {
        return cutoff;
    }//end cutoff getter
}//end Grade
