package dio.Spring.Mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    @Autowired
    private Remetente noreply; // objetos remetente
    @Autowired
    private Remetente gftTeam;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        gftTeam.setEmail("tech@dio.com.br");
        System.out.println(gftTeam);
        System.out.println("Bem-vindo à Team GFT");
    }
}
