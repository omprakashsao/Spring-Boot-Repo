package in.ops.om.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerApp2 implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		System.out.println("dfsldfkjsd");
		System.out.println("non option arguments: "+ args.getNonOptionArgs());
		System.out.println("option arguments: "+ args.getOptionNames());
		

	}

}
