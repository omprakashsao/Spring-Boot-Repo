package in.ops.om;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

import in.ops.om.beans.WishMessageGenerator;

@SpringBootApplication
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
		WishMessageGenerator bean = context.getBean("wish",WishMessageGenerator.class);
		bean.msgGenerate("Om Prakash Sao");
		
		((AbstractApplicationContext) context).close();
//		((ConfigurableApplicationContext) context).close();
	}

}
