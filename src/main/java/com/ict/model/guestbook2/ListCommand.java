package com.ict.model.guestbook2;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.guestbook2.GuestDAO;
import com.ict.db.guestbook2.GuestVO;

public class ListCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// guest book 테이블의 모든 정보 다 가져와야 한다.
		// DB 처리는 MyBatis 이다.
		// 오라클라이브러리와 MyBatis 라이브러리를 WEB-INF 안 lib 에 넣자.
		
		List<GuestVO>  list = GuestDAO.getList();
		request.setAttribute("list", list);
		
		return "view/guestbook2/list.jsp";
	}
	
}























/*
 * package com.ict.model;
 * 
 * import java.util.List;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.ict.db.GuestDAO; import com.ict.db.GuestVO;
 * 
 * public class ListCommand implements Command{
 * 
 * @Override public String exec(HttpServletRequest request, HttpServletResponse
 * response) { //list.jsp 가 보여줄 내용을 db 에서 가지고 온다. //guest book 의 모든 정보 다 가져와야
 * 한다. //DB 처리는 Mybatis 다. //오라클라이브러리와 MyBatis 라이브러리를 WEB-INF 안 lib 에 넣자.
 * 
 * // 여기서 DAO 간다. // 여기서 부터 만들면서 넘어간다. List<GuestVO> list = GuestDAO.getList();
 * request.setAttribute("list", list);
 * 
 * return "guestbook/list.jsp"; }
 * 
 * }
 */
