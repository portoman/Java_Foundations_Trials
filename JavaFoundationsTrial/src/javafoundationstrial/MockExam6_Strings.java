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
public class MockExam6_Strings {

    public static void main(String[] args) {

        //Question 1
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);//155110

        //Question 2
        System.out.println("Result: " + 2 + 3 + 5);//Result: 235
        System.out.println("Result: " + 2 + 3 * 5);//Result: 215

        //Question 3
        System.out.println("Result: " + 3 + 5);//Result: 35
        System.out.println("Result: " + (3 + 5));//Result: 8

        //Question 4
        StringBuffer b = new StringBuffer("3");
//        System.out.print(5 + 4 + b + 2 + 1);//StringBuffers and Builders are not able to assume the operator +

        //Question 5
        String theString = "Hello World";
//        System.out.println(theString.charAt(11));//java.lang.StringIndexOutOfBoundsException is thrown at runtime.

        //Question 6
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1.concat(str2);
        str1.concat(str2);
        System.out.println(str1);//"abc"
        System.out.println("str3 = " + str3);//"abcdef"

        //Question 7
        String one = "someString";
        String two = new String("someString");
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        one = null;
        two = null;
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        //When the last line of main method is reached, how many objects are eligible for GC? 1 object

        //Question 8
        String s1 = "Fred";
        s1 = s1 + "47";//"Fred47"
        s1 = s1.substring(2, 5);//"ed4"
        s1 = s1.toUpperCase();//"ED4"
        //How many objects are created? 3

        //Question 9
        String s2 = "FRED";
        s2 = s2 + "47";//"FRED47"
        s2 = s2.substring(2, 5);//"ED4"
        s2 = s2.toUpperCase();//"ED4"
        //How many objects are created? 2

        //Question 10
        String product = "Pen";
        product.toLowerCase();
        product.concat(" BOX".toLowerCase());
        //System.out.println(product.substring(4, 6));//throws java.lang.StringIndexOutOfBoundsException

        //Question 11
        String inputFromConsole = " betaTEST ";
        String cleanedInput;
        cleanedInput = inputFromConsole.toUpperCase();//" BETATEST "
        cleanedInput = cleanedInput.trim();//"BETATEST"
        System.out.println("[" + cleanedInput + "]");//"[BETATEST]"

        //Question 12
        String digits = "0123456789";
        System.out.println(digits.substring(digits.indexOf("4"), digits.indexOf("8"))//4567
                .concat("89"));//456789

        //Question 13
        String s01 = new String("hello");
        String s02 = "hello";
        String s03 = "hello";
        System.out.println(s01 == s03);//false
        System.out.println(s02 == s03);//true
        System.out.println(s01.equals(s02));//true
        System.out.println(s01.compareTo(s02));//0
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);

        //Question 14
        String $s1 = "hi";
        String $s2 = new String("hi");
        String $s3 = "hi";
        if ($s1 == $s2) {
            System.out.println("s1 and s2 equal");
        } else {
            System.out.println("s1 and s2 not equal");
        }
        if ($s1 == $s3) {
            System.out.println("s1 and s3 equal");
        } else {
            System.out.println("s1 and s3 not equal");
        }

        //Question 15
        String st1 = "foo-bar";
        String st2 = new String("foo-bar");
        System.out.print(st1.equals(st2) + " "); //true
        System.out.print(st1 == st2);//false
        System.out.println(" " + st1.compareTo(st2));//0

        //Question 16
        String str = "Java";
        StringBuffer buffer = new StringBuffer(str);
        if (str.equals(buffer)) {//false
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        //Question 17
        StringBuilder sb = new StringBuilder();
        String h1 = "Helloworld";
        sb.append("Hello").append("world");//sb="Helloworld"
        if (h1 == sb.toString()) {//false
            System.out.println("They match");
        }
        if (h1.equals(sb.toString()) && h1.compareTo(sb.toString()) == 0) {//true && true
            System.out.println("They really match");
        }

        //Question 18
        StringBuilder s001 = new StringBuilder("Test");
        StringBuilder s002 = new StringBuilder("Test");
        StringBuilder s003 = new StringBuilder("Test1");
        System.out.println("s001 = " + s001);
        System.out.println("s002 = " + s002);
        System.out.println(s001.compareTo(s002));//0
        System.out.println(s001.compareTo(s003));//-1
        System.out.println(s001 == s002);//false-> 2 different references
        System.out.println(s001.equals(s002));//false-> 2 different objects (With String there are the same object)

        //Question 19
        String str11 = "     ";
        str11.trim();//This method is pointing to nowhere (because it is a String)
        System.out.println(str11.equals("") + " " + str11.isEmpty());//false false

        //Question 20
        String $str = null;
        System.out.println($str.valueOf(10));//10

        //Question 21
        String $$str = "A.B.C!";
        System.out.println($$str.replaceAll(".", "a").replace("!", "?"));//,,,,,,,,

        //Question 22
        String s4 = "blooper";
        StringBuilder sb4 = new StringBuilder(s4);
        sb4.append(s4.substring(4))//"blooperper
                .delete(3, 5);//bloerper
        System.out.println(sb4);
        StringBuilder sb5 = new StringBuilder(sb4.substring(1, 3));
        System.out.println("sb5 = " + sb5);
        System.out.println("sb4 = " + sb4);
        sb4.delete(1, 3);
        System.out.println("sb4 = " + sb4);

        //Question 23
        String ss1 = "hello";
        StringBuilder ssb = new StringBuilder("hello");
        ssb.reverse();
        ssb.substring(2);
        System.out.println("ssb = " + ssb);
//        ss1.reverse();//String doesn´t have the reverse method
        if (ss1 == ssb.toString()) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //Question 24
        String s15 = "abc";
        String s25 = s15;
        s15 += "d";//"abcd"
        System.out.println(s15 + " " + s25 + " " + (s15 == s25));//Strings create new objects each time

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");//"abcd"
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));//StringBuilder can be modified(sb1 & sb2 points to the same object)

        //Question 25
        String s2_ = "action";
        m(s2_);
        System.out.println(s2_);//"action"

        //Question 26
        StringBuilder sb20 = new StringBuilder("moth");
        m1(sb20);
        System.out.println(sb20);//"mother"

        //Question 27
        String s10 = new String("java");
        StringBuilder s20 = new StringBuilder("java");
        replaceString(s10);
        replaceStringBuilder(s20);
        System.out.println(s10 + s20);
    }

    static void m(String s1) {
        s1 = "acting";
    }

    static void m1(StringBuilder sb1) {
        sb1.append("er");
    }

    static void replaceString(String s) {
        s = s.replace('j', 'l');
    }

    static void replaceStringBuilder(StringBuilder s) {
        s.append("c");
    }
}
