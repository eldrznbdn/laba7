package ua.lviv.iot;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public  StringBuilder replacePhoneNumber(){

        StringBuilder sb = new StringBuilder(text);

        Pattern p = Pattern.compile("\\d{7}");
        Matcher m = p.matcher(sb);

        while(m.find()){
            int start = m.start();
            int end = m.end();

            String s1 = sb.substring(start,end);
            String reverse = new StringBuilder(s1).reverse().toString();
            sb.replace(start,end,reverse);
        }

        Pattern p1 = Pattern.compile("(\\d{3}-\\d{2}-\\d{2})");
        Matcher m1 = p1.matcher(sb);

        while(m1.find()){
            int start = m1.start();
            int end = m1.end();

            String s1 = sb.substring(start,end);
            String reverse = new StringBuilder(s1).reverse().toString();
            sb.replace(start,end,reverse);
        }

        Pattern p2 = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{2})-(\\d{1})");
        Matcher m2 =p2.matcher(sb);

        while(m2.find()){
            int start = m2.start();
            int end = m2.end();

            String s1 = sb.substring(start,end);
            String reverse = new StringBuilder(s1).reverse().toString();
            sb.replace(start,end,reverse);
        }

        return sb;
    }
}

