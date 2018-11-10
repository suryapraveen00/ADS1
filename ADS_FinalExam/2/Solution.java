public class Solution {

	static StudentDetails[] stdnt;
	static ArrayList<StudentDetails> arlist;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student records");
		int student_records = sc.nextInt();
		sc.nextLine();
		arlist = new ArrayList<>();
		stdnt = new StudentDetails[student_records];
		for (int i = 0; i < student_records; i++) {
			// System.out.println("Enter Student data");
			// sc.nextLine();
			String student_data = sc.nextLine();
			// sc.nextLine();

			String[] token = student_data.split(",");
			Integer roll_no = Integer.parseInt(token[0]);
			String name = token[1];

			double total_marks = Double.parseDouble(token[2]);
			stdnt[i] = new StudentDetails(roll_no, name, total_marks);
			arlist.add(stdnt[i]);
			System.out.println(stdnt[i]);

		}

		System.out.println("Enter number of queries");
		int no_of_queries = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < no_of_queries; i++) {
			System.out.println("Enter queries");
			String queries = sc.nextLine();
			String[] token1 = queries.split(" ");
			String name1 = token1[0];
			double marks1 = Double.parseDouble(token1[1]);
			double marks2 = Double.parseDouble(token1[2]);

		}

	}
}
