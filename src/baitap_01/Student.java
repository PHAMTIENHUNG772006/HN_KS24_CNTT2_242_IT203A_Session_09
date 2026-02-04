package baitap_01;

public class Student extends Person{
    private String student_id;
    private double avgScore;

    public Student(String student_id,double avgScore,String name, int age){
        super(name,age);
        this.student_id = student_id;
        this.avgScore = avgScore;
    }

    public String getStudent_id() {
        return student_id;
    }

    public double getAvgScore() {
        return avgScore;
    }

    @Override
    public String displayImfo() {
        return "Mã sinh viên : " + this.getStudent_id() + "\n" + super.displayImfo() + "\n" + "Điểm trung bình : " + this.getAvgScore();
    }
}
