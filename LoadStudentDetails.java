package details;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadStudentDetails {
public static List<StudentDetails> loadstudentdetails(String filepath,int pagenumber,int pagesize){
	//to open the file and read the student details
	try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
		List<StudentDetails> studentDetails=new ArrayList<>();
		String line;
		while((line=reader.readLine())!=null) {
			studentDetails.add(new StudentDetails(line));
		}
		//paginating the student details
		return studentDetails.subList(pagenumber *pagesize,Math.min((pagenumber+1)*pagesize, studentDetails.size()));
	}
	catch(IOException e) {
		throw new RuntimeException(e);
	}
}


public static void main(String[] args) {
	System.out.println(loadstudentdetails("/StudentGridSystem/src/details/Admin upload sample.txt",1,1));
}
}
