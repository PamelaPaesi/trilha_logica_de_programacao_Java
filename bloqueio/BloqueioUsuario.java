package bloqueio;

import java.util.Scanner;

public class BloqueioUsuario {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        int count = 0;
        String lastUser = "";
        while (true) {
            System.out.println("Digite seu usuário: ");
            String usuario = digita.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = digita.nextLine();

            if (!usuario.equals(lastUser)){
                count = 0;
                lastUser = usuario;
            }

            if(!usuario.equals("aluno")){
                System.out.println("Usuário incorreto ou inexistente!");
            }
            else{
                if(usuario.equals("aluno") && senha.equals("segredo")){
                    System.out.println("Bem vindo!");
                    break;
                }
                else{
                    if(count == 2){
                        System.out.println("Usuário bloqueado!");
                        break;
                    }
                    count  = count + 1;
                    System.out.println("Senha incorreta, mais " + (3-count) + " tentivas o usuário será bloqueado!");
                }
            }
        }
    }
    
}
