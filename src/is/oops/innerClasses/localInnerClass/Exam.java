package is.oops.innerClasses.localInnerClass;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Exam {
    void evaluate(int marks){
        class GradeCalculator {//local inner class

            String calculate() {
                if (marks >= 75) return "Distinction";
                else if (marks >= 60) return "First Class";
                else return "Pass";
            }
        }
            GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calculate());
    }//till here member class
    void displayExamDate(){
        LocalDate date=LocalDate.now().plusDays(5);
        System.out.println("The exam date is:"+date);
    }
    public static void main(String[] args) {
        Exam exam=new Exam();
        exam.evaluate(67);
        exam.evaluate(89);
        exam.displayExamDate();
    }
}
/*
ℹ️Points to Remember:
*Grade logic is scoped to the "Evaluate" method
*It avoids polluting the class  with helper methods
*It helps in designing the code base in a cleaner way
 */
//.now()-prints today's date
//minusdays() -- goes back
//plusdays() -- goes front