package String;

import java.util.Arrays;
import java.util.Locale;

public class String04Methodes {
    public static void main(String[] args) {
       /* String name = "Kunal Kushwaha";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("w"));
        System.out.println("   ravi     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

        palandrom("Abcdcba");

        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));

        System.out.println( interpret("G()(al)"));

        System.out.println(wordSort("is2 sentence4 This1 a3"));

        System.out.println(arrayStringsAreEqual(new String[]{"ab","c"},new String[]{"a","bc"}));*/

        System.out.println(halvesAreAlike("bookbook"));

    }

    public static void palandrom(String str){

        str = str.toLowerCase();
        int f=0;
        int b=str.length()-1;

        while(f<=b){
            if(str.charAt(f) == str.charAt(b)){
                f++;
                b--;
            }
            else{
                System.out.println("Not palandrom");
            return;
            }
        }

        System.out.println(str+" Is Palandromic");

    }

    // leetcode 1528 shuffle strign

    public static String restoreString(String s, int[] indices) {

       char [] ch  = new char[indices.length];

       for(int i =0;i<s.length();i++ ){
           ch[indices[i]] = s.charAt(i);
       }
    return new String(ch);
    }





    // 1678 Goal Parser Interpretation..

    public static String interpret(String command){


        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
                i++;
            }else{
                sb.append("al");
                i = i+3;
            }
        }
        return sb.toString();
        
    }



        public static String  wordSort(String s) {

            String[] words = s.split(" ");

            String [ ] sorted = new String[words.length];

            for(String t:words){
                int n = t.length();
                int pos= t.charAt(n-1)-48;

                sorted[pos-1] =t.substring(0,n-1);
            }

            StringBuilder sb = new StringBuilder();
            for(String t : sorted){
                sb.append(t);
                sb.append(" ");
            }
            return sb.toString().trim();

        }


        //1662 .two string equivalent or not.

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2= new StringBuilder();

        for(String t: word1){
            sb1.append(t);
        }
        for(String t: word2){
            sb2.append(t);
        }
        ;
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }

        else
            return false;

    }

    //1704 string halves are alike

    public static boolean halvesAreAlike(String s) {


        int mid = s.length()/2;

        String a = s.substring(0,mid);
        String b = s.substring(mid);

        return (noOfVowels(a) == noOfVowels(b));

    }

    public static int noOfVowels(String s){
        int count =0;
        String vowels = "aeiouAEIOU";

        for(char ch :s.toCharArray()){
            if(vowels.indexOf(ch) !=-1){
                count++;
            }
        }
        return count;
    }




    // leetcode1309 string from ap to int mapping

    public static String freqAlphabets(String s) {


        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;


        while( i >= 0) {
            if(s.charAt(i) == '#') {
                sb.append((char) ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') + 96));
                i -= 3;
            } else {
                sb.append((char) ((s.charAt(i) - '0') + 96));
                i--;
            }
        }

        return sb.reverse().toString();
    }
}
