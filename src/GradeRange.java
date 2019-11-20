public class GradeRange
{
    //Stores the possible grades and their numeric lowest value,
    // then prints them out.
    public static void main (String[] args)
    {
       // String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-",
       //                     "D+", "D", "D-", "F"};
        //int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
        Grade[] grades1 = {new Grade("A", 95),
                new Grade("A-", 90),
                new Grade("B+", 87),
                new Grade("B", 83),
                new Grade("B-", 80),
                new Grade("C+", 77),
                new Grade("C", 73),
                new Grade("C-", 70),
                new Grade("D+", 67),
                new Grade("D", 63),
                new Grade("D-", 60),
                new Grade("F", 0)};
        for (int level = 0; level < grades1.length; level++)
            System.out.println (grades1[level].getGrades() + " " + grades1[level].getCutoff() + "\t");
    }//end main
}//end class GradeRange
