public class myRunner {
    public static void main(String[] args) {

        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Perscholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
//        DemoClass obj = new DemoClass();
//        obj.genericsMethod(25);
//        obj.genericsMethod("Per Scholas");
//        obj.genericsMethod(2563.5);
//        obj.genericsMethod('H');
//    }

}
