class Lecture extends Person {
    private String faculty;    
    private String university;   
    private double salaryFactor;

    public Lecture(String id, String name, String birthday, String gender, String hometown, String department, 
                   String faculty, String university, double salaryFactor) {
        super(id, name, birthday, gender, hometown, department);
        this.faculty = faculty;
        this.university = university;
        this.salaryFactor = salaryFactor;
    }

    public void displayInfo() {
        System.out.println("[Giang Vien] Ma: " + id + " | Ten: " + name + 
                           " | Khoa: " + faculty + " | Truong: " + university + 
                           " | HSL: " + salaryFactor);
    }
}