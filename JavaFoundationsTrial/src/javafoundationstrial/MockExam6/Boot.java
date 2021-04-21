/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundationstrial.MockExam6;

public class Boot {

    static String s;

    static {
        s = "fff";
    }

    {
        System.out.print("shinier ");
    }

    static {//static goes first
        System.out.print(s.concat("better "));
    }

   Boot() {
        System.out.print(s.concat("bigger "));
    }

    public static void main(String[] args) {
        new Boot();
        System.out.println("boot");//"boot comes to the end
    }
}