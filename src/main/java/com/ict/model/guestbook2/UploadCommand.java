package com.ict.model.guestbook2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		
		return "view/guestbook2/FileUpload_Form.jsp";
	}

}
