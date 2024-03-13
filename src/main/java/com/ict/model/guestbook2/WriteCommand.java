package com.ict.model.guestbook2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "view/guestbook2/write.jsp";
	}
}


















/*
 * package com.ict.model;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.ict.db.GuestDAO; import com.ict.db.GuestVO; import com.ict.db.VO;
 * 
 * public class WriteCommand implements Command{
 * 
 * @Override public String exec(HttpServletRequest request, HttpServletResponse
 * response) {
 * 
 * List<GuestVO> list = GuestDAO.getList(); request.setAttribute("list", list);
 * 
 * return "guestbook/write.jsp"; } }
 */
