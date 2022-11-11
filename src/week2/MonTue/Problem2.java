package week2.MonTue;

import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) { //ArrayList 이용

        ArrayList<BookList> onLibrary1 = new ArrayList<>(); //원본 A생성
        onLibrary1.add(new BookList("태백산맥", "조정래"));
        onLibrary1.add(new BookList("이기적 유전자", "리처드 도킨즈"));
        onLibrary1.add(new BookList("자전거 도둑", "박완서"));
        onLibrary1.add(new BookList("토지", "박경리"));
        onLibrary1.add(new BookList("대변동", "제레드 다이아몬드"));

        ArrayList<BookList> onLibrary2 = onLibrary1; //복사본 A-1 (얕은 복사)

        ArrayList<BookList> doLibrary = new ArrayList<>(); //복사본 B (깊은 복사)
        for (BookList b : onLibrary1) {
            doLibrary.add(new BookList(b.getBookName(), b.getAuthor()));
        } // (add 뒷부분 다시 공부하기)

        BookList b6 = new BookList("그 많던 싱아는 누가 다 먹었을까", "박완서");
        onLibrary1.set(2, b6); //A의 3번째 책 변경

        doLibrary.add(new BookList("사피엔스","유발 하라리")); //B에 책 추가

        System.out.println("======온마을 도서관(A) 책목록======");
        for(BookList b : onLibrary1){
            b.showBookInfo();
        }

        System.out.println("\n======온마을 도서관(A-1) 책목록======");
        for(BookList b : onLibrary2){
            b.showBookInfo();
        }

        System.out.println("\n======두마을 도서관(B) 책목록======");
        for(BookList b : doLibrary){
            b.showBookInfo();
        }

    }
}


class BookList {
    private String bookName;
    private String author;

    public BookList(){} //디폴트 생성자 (까먹지 말기!!!)

    public BookList(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void showBookInfo(){
        System.out.printf("%s | %s%n", bookName, author);
    }
}