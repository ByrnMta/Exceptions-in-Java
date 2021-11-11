package extraclase_4.customexceptions;

public class Exceptions {

    public void validatePassword(String user, String password, String repassword) throws CustomException {

        //Excepción para la coincidencia de contraseñas erroneas
        if (!password.equals(repassword)){
            throw new CustomException("Las contraseñas no coinciden");
        }

        //Excepción para contraseña con cantidad de caracteres insuficientes
        if (password.length() < 4) {
            throw new CustomException("La contraseña no cumple con la extensión mínimo");
        }

    }
}
