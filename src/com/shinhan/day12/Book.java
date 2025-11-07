package com.shinhan.day12;
//import lombok.EqualsAndHashCode;
//@EqualsAndHashCode(of = {"title", "author"})

import java.util.Objects;

//Comparable구현해야 비교가능
public class Book implements Comparable<Book> {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Book [title=").append(title).append(", author=").append(author).append(", price=").append(price)
                .append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && Objects.equals(title, other.title);
    }

    // default(오름차순) : < = >
    // Ascending(내림차순) : 앞(this) - 뒤(파라미터)
    @Override
    public int compareTo(Book obj) {
        // 제목순, 가격순서, 저자이름순
        // 나를 먼저작성 사용하여 비교 : Ascending
        int titleResult = title.compareTo(obj.title);
        int authorResult = obj.author.compareTo(author); //descending
        if (titleResult == 0 && authorResult == 0)
            return price - obj.price; // ascending
        if (titleResult == 0)
            // return author.compareTo(obj.author); //ascending
            return obj.author.compareTo(author); // descending
        return titleResult;
    }
}