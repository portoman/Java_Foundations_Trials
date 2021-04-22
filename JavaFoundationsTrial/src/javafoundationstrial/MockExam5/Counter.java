/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundationstrial.MockExam5;

/**
 *
 * @author portb
 */
public class Counter {

    public static int getCount(String[] arr) {
        int count = 0;
        for (String var : arr) {
            if (var != null) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[1] = "C";
        arr[2] = "";
        arr[3] = "Java";
        System.out.println(getCount(arr));
        
    }
}
