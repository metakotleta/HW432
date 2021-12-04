public class Student {

    private String fio;
    private String group;
    private int studentId;

    public Student(String fio, String group, int studentId) {
        this.fio = fio;
        this.group = group;
        this.studentId = studentId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !o.getClass().equals(this.getClass())) return false;

        Student student = (Student) o;

        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", группа: " + group + ", номер билета: " + studentId;
    }
}
