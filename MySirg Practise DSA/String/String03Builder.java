package String;

public class String03Builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }

        System.out.println(sb.toString());

        System.out.println(sb.reverse());
    }
}
