package com.shinhan.day05;

//고객관리(등록, 수정, 모두조회, 조건조회, 삭제)
//CRUD(Create, Read, Update, Delete)
public class CustomerManagement {

    //고객은 최대 100명 있음
    Customer[] customers = new Customer[100];
    //순서
    int seq = 0;

    void select_condition2(String phone) {
        for (int i = 0; i < seq; i++) {
            if (customers[i].phoneNumber.equals(phone)) {
                customers[i].custInfoPrint();
                System.out.println("같은번호찾기완료했슴둥~");
                return;
            }
        }
        System.out.println("같은번호찾기실패..띠로리");
    }

    void select_condition(String level) {
        for (int i = 0; i < seq; i++) {
            if (customers[i].level.name().equals(level)) {
                customers[i].custInfoPrint();
            }
        }
    }

    void delete(String custNo) {
        for (int i = 0; i < seq; i++) {
            if (customers[i].custNo.equals(custNo)) {
                customers[i] = null;
                System.out.println("삭제완료했슴둥~");
                return;
            }
        }
        System.out.println("삭제실패..띠로리");
    }

    //함수의 오버로딩
    void update(String custNo, String custName, String phoneNumber) {

        for (int i = 0; i < seq; i++) {
            if (customers[i].custNo.equals(custNo)) {
                customers[i].custName = custName;
                customers[i].phoneNumber = phoneNumber;
                customers[i].level = CustomerLevel.GOLD;
                System.out.println("수정완료했슴둥~1");
                return;
            }
        }
        System.out.println("수정실패..띠로리1");
    }

    void update(Customer cust) {
        for (int i = 0; i < seq; i++) {
            if (customers[i].custNo.equals(cust.custName)) {
                customers[i].custName = cust.custName;
                customers[i].phoneNumber = cust.phoneNumber;
                System.out.println("수정완료했슴둥~2");
                return;
            }
        }
        System.out.println("수정실패..띠로리2");
    }

    void insert(Customer cust) {
        customers[seq++] = cust;
    }

    void selectAll() {
        for (Customer cust : customers) {
            if (cust == null) continue;
            cust.custInfoPrint();
        }
    }
}