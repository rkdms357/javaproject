package com.shinhan.day09.lab12;

import java.util.Objects;

public class MySum {
    int first;
    int second;

    MySum(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        //return first + second + "";
        return String.valueOf(first + second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MySum other = (MySum) obj;
        return first + second == other.first + other.second;
    }
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof MySum)) return false;
//		String my = toString();
//		MySum other = (MySum)obj;
//		String my2 = other.toString();
//		return my.equals(my2);
//	}
}