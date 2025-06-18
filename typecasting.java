public class typecasting{


    public static void main(String[] args) {
        System.err.println("Type Casting");

        //automatic casting- wide casting
        float fvar = 23.24f;
        double dvar = fvar;
        long lvar = (long) fvar;
        System.out.println(fvar);
        System.out.println(dvar);

        // manual casting -narrow casting
        System.out.println(lvar);

        //primitive to non primitive  or non to pri
        int vr = 2;
        String str = String.valueOf (vr);
        float fl = 20.4f;
        String str1 = String.valueOf(fl);

        System.out.println(vr+vr);
        System.out.println(str+str);
        System.out.println(fl+fl);
        System.out.println(str1+str1);


    }

}
