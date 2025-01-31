package in.ops.om.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	@Qualifier("InputParam")
	private ICourse course;
	
	public void useFeature() {
		course.courseContent();
		course.coursePrice();
	}
	

}
