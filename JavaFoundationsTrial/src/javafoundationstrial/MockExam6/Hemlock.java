/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundationstrial.MockExam6;

public class Hemlock {

  static  StringBuffer sb;
    StringBuffer sb2;

    public static void main(String[] args) {
        sb = sb.append(new Hemlock().go(new StringBuffer("hey")));//
        System.out.println(sb);
        System.out.println(sb);

    }

    {
        sb2 = new StringBuffer("hi ");
    }

    StringBuffer go(StringBuffer s) {
        System.out.println(s + " oh " + sb2);//hey oh hi
        return new StringBuffer("ey").append("hola");
    }

     StringBuffer go2() {
        System.out.println(sb2);
        return sb2;
    }

    static {
        sb = new StringBuffer("yo ").append("mundo");
    }

}
