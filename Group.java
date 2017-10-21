import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Group {

    private Student[] students = new Student[10];

    public Group() {
        super();
    }

    public void addStudentToTheGroup(Student student) throws AdditionalException {
        if (student == null) {
            throw new IllegalArgumentException("Nothing to add!");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        throw new AdditionalException();
    }

    public String[] searchBySurname(String surname) {
        int count = 0;
        int control = 0;
        String[] result = new String[1];
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getSurname().equals(surname)) {
                System.out.println("Found at position(s): " + (i + 1)+") "+students[i]);
                StringBuffer sb = new StringBuffer(String.valueOf(students[i]));
                control++;
                count++;
                String[] temp = new String[control];
                temp[control-1] = sb.toString();
                System.arraycopy(temp, 0, result, 0, temp.length);
            } else {
                count++;
            }
            if (count == students.length - 1 && control == 0) {
                System.out.println("A student with this surname " + surname+ " isn't present in Genius group's list.");
                return null;
            }
        }return result;
    }

    public void removeStudentFromTheGroup(int p) {
        if (p > 0 && p < students.length) {
            students[p - 1] = null;
            System.out.println("The line " + p + " is removed from the Genius group's table.");
        } else {
            System.out.println("You've entered not correct line's number in the Genius group's table.");
        }
    }

    private void sortBySurname() {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (compareStudentBySurname(students[i], students[j]) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    private int compareStudentBySurname(Student i, Student j) {
        if (i != null && j == null) {
            return 1;
        }
        if (i == null && j != null) {
            return -1;
        }
        if (i == null && j == null) {
            return 0;
        }
        return i.getSurname().compareTo(j.getSurname());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(System.lineSeparator());
        System.out.println("List of student's group \"Genius\":");
        int j = 1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                stringBuilder.append(Integer.toString(j) + ") " + students[i] + "\n");
                j++;
            }
        }
        return stringBuilder.toString();
    }
}



