package raksh.upload.img;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Upload {
	public Upload() {
		System.out.println("invoked");
	}
	@RequestMapping("/uploadFile.do")
	public String justmess(HttpServletRequest req) {
		System.out.println("invoked just method");
		String name =req.getParameter("name");
		System.out.println("name is"+name);
		String file =req.getParameter("file");
		System.out.println("file is"+file);
		return "/index.jsp";
		
	}
	
	
	
}


