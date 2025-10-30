package com.shinhan.day06;
//DAO(데이터를 Access Object) : DB에 접근하는 코드는 DAO를 사용

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
public class MemberDAO {

    boolean userCheck(String id, String password) {
        //select ... from. ....where
        String db_id = "hong";
        String db_password = "1234";
        if (db_id.equals(id) && db_password.equals(password)) {
            return true;
        }
        return false;
    }
}