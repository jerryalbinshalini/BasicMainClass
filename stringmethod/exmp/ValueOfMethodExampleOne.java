package com.stringmethod.exmp;

public class ValueOfMethodExampleOne {
    int number;
    String stringVariable;
    String stringConten="English is present in valueMethod";

   public String valueMethod(int number,String stringVariable) {
       return "How many letters in English?"+String.valueOf(number)+" "+stringVariable;
    }
}
    class ValueOfMethodMainClass {
        public static void main(String[] args) {
            ValueOfMethodExampleOne valueOfMethodExampleOne=new ValueOfMethodExampleOne();
            System.out.println(valueOfMethodExampleOne.valueMethod(26,"alphabets"));
            System.out.println("String length is:"+valueOfMethodExampleOne.valueMethod(26,"Alphabets").length());
            System.out.println("English is present in valueMethod:"+valueOfMethodExampleOne.valueMethod(26,"Alphabets").contains("English"));
            System.out.println("English is present in valueMethod:"+valueOfMethodExampleOne.valueMethod(26,"Alphabets")+" "
                    .concat(valueOfMethodExampleOne.stringConten));



        }
    }

/*The contains() method checks whether a string contains a sequence of characters.
 Returns true if the characters exist and false if not.
 */


