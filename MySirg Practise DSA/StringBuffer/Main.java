package StringBuffer;

public class Main {

        public static void main(String[] args) {

                StringBuffer sb  = new StringBuffer();

                StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");
                StringBuffer sb3 = new StringBuffer(30);

                sb.append("WeMakeDevs");
                sb.append(" is nice ");
                sb.insert(2," Rahul ");

                String str = sb.toString();
                System.out.println(str);
        }
}
