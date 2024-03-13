package com.ict.model.file;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class FileUP {
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 실제 저장위치를 얻어내자 
			String path = request.getServletContext().getRealPath("upload");
			
			// 파일 업로드를 하면 request 대신 사용하는 클래스 
			MultipartRequest mr = 
					new MultipartRequest(request, 
							path,
							100*1024*1024, // 100MB, 업로드 용량 제한 
							"utf-8",       // 한글처리  
							// 업로드 위치에 같은 이름의 파일이 있으면 파일이름뒤에 숫자가 붙는다.
							new DefaultFileRenamePolicy()    
							);
			//System.out.println(request.getParameter("name")); // request 가 안 먹힌다. mr 을 써야 한다.
			//request 쓰면 null 나온다. mr.name 쓰면 홍길동 나온다
			System.out.println(mr.getParameter("name"));
			
			
			String name = mr.getParameter("name");
			
			//사용자가 파일을 올릴 떄 이름
			//String f_name = mr.getOriginalFileName(name);
			
			//서버가 저장할 당시의 이름 (주로 이걸 쓴다)
			String f_name = mr.getFilesystemName("f_name");
			
			String contentType = mr.getContentType("f_name"); //동영상, 그림, 텍스트 파일 구분할때 사용
			
			File file = new File(path, f_name); //저장위치, 파일이름 으로 결합되서 쓴다.
			long f_size = file.length(); // 파일 크기
			long f_last = file.lastModified(); // 마지막 변경
			
			SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			String f_last2 = day.format(f_last);
			
			//실험
			System.out.println(name);
			System.out.println(f_name);
			System.out.println(contentType);
			System.out.println(f_size);
			System.out.println(f_last);
			
			request.setAttribute("name", name);
			request.setAttribute("f_name", f_name);
			request.setAttribute("contentType", contentType);
			request.setAttribute("f_size", f_size);
			request.setAttribute("f_last", f_last);
			request.setAttribute("f_last2", f_last2);
			
			
			
			return "view/fileup_down/FileUp_result.jsp";
		} catch (Exception e) {
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
