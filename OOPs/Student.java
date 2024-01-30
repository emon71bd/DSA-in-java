package OOPs;
public class Student {
    String name;
    int rno;
    double percent;
    final String uvName = "DIU";
    private static int numOfStudents;

    public Student(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numOfStudents++;
    }
    public static int getNumOfStudents(){
        return numOfStudents;
    }

    public Student(){

    }
    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
        this.rno = rno;
    }
}

