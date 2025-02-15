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

@Component
public class StudentRunner implements ApplicationRunner {
	
	@Autowired
	private IStudentDao dao;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
//		//working with img
//		String img = "C:\\Users\\kajal\\OneDrive\\Pictures\\profileImage.jpg";
//		FileInputStream fis = new FileInputStream(new File(img));
//		byte[] arr = new byte[fis.available()];
//		fis.read(arr);
//		
//		// working with resume
//		File file = new File("C:\\Users\\kajal\\OneDrive\\Pictures\\resume.txt");
//		BufferedReader bf = new BufferedReader(new FileReader(file));
//		char[] carr = new char[(int)(file.length())];
//		bf.read(carr);
//		
//		
//		dao.save(new Student("Om Prakash", LocalDate.of(2003, 10, 31) , carr, arr));
		
		
		//Retrival code
		
		Optional<Student> std = dao.findById(1);
		if(std.isPresent()) {
			Student student = std.get();
			System.out.println(student.getSname());
			System.out.println(student.getDob());
			
			FileOutputStream fos = new FileOutputStream(new File("image.jpg"));
			fos.write(student.getPhoto());
			fos.flush();
			fos.close();
			
			
			
			PrintWriter pw = new PrintWriter(new File("resume.txt"));
			pw.write(student.getResume());
			pw.flush();
			pw.close();
			
		
			
			
		}
		
	}
	

}
