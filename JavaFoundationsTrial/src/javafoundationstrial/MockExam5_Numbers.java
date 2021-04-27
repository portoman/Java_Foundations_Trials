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

        byte b2 = 1;
//        b2= b2+1;
//        System.out.println("b2 = " + b2);
        int i = 128;

        //Question 5: Which of the given code snippets will compile?
        long id = 6;
//        int i2 = id;// Possible lossy conversion from long to int 
        float f = 6.32f;
//        int i3 = f;// Possible lossy conversion from float to int 
        char c2 = 'A';
        int i4 = c2;
        System.out.println("i4 = " + i4);

        int i5 = 0;
        byte b02 = (byte) i5;

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
        float f2 = 320;
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
        float f02 = -123;
//        float d3 = 0 * 1.5;//Possible lossy conversion from fdouble to float

        //Question 13
        int i6;
        float f7 = 2.3f;
        double d3 = 2.7;
        i6 = ((int) Math.ceil(f7)) * ((int) Math.round(d3));
        System.out.println("f7 = " + f7);//3
        System.out.println("d3 = " + d3);//3
        System.out.println(i6);//9

        //Question 14
        double num = -25.67;
        System.out.println(Math.abs(num));//25,67

        //Question 16
        int a2 = 10;
        long b3 = 20;
        short c4 = 30;
        System.out.println(++a2 + b3++ * c4);//11+600=611

        //Question 17
        int a4 = 3;
        a4 = ++a4 + a4++;//4+4=8
        a4 = --a4 - a4--;//7-7=0
        System.out.println(a4);//0

        //Question 18
        int a5 = 3;
        a5 = ++a5 + ++a5;//4+5=9
        a5 = --a5 - --a5;//8-7
        System.out.println(a5);//1

        //Question 19
        int x = 1____3; //1
        long y = 1_3; //2
        float z = 3.234_567f; //3
        System.out.println(x + " " + y + " " + z);//13 13 3.234567

        //Valid numbers
        int hex = 0xCAFE_BABE;
        float f8 = 9898_7878.333_333f;
        int bin = 0b1111_0000_1100_1100;

        //Question 21
//         int bi1 = (binary) 100111000100000;
        //int bi2 = 01001110_00100000;
        int bi3 = 0b01001110_00100000;//Binary always prefixed with 0b or 0B
        //int bi4 = b1001110_00100000;

        //Question 22
        //long y = 123_456_L;//Undesrscore must be between numbers, never at the begining or at the end
        //long z11 = _123_456L;
        //float f11 = 123_.345_667F;
        float f21 = 123_345_667F;

        //Question 23
        double x12 = 0xb11_000;//0x is Hexadecimal, and b is a valid Hexadecimal digit
        float x13 = 0b10_000;//Binary
//        float x14=0b20_000;//Binary digits only are 0 and 1
//        float x14 =0b10_000f;//The floating suffices f, F, d and D can be used only with decimal system, not with binary
//        double d = 0b10_000D;//The floating suffices f, F, d and D can be used only with decimal system, not with binary
        float x14 = 0b10_000; //The binary number converts to float
        double d14 = 0b10_000; //The binary number converts to double

        float x15 = 0x10_000f;
        double d15 = 0x10_000d;

        long x17 = 0b10000L;

        float x16 = 010_000f;//x16=10000.0-> Float as Octal will be interpreted as decimal, not as Octal
        double d16 = 010_000d;//d16=10000.0-> Double as Octal will be interpreted as decimal, not as Octal
        int i16 = 010_000; //i16=4096

        /*
        3.10 Literals
            A literal is the source code representation of a value of a primitive type , the String type, or the null type.
        
        Literal:
            IntegerLiteral
            FloatingPointLiteral
            BooleanLiteral
            CharacterLiteral
            StringLiteral
            TextBlock
            NullLiteral
        
        3.10.1 Integer Literals: 
            An integer literal may be expressed in decimal (base 10), hexadecimal (base 16), octal (base 8), or binary (base 2).
                    Decimal numeral digits: 1 2 3 4 5 6 7 8 9
                    Hexadecimal numeral digits: 0 1 2 3 4 5 6 7 8 9 a b c d e f (A B C D E F), Prefix: 0x or 0X (Upper or Lower, doesn´t matter)
                    Octal numeral digits: 0 1 2 3 4 5 6 7, Prefix: 0
                    Binary numeral digits: 0 1, Prefix: 0b or 0B
        
        Integer Primitives: 
            Byte: 8 bits    | Possible values: 2^8=256     |  Min value= -128,  |  Max value=127
            Short: 16 bits  | Possible values: 2^16=65.535 |  Min value=-32.768 |  Max value=32.767
            Int: 32 bits    | Possible values:2^32=...     |  Min value=-2^31   |  Max value=2^31-1
            Long: 64 bits   | Possible values:2^64=...     |  Min value=-2^63L  |  Max value=2^63L-1
        
                The compilator always assumes that the integer numbers are int
        
        Int:
        
        Max decimal value:     2147483647 (2^31-1)
        Max hexadecimal value: 0x7fff_ffff
        Max octal value:       0177_7777_7777
        Max binary value:      0b0111_1111_1111_1111_1111_1111_1111_1111
        
        Min decimal value:     -2147483648 (-2^31)
        Min hexadecimal value: 0x8000_0000
        Min octal value:       0200_0000_0000
        Min binary value:      0b1000_0000_0000_0000_0000_0000_0000_0000
        
        Value -1 in decimal:    -1
        Value -1 in hexadecimal:0xffff_ffff
        Value -1 in octal:      0377_7777_7777
        Value -1 in binary:     0b1111_1111_1111_1111_1111_1111_1111_1111
        
        Long:
        
        Max decimal value:      9223372036854775807L (2^63-1)
        Max hexadecimal value:  0x7fff_ffff_ffff_ffffL
        Max octal value:        07_7777_7777_7777_7777_7777L
        Max binary value:       0b0111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111L
        
        Min decimal value:      -9223372036854775808L (-2^63)
        Min hexadecimal value:  0x8000_0000_0000_0000L
        Min octal value:        010_0000_0000_0000_0000_0000L
        Min binary value:       0b1000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L
        
        Value -1 in decimal:     -1
        Value -1 in hexadecimal: 0xffff_ffff_ffff_ffffL
        Value -1 in octal:       017_7777_7777_7777_7777_7777L
        Value -1 in binary:      0b1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111L
        
        3.10.2 Floating-Point Literals
            A floating-point literal may be expressed in decimal (base 10) or hexadecimal (base 16).
        
        Floating primitives:
            Float: 32 bits  | Example: float pi = 3.141592F
            Double: 64 bits | Example: double pi = 3.141592  
        
             The compilator always assumes that the floating numbers are double
        
        Float:
        
        Max decimal value:     3.4028235e38f
        Max hexadecimal value: 0x1.fffffeP+127f
        
        Min decimal value:     1.4e-45f.
        Min hexadecimal value: 0x0.000002P-126f and 0x1.0P-149f
        
        Double:
        
        Max decimal value:     1.7976931348623157e308
        Max hexadecimal value: 0x1.f_ffff_ffff_ffffP+1023.
        
        Min decimal value:     4.9e-324
        Min hexadecimal value: 0x0.0_0000_0000_0001P-1022 and 0x1.0P-1074
        
        3.10.3 Boolean Literals
            True or false
        
        3.10.4 Character Literals
        
        UTF-16 values: from \u0000 to \uffff
        Char has 16 bits
        
        Examples of char literals: 
        
                char a= 'a';
                char b= '%';
                char c= '\t';
                char d= '\\';
                char e= '\'';
                char f= '\u03a9';
                char g= '\uFFFF';
                char h= '\177';
                char i= '™';
         */
        //Question 24
        int i1 = 1, i2 = 2, i31 = 3;
        int i41 = i1 + (i2 = i31);//1+3
        System.out.println(i41); //i41=4

        //Question 25
        float f1 = 1f;//f1=1.0
        float f11 = 0010f;// f11=10.0
        float f31 = 0x001f;// f31= 31.0
        float f41 = 0x001;//f41=1.0
        int i11 = 010;//i11=8

        //Question 26
        // float f01 = 5.5;//From double to float NOK
        //float f02 = 43e10;//From double to float NOK
        float f03 = -1;//From int to float OK
        float f04 = 0x0123;//From int to float OK
        float f05 = 4;//From int to float OK
        //int i01 = 2e5;//From double to int NOK
        //int i02 = 0xDeadCafeL;//From long to int NOK
        //double d02 = 0b000101D;//Binary cannot have d, D or f, F suffixes
        long l01 = 0xDeadCafeL;//Long to long OK

        //Question 27
        int i01, j01 = 0;
        i01 = (3 * 2 + 4 + 5);//i01=15
        j01 = (3 * ((2 + 4) + 5));//j01=3*11=33
        System.out.println("i: " + i01 + "\nj: " + j01);

        //Question 28
        boolean log3 = (5.0 != 6.0) && (4 != 5); //true && true=true
        boolean log4 = (4 != 4) | (4 == 4);//false | true= true
        boolean log5 = (0 == -0) & (0 == 0.0);// true& true= true
        System.out.println("log3: " + log3 + "\nlog4: " + log4 + "\nlog5: " + log5);

        //Question 29
        System.out.println("Result: " + 2 + 3 + 5);//Result: 235
        System.out.println("Result: " + 2 + 3 * 5);//Result: 215

        //Question 30
        int ii, jj = 0;
//        if(ii++ == ++jj){//Variable ii hasn´t been iniziated, only declared
        System.out.println("True: ");
        
        //Math class round examples:
        
        //Round: Nearest integer number 
        System.out.println("Round of 2,81: "+Math.round(2.81));//3
        System.out.println("Round of 2,48: "+Math.round(2.48));//2
        
        //Ceil: Upper integer number
        System.out.println("Ceil of 2,81: "+Math.ceil(2.81));//3
        System.out.println("Ceil of 2,48: "+Math.ceil(2.48));//3
        
        //Floor: Lower integer number
        System.out.println("Floor of 2,81: "+Math.floor(2.81));//2
        System.out.println("Floor of 2,48: "+Math.floor(2.48));//2
        
       
        }
    }


