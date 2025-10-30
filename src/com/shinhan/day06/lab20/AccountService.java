package com.shinhan.day06.lab20;
//Service: 비즈니스로직(업무로직), DB관련 업무는 DAO이용
//Controller의 요청을 받아서 처리
//DB관련 업무는 DAO에 요청을 보내고 결과를 받아서 Controller에게 응답

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
public class AccountService {

    private AccountDAO dao = new AccountDAO();

    public AccountDTO[] selectAllService() {
        return dao.selectAll();
    }

    public String deposit(String accNo, int amount) {
        return dao.deposit(accNo, amount);
    }

    public String withdraw(String accNo, int amount) {
        return dao.withdraw(accNo, amount);
    }

    public String insertService(AccountDTO acc) {
        return dao.insert(acc);
    }

//	public String updateService(AccountDTO acc) {
//		return dao.update(acc);
//	}
//
//	public String deleteService(String accNo) {
//		return dao.delete(accNo);
//	}
}