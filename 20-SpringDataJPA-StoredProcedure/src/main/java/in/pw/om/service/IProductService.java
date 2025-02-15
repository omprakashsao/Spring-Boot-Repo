package in.pw.om.service;

import java.util.List;

import in.pw.om.bean.Product;

public interface IProductService {
	
	public List<Product> fetchProductByName(String name1, String name2);
}
