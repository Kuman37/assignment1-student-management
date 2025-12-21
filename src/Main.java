public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amy Stake", "S001", "Computer Science");
        Student s2 = new Student("Elon Musk", "S002", "Mathematics");
        Student s3 = new Student("Isaac Newton", "S003", "Physics");
        Student s4 = new Student("Stanislav Drobyshevsky", "S004", "Anthropology ");
        Student s5 = new Student("Sigmund Freud", "S005", "Engineering");

        s1.updateGPA(2.0); s1.addCredits(60);
        s2.updateGPA(3.2); s2.addCredits(10);
        s3.updateGPA(3.9); s3.addCredits(45);
        s4.updateGPA(3.7); s4.addCredits(30);
        s5.updateGPA(2.5); s5.addCredits(15);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());


        Course javaCourse = new Course("Intro to Java", "Prof. Dumbledore", 5);
        javaCourse.addStudent(s1, 0);
        javaCourse.addStudent(s2, 1);
        javaCourse.addStudent(s3, 2);
        javaCourse.addStudent(s4, 3);
        javaCourse.addStudent(s5, 4);

        System.out.println(javaCourse.toString());

        System.out.println("Course average GPA: " + String.format("%.2f", javaCourse.courseAverageGPA()));
        System.out.println("Student with Highest Credits in Course: " + javaCourse.highestCreditStudent().getName());


        Student[] studentArray = {s1, s2, s3, s4, s5};

        Student topStudent = getTopStudent(studentArray);
        int honorsCount = countHonors(studentArray);
        int totalCredits = totalCredits(studentArray);

        System.out.println("Highest GPA Student: " + (topStudent != null ? topStudent.getName() : "N/A"));
        System.out.println("Number of honors Students: " + honorsCount);
        System.out.println("Total credits earned: " + totalCredits);
    }

    public static Student getTopStudent(Student[] arr) {
        if (arr == null || arr.length == 0) return null;
        Student top = arr[0];
        for (Student s : arr) {
            if (s != null && s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            if (s != null) {
                total += s.getCredits();
            }
        }
        return total;
    }
}