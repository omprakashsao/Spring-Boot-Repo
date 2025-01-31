package in.ops.om;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;

import in.ops.om.beans.Student;

@SpringBootApplication
@ImportResource(value="in/ops/om/cfgs/applicationContext.xml")
public class SpringBootDiApplication {
	
	static {
		System.out.println("SpringBootDiApplication .class file is loading");
	}
	
	public SpringBootDiApplication() {
		// TODO Auto-generated constructor stub
		System.out.println("SpringBootDiApplication object is created using zero param constructor..");
	}
	
	@Bean
	public LocalTime getTime() {
		return LocalTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDiApplication.class, args);
		Student bean = context.getBean(Student.class);
		bean.useFeature();
		
		((AbstractApplicationContext) context).close();
//		((ConfigurableApplicationContext) context).close();
	}

}
