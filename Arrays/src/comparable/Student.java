package comparable;

public class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;
	private Student Student;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    
    //getter and setter methods same as the above example 
    public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

    
    @Override
	public int compareTo(Student comparestu) {
        int compareage=comparestu.getStudentage();
        /* For Ascending order*/
        System.out.println("compareage:"+compareage);        
        System.out.println("studentage:"+this.studentage);
        return this.studentage-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
       
    
   	@Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

	
}