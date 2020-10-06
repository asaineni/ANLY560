
public class JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Grade variables initialization of a student
		double grade1= 91.14;
		double grade2= 85.01;
		double grade3= 72; 
		double grade4= 63; 
		double grade5= 81.14;
		
		double sumGrades = grade1 + grade2 + grade3 + grade4 + grade5;
		System.out.println("Sum of Student Grades = " + sumGrades);
		
		double avgGrade = sumGrades/5;
		System.out.println("Average of Student Grades = " + avgGrade);
		
		//more than 90.00 and less than 100 it prints “A: Fantastic job!”
		if (avgGrade > 90.00 && avgGrade <= 100) {
			System.out.println("A: Fantastic job!"); 
		}
		else if (avgGrade > 80.00 && avgGrade <= 89.99) {
		//between 80 to 89.99, it prints: “B: Good!”
			System.out.println("B: Good!"); 
		}
		else if (avgGrade > 70.00 && avgGrade <= 79.99) {
		//between 70 to 79.99, it prints “C: Please try more next time!”
			System.out.println("C: Please try more next time!"); 
		}
		else if (avgGrade <= 69.99) {
		//69.99 or less, it prints “F: Unfortunately you failed!”
			System.out.println("F: Unfortunately you failed!"); 
		}
		else {
			System.out.println("Oops! Invalid grade is provided");
		}

	}
	
}
