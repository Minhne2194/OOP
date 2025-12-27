class Staff extends Person {
    private String office;

    public Staff(String id, String name, String birthday, String gender, String hometown, String department, 
                 String office) {
        super(id, name, birthday, gender, hometown, department);
        this.office = office;
    }
	
    public void displayInfo() {
        System.out.println("[Nhan vien] Ma: " + id + " | Ten: " + name + 
                           " | Bo phan: " + department + " | Phong: " + office);
    }
}