public class Student extends Human {

    private String faculty;
    private int course;
    public Human human;

    public Student(Human human, String faculty, int course) {
        super();
        this.faculty = faculty;
        this.course = course;
        this.human = human;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.human.getName() != null) {
            stringBuilder.append(this.human.getName() + " " + this.human.getSurname() + " (" + this.human.getSex() + ", age is " + this.human.getAge() + ", growth is " + this.human.getGrowth() + " sm, weight is " + human.getWeight() + " kg). This student is in ");
                if (this.human.getSex().equals("male")) {
                    stringBuilder.append("his ");
                } else {
                    stringBuilder.append("her ");
                }
                stringBuilder.append(this.getCourse());
                if (this.getCourse() == 1) {
                    stringBuilder.append("-st");
                }
                if (this.getCourse() == 2) {
                    stringBuilder.append("-nd");
                }
                if (this.getCourse() == 3) {
                    stringBuilder.append("-rd");
                }
                if (this.getCourse() == 4 || this.getCourse() == 5) {
                    stringBuilder.append("-th");
                }
                stringBuilder.append(" year of the faculty of " + this.getFaculty() + "s.");
            }
//        stringBuilder.append(System.lineSeparator());
        return stringBuilder.toString();
    }
}
