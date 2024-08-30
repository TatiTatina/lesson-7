public class Studentitog {
    public static void main(String[] args) {
        Student student = new Student("Nick", 5,4,5,3);

        student.addGrade(5);
      System.out.println(student.toString());
    }
}
