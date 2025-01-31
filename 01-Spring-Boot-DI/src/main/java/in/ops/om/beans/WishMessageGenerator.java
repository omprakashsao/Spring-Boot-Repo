package in.ops.om.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator .class file is loading");
	}
	
	public WishMessageGenerator() {
		// TODO Auto-generated constructor stub
		System.out.println("WishMessageGenerator object is created using zero param constructor..");
	}

	@Autowired
	private LocalTime time;
	
	public void msgGenerate(String user) {
		int hour = time.getHour();
		
		if(hour<12) System.out.println("Good morning "+ user);
		else if(hour<16) System.out.println("Good Afternoon "+ user); 
		else if(hour<20) System.out.println("Good Evening "+ user);
		else System.out.println("Good Night "+user);
	}
    
}
