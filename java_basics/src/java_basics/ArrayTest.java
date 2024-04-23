package java_basics;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dimension- 1 Marks
		
		//declare
		//Student Mg Mg
//		int[] marks = new int[4];// index 0 - 3
//		
//		marks[0] = 50;//Maths
//		marks[1] = 100;//LanguageArt
//		marks[2] = 120;//Science
//		marks[3] = 150;//Literature
//		marks[4] = 200;//Extend fail
//		
//		System.out.print(marks[0]+" ");
//		System.out.print(marks[1]+" ");
//		System.out.print(marks[2]+" ");
//		System.out.print(marks[3]);
		
		//initialize
		//int[] marks = new int[] {120,130,140,150};
		int[] marks =  {120,130,140,150};

		System.out.print(marks[0]+" ");
		System.out.print(marks[1]+" ");
		System.out.print(marks[2]+" ");
		System.out.print(marks[3]);
		System.out.println();
		System.out.println(marks.length);
//		
		//Dimension 2 Student Mark

				
		
//		int[][] examMarks = {
//				{
//					100,//0
//					200,//1
//					300,//2
//					180//3
//				},//MgAung
//				
//				{
//					200,
//					180,
//					170,
//					120
//				},//MgMg
//				{
//					140,
//					150,
//					190,
//					200
//				}//MgMya
//				
//		};
//		
//		System.out.println("Math-Marks of MgMg is" + examMarks[1][0]);
		
		//declare
//		int[][] examMarks = new int[3][4];
//		examMarks[1][0] = 150;
//		System.out.println(examMarks[1][0]);
		
		//Dimension School Student Marks
		//declare
		
//		int[][][] matriExamMark = new int[5][15][4];
//		matriExamMark[1][12][3] = 180;
//		
//		System.out.println(matriExamMark[1][12][3]);
//		System.out.println(matriExamMark[3][14][1]);
		
		//Initialize
		int[][][] matriExamMark = {{{120,140,180,200},{},{},{}}};
		
		System.out.println(matriExamMark[0][0][0]);
		
		
		
		


		

	}

}
