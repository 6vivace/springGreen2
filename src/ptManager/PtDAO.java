package ptManager;

public class PtDAO extends DBConn{
	PtVO vo = null;
	
	//로그인창 : 로그인시 DB와 매칭 확인 (1.일치 성공, 0.불일치 실패)
	public int loginCheck(String id, String pw) {
		int res = 0;
		try {
			sql = "select count(*) from jPtMember where mem_id = ? AND mem_pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(rs.next()) res = rs.getInt(1);
		} catch (Exception e) {
				System.out.println("SQL 오류(loginCheck) : " + e.getMessage());
		} finally {
			rsClose();
			pstmtClose();
		}
		return res;
	}
	
	
	//로그인창 : ID/PW 찾기
//	public String findId() {
//		
//	}
	
	
	
	//회원가입창 : 아이디 중복 확인 (1.사용가능, 0.중복 사용불가)
	public int idCheck(String id) {
		int res = 0;
		try {
			sql = "select count(*) from jPtMember where mem_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getInt(1) == 0) res = 1;
			}
		} catch (Exception e) {
			System.out.println("SQL 오류(idCheck) : " + e.getMessage());
		} finally {
			rsClose();
			pstmtClose();
		}
		return res;
	}




}
