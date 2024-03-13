package com.ict.model.guestbook2;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import com.ict.db.guestbook2.GuestDAO;

public class DeleteOKCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		String idx = request.getParameter("idx");
		int result = GuestDAO.getDelete(idx);
		return "Guest?cmd=list";
	}
}
