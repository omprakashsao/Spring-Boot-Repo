package in.ops.om.beans;

import org.springframework.stereotype.Component;

@Component("js")
public class JSCourse implements ICourse {

	@Override
	public void courseContent() {
		System.out.println("html css js react next.js");
	}

	@Override
	public void coursePrice() {
		// TODO Auto-generated method stub
		System.out.println("4000");

	}

}
