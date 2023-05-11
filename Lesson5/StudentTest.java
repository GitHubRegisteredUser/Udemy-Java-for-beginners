package Lesson5;

public class StudentTest {

    public static void main(String[] args) {
        Student John = new Student();
        Student Mary = new Student();
        Student Ivan = new Student();

        John.studentIDCard = 1;
        John.studentName = "John";
        John.studentSurname = "Doe";
        John.yearOfEducation = 1;
        John.mathAVGScore = 4.74F;
        John.economicsAVGScore = 4.08F;
        John.foreignLanguageAVGScore = 4.22F;
        John.avgGrade(John);

        Mary.studentIDCard = 2;
        Mary.studentName = "Mary";
        Mary.studentSurname = "Brown";
        Mary.yearOfEducation = 2;
        Mary.mathAVGScore = 4.2F;
        Mary.economicsAVGScore = 4.84F;
        Mary.foreignLanguageAVGScore = 4.20F;
        Mary.avgGrade(Mary);

        Ivan.studentIDCard = 3;
        Ivan.studentName = "Ivan";
        Ivan.studentSurname = "Kapustin";
        Ivan.yearOfEducation = 3;
        Ivan.mathAVGScore = 4.74F;
        Ivan.economicsAVGScore = 4.42F;
        Ivan.foreignLanguageAVGScore = 4.41F;
        Ivan.avgGrade(Ivan);
    }

}

class Student {

    int studentIDCard;
    String studentName;
    String studentSurname;
    int yearOfEducation;
    float mathAVGScore;
    float economicsAVGScore;
    float foreignLanguageAVGScore;
    float GPA;

    double avgGrade(Student John) {
        GPA = (John.mathAVGScore + John.economicsAVGScore + John.foreignLanguageAVGScore) / 3;
        System.out.println(studentName + " GPA" + " is " + GPA);
        return GPA;
    }

}
