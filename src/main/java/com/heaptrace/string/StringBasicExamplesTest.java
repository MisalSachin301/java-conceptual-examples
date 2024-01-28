package com.heaptrace.string;

public class StringBasicExamplesTest {
    public static void main(String[] args) {
        String s = "1".repeat(5);
        System.out.print(s);
        System.out.println();

        String string = "string".replace('i', '0');
        System.out.println(string.substring(2, 5));

        String str = "  ";

        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); //true

        String s1 = "null"+null+1;
        System.out.println(s1); //nullnull1

        System.out.println("ONE"+2+3+4+"FIVE"); //ONE234FIVE

        System.out.println("A".compareTo("A")); // 0
        System.out.println("A".compareTo("B")); // -1
        System.out.println("B".compareTo("A")); // 1
        "ABC123abc".chars().forEach(System.out::print); //656667495051979899
        System.out.println();
        System.out.println("Java"+1000+2000+3000); //Java100020003000
        System.out.println(7.7+3.3+"Java"+3.3+7.7); //Java100020003000
        System.out.println("JAVAJ2EE".substring(2,5).substring(1).charAt(0));
        System.out.println("JAVAJ2EE".substring(2,5).substring(1).charAt(1));
        //System.out.println("JAVAJ2EE".substring(2,5).substring(1).charAt(2)); //java.lang.StringIndexOutOfBoundsException

        StringBuffer sb = new StringBuffer("11111");
        System.out.println(sb.insert(3, false).insert(5, 3.3).insert(7, "One")); //111fa3.One3lse11

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        stringBuffer.insert(5, "-"); // Inserting a hyphen at position 5
        System.out.println(stringBuffer); //Hello- World

       String str1 = "Java";
       String str2 = "Java";

        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.hashCode() == str2.hashCode()); //true

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4)); //true
        System.out.println(str3.hashCode() == str4.hashCode()); //true

        String str5 = "pqr";
        String str6 = new String("pqr");

        System.out.println(str5 == str6); //false
        System.out.println(str5.equals(str6)); //true
        System.out.println(str5.hashCode() == str6.hashCode()); //true

        StringBuffer sb1 = new StringBuffer("xyz");
        StringBuffer sb2 = new StringBuffer("xyz");

        System.out.println(sb1 == sb2); //false
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1.hashCode() == sb2.hashCode()); //true

        String strr1 = new String("javaguides");
        String strr2 = new String("javaguides");
        System.out.println(strr1 = strr2);

    }
}
