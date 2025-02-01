import java.util.Scanner;

public  class Student {
        private String name;
        private int rollNumber;
        private float marks;

        public Student(String name, int rollNumber, float marks){
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        public void displayDetails(){
            System.out.println("Name: "+name+", Roll Number: "+ rollNumber +", Marks: " + marks);
        }
        public void updateMarks(float newMarks){
            this.marks = newMarks;
        }

        public void updateMarksByPercentage(float percentage) {
            this.marks += this.marks * (percentage / 100);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int rollNumber = scanner.nextInt();
            float marks = scanner.nextFloat();
    
            Student student = new Student(name, rollNumber,marks);
    
            System.out.println("\nUpdate marks:");
            System.out.print("New Marks: ");
            float newMarks = scanner.nextFloat();
            student.updateMarks(newMarks);
            System.out.print("Updated Details: ");
            student.displayDetails();
            
            System.out.println("\nUpdate marks by percentage increase:");
            System.out.print("Percentage: ");
            float percentage = scanner.nextFloat();
            student.updateMarksByPercentage(percentage);
            System.out.print("Updated Details: ");
            student.displayDetails();
            
            scanner.close();
        }
    }


