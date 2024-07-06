package com.FinalKeyword.example;

public class CollegeStudentV  {
    public static void main(String[] args){
        /*  final keyword assign in one variable that variable  cannot modify the value*/
        String studentName="shalini";//non-final can be modify later
        System.out.println("orginal name is:"+studentName);
         studentName="Ammu";
        System.out.println("modify name is:"+studentName);
        final String college_name="xxxxx";//use final cannot be modify later
        System.out.println("orginal name is:"+college_name);
        //college_name="yyyyyy"     error rise





    }
}
