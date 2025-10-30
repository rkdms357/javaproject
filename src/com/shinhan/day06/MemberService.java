package com.shinhan.day06;
//Service: 비즈니스로직(업무로직), DB관련 업무는 DAO이용

/**
 * [MVC모델]
 * Model : Service, DAO
 * View : 디스플레이(사용자에게 보여줌)가 목적
 * Controller : 사용자의 요청, 응답
 * <p>
 * 1. 사용자가 Controller에게 요청을 보냄
 * 2. Controller가 서비스 호출
 * 3. 서비스는 업무로직을 수행. DB가 필요하면 DAO를 호출
 * 4. 서비스가 결과를 Controller에게 전달함
 * 5. View에게 결과를 보내서 출력
 */
public class MemberService {
    String loginId;

    public boolean login(String id, String password) {
        MemberDAO dao = new MemberDAO();
        boolean result = dao.userCheck(id, password);
        if (result) {
            loginId = id;
        }
        return result;
    }

    public String logout(String id) {
        if (loginId.equals(id)) {
            return "로그아웃되었습니다.";
        }
        return "로그아웃이 실패하였습니다";
    }
}