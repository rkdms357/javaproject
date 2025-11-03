package com.shinhan.day08.inner;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addCart("이것이자바다1", 3, 35000);
        cart.addCart("이것이자바다2", 2, 35000);
        cart.addCart("이것이자바다3", 5, 35000);
        //외부에서 내부의 instance를 생성
        Cart.Item item2 = new Cart().new Item("", 1, 1);

        Cart.Item[] cartList = cart.getItemArr();
        for (Cart.Item item : cartList) {
            if (item == null)
                continue;
            System.out.println(item);
        }
        System.out.println(cart.getTotalPrice());
        System.out.println(cart.getItem(0));
        cart.changeItemNumber(0, 10);
        System.out.println(cart.getItem(0));
        cart.removeItem(0);
        System.out.println(cart.getItem(0));
        System.out.println(cart.getSeq());
    }
}