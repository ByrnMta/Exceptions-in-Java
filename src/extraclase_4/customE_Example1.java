package extraclase_4;
import extraclase_4.customexceptions.Exceptions;
import extraclase_4.customexceptions.CustomException;

public class customE_Example1 {
    private String user, password, repassword;

    public void validateData(){
        Exceptions EXCPTNS = new Exceptions();
        user = "Byron";
        password = "1153";
        repassword = "1154";

        try {
            EXCPTNS.validatePassword(user, password, repassword);

        } catch (CustomException c) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
        customE_Example1 CEE = new customE_Example1();
        CEE.validateData();
    }
}
