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
public class MockExam5_Numbers {

    public static void main(String[] args) {

        //Question 1: Which statement is correct?
//        int total score = 0;
        int totalScore2 = 0;
//        int 2totalScore = 0;
//        int total-score = 0;

        //Question 2: Which are valid declarations?
        int $x;
//        int 123;
        int _123;
//        int #dim;
//        int %percent;
//        int *divide;
        int central_sales_region_Summer_2005_gross_sales;

        //Question 3: Which 2 declarations will compile?
        int a, b, c = 0;
        //int a,b,c=0;//It doesn´t compile because it is already declared
//        int g, int h, int i=0;
        int d, e, F;
//        int k, l, m; =0;

        //Question 4: Which of the given code fragments will not compile?
        //byte a1=128;//Byte values are from -128 to 127
        byte b1 = 100;
        b1 *= 1;

//        byte b2 = 1;
//        b2=b2+1;
//        System.out.println("b2 = " + b2);
        int i = 128;

        //Question 5: Which of the given code snippets will compile?
//        long id = 6;// Possible lossy conversion from long to int 
//        int i2 = id;
//        float f = 6.32f;// Possible lossy conversion from float to int 
//        int i3 = f;
        char c2 = 'A';
        int i4 = c2;
        System.out.println("i4 = " + i4);

        int i5 = 0;
        byte b2 = (byte) i5;

        //Question 6
        float fValue = 120;
//        int iValue = fValue;//Possible lossy conversion from float to int 
        double dValue = fValue;
//        long lValue = fValue;//Possible lossy conversion from float to long 

        int iValue2 = 20;
        float fValue2 = iValue2;
        double dValue2 = iValue2;
        byte bValue3 = 2;
//        byte bValue=iValue2;//Possible lossy conversion from int to byte
//        short sValue=iValue2;//Possible lossy conversion from int to short 
        long lValue = iValue2;
        lValue = bValue3;

        float fValue3 = lValue;
        double dValue3 = lValue;

//        long lValue2=fValue3;//Possible lossy conversion from float to long
//        long lValue3=dValue3;//Possible lossy conversion from double to long
        //Question 8
        float flt = 100F;
        float flt2 = (float) 1_11.00;
        float flt3 = 100;

        double y1 = 203.22;
//        float flt4 = y1;//Possible lossy conversion from double to float

        int y2 = 100;
        float flt5 = (float) y2;

        //Question 9
//        float f1 = 1.0;//Possible lossy conversion from double to float
//        float f2 = 43e1;//Possible lossy conversion from double to float
        float f3 = -1;
        float f4 = 0x0123;
        float f5 = 4;

        //Question 10
        char c3 = 320;
        float f = 320;
        double d2 = 320;
//        byte b3 = 320;Possible lossy conversion from int to byte
        float f6 = 22.0f / 7.0f;

        //Question 11
        int i3, j, k;
        i3 = j = k = 9;
        System.out.println(i3);//i3=9

        //Question 11
        short s = 12;
        long g = 012;
        //int i6 = (int) false;//Boolean cannot be converted to int
        float f2 = -123;
//        float d3 = 0 * 1.5;//Possible lossy conversion from fdouble to float

        //Question 13
        int i6;
        float f7 = 2.3f;
        double d3 = 2.7;
        i6 = ((int) Math.ceil(f7)) * ((int) Math.round(d3));
        System.out.println("f7 = " + f7);
        System.out.println("d3 = " + d3);
        System.out.println(i6);

        //Question 14
        double num = -25.67;
        System.out.println(Math.abs(num));

        //Question 16
        int a2 = 10;
        long b3 = 20;
        short c4 = 30;
        System.out.println(++a2 + b3++ * c4);

        //Question 17
        int a4 = 3;
        a4 = ++a4 + a4++;//4+4=8
        a4 = --a4 - a4--;//7-7=0
        System.out.println(a4);//0

        //Question 19
        int x = 1____3; //1
        long y = 1_3; //2
        float z = 3.234_567f; //3
        System.out.println(x + " " + y + " " + z);//13 13 3.234567

        //Valid numbers
        int hex = 0xCAFE_BABE;
        float f8 = 9898_7878.333_333f;
        int bin = 0b1111_0000_1100_1100;
        
        

    }

}
