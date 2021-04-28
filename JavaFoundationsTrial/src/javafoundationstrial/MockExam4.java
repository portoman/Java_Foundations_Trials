/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundationstrial;

/**
 *
 * @author portb
 */
public class MockExam4 {

    public static void main(String[] args) {

        
        //Question 3
        int x = 6;
//        doStuff(x);//Non static method cannot be referenced from a static context
        System.out.print(" main x = " + x);

        //Question 4// The program will print with no arguments when called with zero arguments and 1 arguments when called with one argument
        if (args.length == 0) {
            System.out.println("no arguments");
        } else {
            System.out.println(args.length + " arguments");
        }

        //Question 9
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true
        System.out.println(true ^ true);//false

        for (int i = 0; i <= 10; i++) {//Local variable i only visible in the for loop
            if (i > 6) {
                break;
            }
        }
//        System.out.println(i);
    }

    void doStuff(int x) {
        System.out.print(" doStuff x = " + ++x);
    }
}
