public class Main {
    public static void main(String[] args) {

        // The list of people for test Task one.
        Human peopleOne = new Human("John", "Bell", 21, "male", 181, 75.6);
        Human peopleTwo = new Human("Jane", "Carroll", 18, "female", 170, 48.7);
        Human peopleThree = new Human("Anna", "Smith", 19, "female", 174, 50.0);
        System.out.println(peopleOne);
        System.out.println(peopleThree);

         Group genius = new Group(); // Create the new group of students

        //The list of students for test Task two.
        Student studentOne = new Student("John", "Bell", 21, "male", 181, 75.6,"Finance", 5);
        Student studentTwo = new Student("Jane", "Carroll", 18, "female", 170, 48.7,"Mathematic", 2);
        Student studentThree = new Student("Anna", "Smith", 19, "female", 174, 50.0,"Logic", 3);
        Student studentFour = new Student("Nick", "Tompson", 22, "male", 178, 72.5,"Politic", 5);
        Student studentFive = new Student("Kate", "Blange", 20, "female", 168, 78.2,"Finance", 5);
        Student studentSix = new Student("Ben", "Bull", 17, "male", 181, 70.1,"Mathematic", 1);
        Student studentSeven = new Student("Chris", "Peterson", 21, "male", 190, 92.8,"Logic", 5);
        Student studentEight = new Student("Diane", "Holsson", 20, "female", 172, 46.3,"Politic", 2);
        Student studentNine = new Student("George", "Klarkson", 17, "male", 178, 80.8,"Mathematic", 4);
        Student studentTen = new Student("Pitt", "Erwin", 18, "male", 181, 85.1,"Logic", 5);
        //for reject of addition action test
        Student studentEleven = new Student("Paula", "Kotlin", 22, "female", 171, 47.3,"Politic", 3);

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
//            System.out.println(genius); Проверить засаду: меняются индексы в цикле метода поиска по фамилии 
//            (похоже на слабый комп)

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

    }
}
