public class DataTypes {
        int a;
        byte b;
        short c;
        long d;
        float e;
        double f;
        char g;
        boolean bool;
    void type1(){
        System.out.println("int"+a);
        System.out.println("byte"+b);
        System.out.println("short"+c);
        System.out.println("long"+d);
        System.out.println("float"+e);
        System.out.println("double"+f);
        System.out.println("char"+g);;
        System.out.println("boolean:"+bool);
    }
    public static void main(String[] args) {
       
        DataTypes dt=new DataTypes();
        dt. type1();
        dt.a=10;
        dt.type1();
    }
}
