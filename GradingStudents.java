//this exercise is from https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
  public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> groundUpGrading = new ArrayList<>();

    for (int grade: grades) {
      Integer firstGradeDigit = grade / 10;
      Integer secondGradeDigit = grade % 10;

      if (secondGradeDigit < 5) {
        secondGradeDigit = 5;
      } else if (secondGradeDigit > 5) {
        secondGradeDigit = 0;
        firstGradeDigit += 1;
      }

      Integer newGrade = firstGradeDigit*10 + secondGradeDigit;
      if (newGrade - grade < 3 && newGrade >= 40) {
        groundUpGrading.add(newGrade);
      } else {
        groundUpGrading.add(grade);
      }
    }
    return groundUpGrading;
  }

  public static void main(String args[]) {
    List<Integer> grades = Arrays.asList(73, 67, 38, 33);
    GradingStudents gradingStudents = new GradingStudents();
    gradingStudents.gradingStudents(grades);
  }
}
