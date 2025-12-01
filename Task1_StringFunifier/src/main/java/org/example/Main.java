package org.example;


abstract class StringFunifier{
    String boringString="abbccCDdBcc";
    public abstract String getFunnyString();
}
class Method1 extends StringFunifier{
    @Override
    public String getFunnyString() {
        int[] StartIndexList={1,5,7,11};
        int[] endIndexList={3,5,10,12};


        return "fgg";
    }
}
public class Main {
    public static void main(String[] args) {
        Method1 Funifier=new Method1();
                Funifier.getFunnyString();


    }

}