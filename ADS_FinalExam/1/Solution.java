import java.util.Scanner;

class Student {
	String Name;
	String Rollno;
	double total_marks;

	public Student(String name, String rollno, double total_marks) {

		Name = name;
		Rollno = rollno;
		this.total_marks = total_marks;
	}

}

class Hash {
	int n;

	public Hash(int m) {
		this.n = m;
	}

	public int hashfunction(String st) {
		int sum = 0;
		for (int i = st.length() - 1; i > 0; i--)

		{
			sum = sum * 17 + (i + i + 1) * st.charAt(i);
		}
		sum = sum % n;

		return sum;
	}

}

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int student_records = sc.nextInt();
		Student student[] = new Student[student_records * 5];
		Hash h = new Hash(student_records * 5);
		sc.nextLine();
		String string[] = new String[student_records];
		for (int i = 0; i < student_records; i++) {
			String s1 = sc.nextLine();

			String s2[] = s1.split(",");
			int hc = h.hashfunction(s2[0]);
			string[i] = s2[0];
			Student stud = new Student(s2[1], s2[0], Double.parseDouble(s2[2]));
			student[hc] = stud;
		}

		int n2 = sc.nextInt();
		String x = sc.next();
		int c = 0;
		for (int i = 0; i < n2; i++) {
			String s1 = sc.nextLine();
			c = 0;
			String s2[] = s1.split(" ");
			for (int j = 0; j < string.length; j++) {
				if (s2[1].equals(string[j])) {
					c++;
					break;
				}
			}
			if (c == 1) {

				switch (s2[2]) {
				case "1":
					System.out.println(student[h.hashfunction(s2[1])].Name);
					break;

				case "2":
					System.out.println(student[h.hashfunction(s2[1])].total_marks);
					break;
				}
			} else {
				System.out.println("Student doesn't exists...");
			}
		}

	}
}
