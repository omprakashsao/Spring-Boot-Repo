package in.ops.om.beans;

import org.springframework.stereotype.Component;

@Component("python")
public class PythonCourse implements ICourse {

	@Override
	public void courseContent() {
		System.out.println("python programming , numpy , pandas , matplotlib , gen ai");

	}

	@Override
	public void coursePrice() {
		// TODO Auto-generated method stub
		System.out.println("7000");

	}

}
