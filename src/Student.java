import java.util.Arrays;

class Student{
    String name;
    private int[]grades;

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            if(grades[i]<2||grades[i]>5) throw new IllegalArgumentException();
            this.grades[i]=grades[i];
        }
    }

    public void addGrade(int x){
        grades= Arrays.copyOf(grades, grades.length+1);
        if(x<2||x>5) throw new IllegalArgumentException();
        grades[grades.length-1]=x;
    }

    public int[] getGrades() {
        return grades.clone();
    }

    public String toString() {
        return  name + ":" + Arrays.toString(grades);
    }
}

