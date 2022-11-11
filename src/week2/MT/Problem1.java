package week2.MT;

public class Problem1 {//문자배열 만들어 A-Z 저장 후 출력
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
            System.out.println(alphabets[i]);
        }
    }
}
