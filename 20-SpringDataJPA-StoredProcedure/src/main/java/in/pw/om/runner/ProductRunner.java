package in.pw.om.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.pw.om.bean.Student;
import in.pw.om.dao.IStudentDao;
import in.pw.om.service.IProductService;

@Component
public class ProductRunner implements ApplicationRunner {
	
	@Autowired
	private IProductService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		service.fetchProductByName("book", "copy").forEach(System.out::println);
			
			
		}
		
	}

