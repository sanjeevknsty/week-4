import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class CourseType{
    private String subject;
    private String courseId;
    private int marks;

    public CourseType(String subject, String courseId,int marks) {
        this.subject = subject;
        this.courseId = courseId;
        this.marks = marks;
    }


    public int getMarks() {
        return marks;
    }


}
class ExamCousre extends CourseType{
    private int marks;
    public ExamCousre(String subject, String courseId,int marks) {
        super(subject, courseId,marks);
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
};

class AssignmentCourse extends CourseType {
    private int marks;

    public AssignmentCourse(String subject, String courseId, int marks) {
        super(subject, courseId, marks);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class ReasearchCourse extends CourseType {
    private int marks;

    public ReasearchCourse(String subject, String courseId, int marks) {
        super(subject, courseId, marks);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

}

class Course< T extends CourseType>{
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public int showMarks() {
        return courseType.getMarks();
    }

}

class HandleCourse{
    public static void getCourse(List<? extends Course> courses)  {
        int sum = 0;
        for(Course i : courses){
            sum += i.showMarks();
        }
        System.out.println("Total Marks : " + sum);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Course<ExamCousre> exam = new Course<>(new ExamCousre("Math", "123", 90));
        Course<AssignmentCourse> assignment = new Course<>(new AssignmentCourse("Math", "125", 70));
        Course<ReasearchCourse> reasearch = new Course<>(new ReasearchCourse("Math", "126", 60));

        System.out.println("Exam Marks : " + exam.showMarks());
        System.out.println("Assignment Marks : " + assignment.showMarks());
        System.out.println("Reasearch Marks : " + reasearch.showMarks());

        List<Course> courses = Arrays.asList(exam,assignment,reasearch);
        HandleCourse.getCourse(courses);

    }
}


