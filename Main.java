public class Main {
    public static void main(String[] args) {

        // The list of people who wants to be a students.
        Human peopleOne = new Human("John", "Bell", 21, "male", 181, 75.6);
        Human peopleTwo = new Human("Jane", "Carroll", 18, "female", 170, 48.7);
        Human peopleThree = new Human("Anna", "Smith", 19, "female", 174, 50.0);
        Human peopleFour = new Human("Nick", "Tompson", 22, "male", 178, 72.5);
        Human peopleFive = new Human("Kate", "Blange", 20, "female", 168, 78.2);
        Human peopleSix = new Human("Ben", "Bull", 17, "male", 181, 70.1);
        Human peopleSeven = new Human("Chris", "Peterson", 21, "male", 190, 92.8);
        Human peopleEight = new Human("Diane", "Holsson", 20, "female", 172, 46.3);
        Human peopleNine = new Human("George", "Klarkson", 17, "male", 178, 80.8);
        Human peopleTen = new Human("Pitt", "Erwin", 18, "male", 181, 85.1);
        Human peopleEleven = new Human("Paula", "Kotlin", 22, "female", 171, 47.3);

         Group genius = new Group(); // Create the new group of students

        //Change status for people who have become students.
        Student studentOne = new Student(peopleOne, "Finance", 5);
        Student studentTwo = new Student(peopleTwo, "Mathematic", 2);
        Student studentThree = new Student(peopleThree, "Logic", 3);
        Student studentFour = new Student(peopleFour, "Politic", 5);
        Student studentFive = new Student(peopleFive, "Finance", 5);
        Student studentSix = new Student(peopleSix, "Mathematic", 1);
        Student studentSeven = new Student(peopleSeven, "Logic", 5);
        Student studentEight = new Student(peopleEight, "Politic", 2);
        Student studentNine = new Student(peopleNine, "Mathematic", 4);
        Student studentTen = new Student(peopleTen, "Logic", 5);
        Student studentEleven = new Student(peopleEleven, "Politic", 3);//for reject of addition action test

      //Try to add new members into the student's group.
        try {
            genius.addStudentToTheGroup(studentOne);
            genius.addStudentToTheGroup(studentTwo);
            genius.addStudentToTheGroup(studentThree);
            genius.addStudentToTheGroup(studentFour);
            genius.addStudentToTheGroup(studentFive);
            genius.addStudentToTheGroup(studentSix);
            genius.addStudentToTheGroup(studentSeven);
            genius.addStudentToTheGroup(studentEight);
            genius.addStudentToTheGroup(studentNine);
            genius.addStudentToTheGroup(studentTen);

            //   Now will try to add a new member to the group where no more free spaces.
            genius.addStudentToTheGroup(studentEleven);
        } catch (AdditionalException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        genius.searchBySurname("Smith");
        genius.searchBySurname("Klarkson");
        genius.searchBySurname("Kennedy");

        //Try to remove bad students from the student's group.
        genius.removeStudentFromTheGroup(4);
        System.out.println(genius);

    }
}
