public class Main {
    private static final String[]arr= new String[]{"A1234G","B8440I"};
    private static final String[]arr1= new String[]{"a01234G","C8440I"};

    public static void main(String[] args) {
//        ValidateClass validateClass= new ValidateClass();
        for (String e:arr
             ) {
            boolean isvalid= ValidateClass.validateClass(e);
            System.out.println("Class "+e+" is valid "+isvalid);
        }for (String e:arr1
             ) {
            boolean isvalid= ValidateClass.validateClass(e);
            System.out.println("Class "+e+" is valid "+isvalid);
        }
    }
}
