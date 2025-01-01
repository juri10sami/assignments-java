
public class studentTest {
public static void main(String [] args) {
	int [][] student1 = {{42, 46, 43, 58}};
	int [][] student2={{45, 40, 60, 83}};
	int [][] student3= {{68,68, 58, 50}};
	int [][] student4= {{40,55,34,67}};
	int [][] student5= {{67, 45, 77,80}};
	int [][] student6= {{78,76,49,55}};
	
	int [][] sales = {{4930, 2636, 1900},
			{2482,4302},
			{ 2049,4747,4384,4505}, 
			{ 2596, 4689},
			{1923, 3941}};
	
	student [][] studentArray = new student [2][3];
	studentArray[0][0] = new student (student1);
	studentArray[0][1] = new student (student2);
	studentArray[0][2] = new student (student3);
	studentArray[1][0] = new student (student4);
	studentArray[1][1] = new student (student5);
	studentArray[1][2] = new student (student6);
	
	student.quizAverage(studentArray, 4);
	student.studentQuizAverage(studentArray, 6);
	student.quarterSales(sales, 1);
	student.quarterlySalesAve(sales, 1);
	student.totSalesPerSalesman(sales, 4);
    }

}

