package com.stringmethod.exmp;

public class charAtex {
    String name;
    
    public static void main(String[] args){
        System.out.println("String charAt method");{
            charAtex obj=new charAtex();
            obj.getCharecter("Joseph Sharon Menorah");

           //charAt()->return the charecter in specified position,first index is 0
        }
        }
        public  void getCharecter(String Name){
        String getchar="get the charecter successfully";
       char ch=name.charAt(3);
        if(name!=null){
            System.out.println(ch);
            }
        else{
            System.out.println("The 3rd charecter is:"+ch);
        }
        System.out.println(getchar);
    }
}
