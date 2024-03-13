package com.ict.model.guestbook2;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import com.ict.db.guestbook2.GuestDAO;
import com.ict.db.guestbook2.GuestVO;

public class OneListCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		
		GuestVO gvo = GuestDAO.getOneList(idx);
		request.setAttribute("gvo", gvo);
		
		return "view/guestbook2/onelist.jsp";
	}

}

