package LambdaFunctions;

public class Q4 {
	interface ReportCard{
		public int marksForSubjects(int mathemaatics , int physics , int biology , int history , int chemistry) ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportCard am1 = (int mathematics , int physics , int biology , int history , int chemistry) -> {
			mathematics += 10;
			return (mathematics+physics+biology+history+chemistry);
		};
		System.out.println(am1.marksForSubjects(74, 87, 66, 53, 90));
	}

}

//OUTPUT
//380
