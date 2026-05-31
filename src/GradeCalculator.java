public class GradeCalculator {

    public int calculateTotal(Student student){
        int total = 0 ;
        for(int i=0; i<student.getMarks().length; i++){

            total += student.getMarks()[i];
        }
        return total;
    }

    public double calculateAverage(Student student){

        int total = calculateTotal(student);

        return (double) total / student.getMarks().length;
    }
    public String calculateGrade(double average){

        if(average >= 90)
            return "A+";

        else if(average >= 80)
            return "A";

        else if(average >= 70)
            return "B";

        else if(average >= 60)
            return "C";

        else if(average >= 50)
            return "D";

        else
            return "F";
    }

    public String getStatus(double average){

        if(average >= 50)
            return "PASS";

        return "FAIL";
    }

}
