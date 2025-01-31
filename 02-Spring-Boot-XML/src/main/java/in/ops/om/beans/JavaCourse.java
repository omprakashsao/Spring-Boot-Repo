package in.ops.om.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourse implements ICourse {

	@Override
	public void courseContent() {
		System.out.println("java programming , oops , advance java , collection framework");
	}

	@Override
	public void coursePrice() {
		System.out.println("7000");

	}

}
