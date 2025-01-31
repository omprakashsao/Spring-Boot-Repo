package in.ops.om;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ops.om.beans.BTechThela;
import in.ops.om.beans.BillGenerate;


@SpringBootApplication

public class SpringBootDiApplication {
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDiApplication.class, args);
		BillGenerate bean = context.getBean(BillGenerate.class);
		System.out.println(bean);
		
		((AbstractApplicationContext) context).close();
//		((ConfigurableApplicationContext) context).close();
	}

}
