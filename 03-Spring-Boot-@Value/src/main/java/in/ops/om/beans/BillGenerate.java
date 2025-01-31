package in.ops.om.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BillGenerate {
	
     public BillGenerate() {
		// TODO Auto-generated constructor stub
    	 System.out.println("bill object is created..");
	}
	
     @Autowired
     private BTechThela thela;

	
	@Value("#{info.chaiPrice+info.dosaPrice+info.idliPrice}")
	private Float billAmount;
	

	@Override
	public String toString() {
		return "BillGenerate [billAmount=" + billAmount + ", thela=" + thela + "]";
	}
	
	

}
