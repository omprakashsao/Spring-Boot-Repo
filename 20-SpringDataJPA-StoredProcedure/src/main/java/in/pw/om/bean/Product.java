package in.pw.om.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="product_info")
@Getter
@Setter
@ToString
public class Product {
	
	@Id
	private Integer pid;
	private String pname;
	private Integer price;
	private Integer quantity;
	
	
	

}
