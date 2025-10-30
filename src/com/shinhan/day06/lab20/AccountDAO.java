package com.shinhan.day06.lab20;
//DAO(데이터를 Access Object) : DB에 접근하는 코드는 DAO를 사용
//select, insert, update, delete -> (CRUD)

/**
 * [MVC모델] Model : Service, DAO View : 디스플레이(사용자에게 보여줌)가 목적 Controller : 사용자의
 * 요청, 응답
 * <p>
 * 1. 사용자가 Controller에게 요청을 보냄 2. Controller가 서비스 호출 3. 서비스는 업무로직을 수행. DB가 필요하면
 * DAO를 호출 4. 서비스가 결과를 Controller에게 전달함 5. View에게 결과를 보내서 출력
 */
public class AccountDAO {
    private AccountDTO[] accList = new AccountDTO[100]; // 이 클래스내에서만 사용
    private int seq = 0;

    public AccountDTO[] selectAll() { // 다른 패키지에서도 사용
        return accList;
    }

    // 입금하다
    public String deposit(String accNo, int amount) {
        String msg = "입금실패했슴둥...띠로리";
        for (int i = 0; i < seq; i++) {
            if (accList[i] != null && accList[i].getAccNo().equals(accNo)) {
                accList[i].setBalance(accList[i].getBalance() + amount);
                ;
                msg = "입금성공했슴둥!!";
                break;
            }
        }
        return accNo + msg;
    }

    // 출금하다
    public String withdraw(String accNo, int amount) {
        String msg = "출금실패했슴둥...띠로리";
        for (int i = 0; i < seq; i++) {
            if (accList[i] != null && accList[i].getAccNo().equals(accNo)) {
                // 잔고가 있는지 확인
                int balance = accList[i].getBalance();
                if (balance >= amount) {
                    accList[i].setBalance(balance - amount);
                    msg = "출금성공했슴둥!!";
                    break;
                }
            }
        }
        return accNo + msg;
    }

    public String insert(AccountDTO acc) {
        accList[seq++] = acc;
        return seq + "번째 계좌가 등록되었슴둥";
    }
//	public String update(AccountDTO acc) {
//		String msg = "수정실패했슴둥...띠로리";
//		for (int i = 0; i < seq; i++) {
//			if (accList[i] != null && accList[i].getAccNo().equals(acc.getAccNo())) {
//				accList[i].setOwner(acc.getOwner());
//				accList[i].setBalance(acc.getBalance());
//				msg = "수정성공했슴둥!!";
//				break;
//			}
//		}
//		return acc.getOwner() + "님" + acc.getAccNo() + msg;
//	}
//	public String delete(String accNo) {
//		String msg = "삭제실패했슴둥...띠로리";
//		for (int i = 0; i < seq; i++) {
//			if (accList[i] != null && accList[i].getAccNo().equals(accNo)) {
//				accList[i] = null;
//				msg = "삭제성공했슴둥!!";
//				break;
//			}
//		}
//		return accNo + msg;
//	}
}