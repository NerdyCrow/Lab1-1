package by.belstu.it.slemnyov.basejava;
/**
 * @author Victor
 * @version 2.1
 */
import java.util.Arrays;
import by.belstu.it.slemnyov.basejava.WrapperString;
import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;
import static java.lang.Math.log;
import  static  java.lang.Math.*;

public class JavaTest<name> {
    /** Constanta */
    final int cons = 15;
    /** type int */
    public final int cons1 = 25;
    public static int cons2=28;
    /**params
     @param args Parm
     */


    public static void main(String[] args) {

        char ch='a';
        int in=0;


        short sh=1;
        byte b=1;
        long l=20;
        boolean bool=false;
        boolean bool1=true;
        double db=12.2;
        String str="Hello";
        str=str+in;
        System.out.println("String + int " + str+in);
        System.out.println("String + char " + str+ch);
        System.out.println("String + double " + str+db);
        //b=b+in; Нельзя
       // in=db+l; Нельзя
        l=in+2147483647;
        System.out.println("in+2147483647 = " +l);
        /*static int sint;
        System.out.println(sint);*/
        bool = bool&&bool1;
        System.out.println("Bool && bool " + bool);
        bool = bool ^ bool1;
        System.out.println("Bool1 ^ bool1 " + bool);
        //bool= bool+boll;
         long lg=9223372036854775807l;
        System.out.println(lg);
        long lg2=0x7fff_ffff_fffl;
        System.out.println(lg2);
        char ch2 = 'a';
        System.out.println(ch2);
        char ch3= '\u0061';
        System.out.println(ch3);
        char ch4=97;
        System.out.println(ch4);

        System.out.println(ch2);
        System.out.println(ch2+ch3+ch4);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println( Float.intBitsToFloat(0xFF800000));
        System.out.println(PI);
        System.out.println(Math.E);
        System.out.println(Math.round(Math.E));
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.min(PI,E));
        System.out.println(Math.random()*10);

        Boolean bel = new Boolean(true);
        Character character = new Character('c');
        Integer integer = new Integer(21);
        Byte bt = new Byte((byte)1);
        Short shrt= new Short((short)12.2);
        Long lng = new Long(546);
        Double dbl = new Double(15.2);
        System.out.println(integer<<1);
        System.out.println("MIN_VALUE long : " + lng.MIN_VALUE);
        System.out.println("Max_Value long "+lng.MAX_VALUE);
        System.out.println("Max_Value double "+dbl.MAX_VALUE);
        System.out.println("Min_Value double "+dbl.MIN_VALUE);
        //распаковка
        int in15 = 0;
        in15 = new Integer(9);
        byte bt15=0;
        bt15= new Byte((byte)21);
        // TODO упаковка
        Integer int21=9;
        Byte bt21=17;

        in15 = Integer.parseInt("a",16);
        System.out.println("Parse int "+ in15);
        System.out.println("toHexString  "+ Integer.toHexString(11));
        System.out.println("C0mpare 211 5     " + Integer.compare(211,15));
        System.out.println("To string  : " + Integer.toString(21));
        int hz = 21;
        System.out.println("Bitcount  "+ Integer.bitCount(21));
        System.out.println("isNaN " + dbl.isNaN());


        String s34 = "2345";
        int per = Integer.parseInt(s34);
        int hr = Integer.valueOf(s34);
        int con = new Integer(s34);

        byte[] byteArray = s34.getBytes();
        System.out.println("Строку в массив байт " + Arrays.toString(byteArray));

        String str15 = new String(byteArray);
        System.out.println("Байты в строку " + str15);

        String s = "gg";
        Boolean booool = s.equals("gg");
        System.out.println(booool);
        s="true";
        Boolean bool5 = Boolean.valueOf(s);
        boolean bb2 = Boolean.parseBoolean(s);
        System.out.println(bb2);

        String taskf="Hello";
        String taskf2="Hello";
        System.out.println(taskf == taskf2);
        System.out.println(taskf.equals(taskf2));
        System.out.println(taskf.compareTo(taskf2));
        taskf2=null;
        System.out.println(taskf == taskf2);
        System.out.println(taskf.equals(taskf2));
       // System.out.println(taskf.compareTo(taskf2));
        taskf = "Hello World";
        String[] words = taskf.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(taskf.contains("Hello"));//содержит ли строку
        System.out.println(taskf.hashCode());
        System.out.println(taskf.hashCode());
        System.out.println(taskf.indexOf('e'));
        System.out.println(taskf.length());
        String taskf3=taskf.replace("Hel","Hi");
        System.out.println(taskf3);

        char[][] taskg1 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        char[] taskg2[];
        char taskg3[][];
        char[] arr2={'a','b','c'};
       // System.out.println(arr2[3]);//" java.lang.ArrayIndexOutOfBoundsException

        taskg1=new char[3][];
        taskg1[0]=new char[1];
        taskg1[1]=new char[2];
        taskg1[2]=new char[3];

        System.out.println(taskg1.length);
        System.out.println(taskg1[0].length);
        System.out.println(taskg1[1].length);
        System.out.println(taskg1[2].length);
        taskg2 = new char[][]{ {'1','2','3'}, {'1','2','3'}, {'1','2','3'}};
        taskg3= new char[][]{ {'1','2','3'}, {'1','2','3'}, {'1','2','3'}};
        boolean comRez = taskg3==taskg2; // сравнение по ссылкам,разные
        System.out.println(comRez);
        taskg2=taskg3;
        for (char[] z2 :
                taskg2) {
            for (int z:
                    z2) {
                System.out.print(" " + z);
            }
            System.out.println("");
        }
        /*int[] arr1 = new int[]{1,2,3};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr1[i]);
        }*///Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
/**
 * {@value #wrap} wrap description
 */

        WrapperString wrap = new WrapperString("Victory");
        wrap.replace('y','!');
        System.out.println(wrap.getStrwrap());

        WrapperString anon = new WrapperString("hello"){
            /** Получает значение свойства , которое можно задать с помощью метода {@link #replace(char, char)}
             @return Значение свойства
             */
            @Override
            public void replace(char oldchar,char newchar){
                super.replace(newchar,'\0');
            }
            public void delete(char newchar)
            {
                super.replace(newchar, '\0');
            }
        };
        anon.replace('a','o');
        System.out.println(anon.getStrwrap());







    }
}
