package com.exception;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();
        //exceptionExample.exceptionOne();
        exceptionExample.excptionTwo();

    }

    public void exceptionOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println("result is:" + a / b);

        } catch (ArithmeticException ex) {
            System.out.println("Exception occurs");
            // ex.printStackTrace();
            // System.out.println(ex.printStackTrace());//error ybaz 'void' type not allowed
            // System.out.println(ex.getMessage());
            //System.out.println(ex.toString());
        } catch (Exception ex) {
            System.out.println("This is a superinterface class");
            ex.printStackTrace();


        } finally {
            System.out.println("I am always print");
        }
    }

    private void excptionTwo() {
        int number = 10;

        try {
            for (int i = 3; i >= 0; i--) {//3,2,1,0
                System.out.println(number / i);
            }

            }catch(ArithmeticException ex){
                System.out.println("zero division error");
                ex.printStackTrace();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }finally {
            System.out.println("Hello Im exception");
        }

        }

    }


