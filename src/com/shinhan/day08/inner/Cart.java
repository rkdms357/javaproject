package com.shinhan.day08.inner;

//장바구니
public class Cart {
    Item[] itemArr = new Item[100];
    int seq;

    void addCart(String name, int num, int unitPrice) {
        itemArr[seq++] = new Item(name, num, unitPrice);
    }

    Item getItem(int index) {
        if (index >= itemArr.length)
            return null;
        return itemArr[index];
    }

    int getTotalPrice() {
        int total = 0;
        for (Item item : itemArr) {
            if (item == null)
                continue;
            total += item.getNum() * item.getUnitPrice();
        }
        return total;
    }

    void changeItemNumber(int index, int num) {
        if (index >= itemArr.length)
            return;
        if (itemArr[index] == null)
            return;
        itemArr[index].setNum(num);
    }

    void removeItem(int index) {
        if (index >= itemArr.length)
            return;
        itemArr[index] = null;
    }

    public Item[] getItemArr() {
        return itemArr;
    }

    public int getSeq() {
        return seq;
    }

    // 내부 클래스(inner class)
    class Item {
        String name;
        int num;
        int unitPrice;

        public Item(String name, int num, int unitPrice) {
            super();
            this.name = name;
            this.num = num;
            this.unitPrice = unitPrice;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(int unitPrice) {
            this.unitPrice = unitPrice;
        }

        @Override
        public String toString() {
            return "Item [name=" + name + ", num=" + num + ", unitPrice=" + unitPrice + "]";
        }
    }
}