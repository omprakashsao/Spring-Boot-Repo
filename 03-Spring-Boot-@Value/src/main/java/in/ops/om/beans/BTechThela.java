package in.ops.om.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("info")
@PropertySource("in/ops/om/cfgs/input.properties")
public class BTechThela {
	
	public BTechThela() {
	
		System.out.println("thela object is created..");// TODO Auto-generated constructor stub
	}
	
	
	@Value("${price.thela.chai}")
	public Float chaiPrice;
	
	@Value("${price.thela.dosa}")
	public Float dosaPrice;
	
	@Value("${price.thela.idli}")
	public Float idliPrice;
	
	
	@Override
	public String toString() {
		return "BTechThela [chaiPrice=" + chaiPrice + ", dosaPrice=" + dosaPrice + ", idliPrice=" + idliPrice + "]";
	}
	
	

}
