package com.ict.db.cookie;

import java.util.List;


import org.apache.ibatis.session.SqlSession;

public class CookieDAO2 {
	// 살제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = CookieDBService2.getFactory().openSession();
		}
		return ss;
	}
	
	// DB처리하는 메서드들
	// 회원가입
	public static int getJoin(CookieVO2 cvo) {
		int result = 0 ;
		result = getSession().insert("cookieUser2.c_join2", cvo);
		ss.commit();
		return result;
	}
	
	public static CookieVO2 getLogIn(CookieVO2 bvo) {
		CookieVO2 cvo2 = null;
		cvo2 = getSession().selectOne("cookieUser2.c_login2", bvo);
		return cvo2;
	}
	
	public static CookieVO2 getDetail(String id){
		CookieVO2 bvo2 = null;
		bvo2 = getSession().selectOne("cookieUser2.c_detail2", id);
		return bvo2;
	}
}











