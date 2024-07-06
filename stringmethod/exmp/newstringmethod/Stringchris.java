package com.stringmethod.exmp.newstringmethod;

public class Stringchris {
    public static void main(String[] args) {
        methods();
    }
    static void  methods(){
        String a="christin";
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf("s"));
        System.out.println(a.lastIndexOf('n'));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        String b="christin";String c="Christin";
        System.out.println(a.equals(b));
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println(b.equalsIgnoreCase(a));
        String d="Hello";
        System.out.println(d.replace("H","h"));
        System.out.println(d+" ".concat(a));
        String e="  Hello All ";
        System.out.println(e.trim());
        System.out.println(d.substring(3));
        System.out.println(d.substring(1,4));
        System.out.println(b.startsWith("ch"));
        System.out.println(b.endsWith("dfg"));
        int value=30;
        String s1=String.valueOf(value);
        System.out.println(s1+10);



    }
}
