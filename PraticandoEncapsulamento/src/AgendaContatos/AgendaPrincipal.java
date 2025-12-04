package AgendaContatos;

import java.util.ArrayList;

public class AgendaPrincipal {
    public static void main(String[] args) {

        ArrayList<Contatos> contatos = new ArrayList<>();

        Contatos contatosUm = new Contatos("Gabriel Dummer","(51)99999-0000");
        Contatos contatosDois = new Contatos("Victor Brito","(21)98888-0000");
        Contatos contatosTres = new Contatos("Caio","(21)97777-0000");
        Contatos contatosQuatro = new Contatos("Gabriel Fernandes","(51)96666-0000");

        contatos.add(contatosUm);
        contatos.add(contatosDois);
        contatos.add(contatosTres);
        contatos.add(contatosQuatro);

int indice = 1;
        for(Contatos Contatos: contatos){

            System.out.printf("%d.%s - %s\n", indice++,Contatos.getNome(),Contatos.getTelefone());
        }
    }
}
