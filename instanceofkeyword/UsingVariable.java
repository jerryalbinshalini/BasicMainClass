package com.instanceofkeyword;

public class UsingVariable {
    public static void main(String[] args) {
//        usingVariableChecking();
    }
    public static void usingVariableChecking(){
        String name="shalini";
        boolean result=name instanceof String;
        System.out.println("The result is:"+result);
        //variable value null means output is false
        String namenull=null;
        boolean resultnull=namenull instanceof String;
        System.out.println("The result is:"+resultnull);
    }
}
//using classs
class Car{

}
class  Vehicle extends Car{
    public static void main(String[] args) {
        Car car=new Vehicle();
        boolean resultClass=car instanceof Vehicle;
        System.out.println("The result is:"+resultClass);
    }
}
//using class and interface
interface Pizza{
    public void back();
}
class Vegpizza implements Pizza{

    @Override
    public void back() {
        System.out.println("Bake veg pizza");
    }
}
class NonVegPizza implements Pizza{

    @Override
    public void back() {
        System.out.println("Bake Non veg pizza");
    }
}
class InstanceOfKeyword{
    public static void main(String[] args) {
        Pizza pizza=new Vegpizza();
        Pizza nonPizza=new NonVegPizza();
        test(pizza);
        test(nonPizza);
    }
    static void test(Pizza pizza){
        if(pizza instanceof Vegpizza){
            pizza.back();
        }
        if(pizza instanceof  NonVegPizza){
            pizza.back();
        }

    }
}