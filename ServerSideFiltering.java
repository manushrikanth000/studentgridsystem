package details;

import java.util.ArrayList;
import java.util.List;

public class ServerSideFiltering {
public List<StudentDetails> filterStudentDetails(List<StudentDetails> studentDetails,String filterCriteria){
	// to iterate ovet the student details and filter them based on criteria
	List<StudentDetails> filteredStudentDetails=new ArrayList<>();
	for(StudentDetails studentDetail:studentDetails) {
		if(studentDetail.meetsCriteria(filterCriteria)) {
			filteredStudentDetails.add(studentDetail);
			
		}
	}
	//return the filtered student details
	return filteredStudentDetails;
}
}
