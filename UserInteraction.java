import java.util.*;

;public class UserInteraction {
    public static void main(String[] args) {
        String status = "Até agora nada aconteceu...";
        try {
            Scanner scnUsuario = new Scanner(System.in);
            Scanner scnSenha = new Scanner(System.in);
            System.out.println("Digite o usuario e tecle Enter");
            String txtUsuario = scnUsuario.nextLine();
            System.out.println("Digite a senha e tecle Enter");
            String txtSenha = scnSenha.nextLine();
            if (txtUsuario.equals("teste") && txtSenha.equals("teste")) {
                status = "Usuario logado com sucesso!";
            }
            scnUsuario.close();
            scnSenha.close();
        } catch (Exception e) {
            status = "Erro Exception: " + e;
        }
        System.out.println(status);
    }
}
