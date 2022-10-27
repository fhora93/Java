package ProjetoBase;

import static ProjetoBase.Principal.scan;
import java.util.ArrayList;

public class MetodosListar {
    
    public static void opcoesDeListagem(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        int opcao = menuLista();
                    switch (opcao) {
                        case 1:
                                MetodosListar.listarTodos(lista,listaPro);
                                break;
                        case 2: 
                                MetodosListar.listarJogadoresPro(lista, listaPro);
                                break;
                        case 3:
                                MetodosListar.listarJogadores(lista, listaPro);
                                break;
                        case 4: 
                                System.out.println("Listagem cancelada");
                                System.out.println();
                    }

    }
    public static void opcoesParaOrganizar(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        int opcao = menuOrganizar();
                    switch (opcao) {
                        case 1:
                                organizarRP(lista,listaPro);
                                break;
                        case 2: 
                                organizarIdade(lista, listaPro);
                                break;
                        case 3:
                                organizarAltura(lista, listaPro);
                                break;
                        case 4: 
                                System.out.println("Organização cancelada");
                                System.out.println();
                    }

    }
    
    public static int menuLista() {
        
        System.out.println("             >Listar jogadores<");
        System.out.println(" ---------------------------------------------");
        System.out.println("| 1- Listar todos os jogadores                |");
        System.out.println("| 2- Listar apenas os jogadores profissionais |");
        System.out.println("| 3- listar apenas os jogadores amadores      |");
        System.out.println("| 4- Sair                                     |");
        System.out.println(" ---------------------------------------------");
        System.out.println(" >Digite como você quer listar os jogadores :");
        int opcao = scan.nextInt();
            return opcao;
    }
    public static int menuOrganizar() {
        
        System.out.println("        >Organizar jogadores<");
        System.out.println(" --------------------------------------");
        System.out.println("| 1- organizar pelo numero de registro |");
        System.out.println("| 2- organizar por idade               |");
        System.out.println("| 3- organizar por altura              |");
        System.out.println("| 4- Sair                              |");
        System.out.println(" --------------------------------------");
        System.out.println(" >Digite como você quer organizar os jogadores:");
        int opcao = scan.nextInt();
            return opcao;
    }
    
    public static void listarTodos(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        
        int lista1=lista.size(),lista2 = listaPro.size();
        int total=1+lista1+lista2;
        
        System.out.println("| RP |  Nome | idade | ");
        System.out.println("-----------------------");
        System.out.println("| Jogadores Registrados |");
        
        for (int rp=0;rp<total;rp++) {
            for (int i=0; i<lista.size();i++) {
                if (lista.get(i).getRegistroPessoal()==rp) 
                    lista.get(i).imprimirJogador();
    }  
            for (int i=0; i<listaPro.size();i++) {
                if (listaPro.get(i).getRegistroPessoal()==rp) 
                    listaPro.get(i).imprimirJogadorPro();     
    }  
        }
        System.out.println("-----------------------");
        System.out.println();
        }
    public static void listarJogadores(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro){
        
        System.out.println("| Jogadores amadores | ");
        System.out.println("| RP |  Nome | idade | ");
        System.out.println("-----------------------");
        
        for (int i=0;i < lista.size();i++) 
            lista.get(i).imprimirJogador();
        
        System.out.println("-----------------------");
        System.out.println();
} 
    public static void listarJogadoresPro(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        
        System.out.println("|   Jogadores Pro    |");
        System.out.println("| RP |  Nome | idade | ");
        System.out.println("----------------------");
        
        for (int i=0;i < listaPro.size();i++) 
            listaPro.get(i).imprimirJogadorPro();
        
        System.out.println("----------------------");
        System.out.println();
    }
    
    public static void organizarRP(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        
        int lista1=lista.size(),lista2 = listaPro.size();
        int total=lista1+lista2;
        
        System.out.println(">Lista Organizada por RP<");
        System.out.println();
        System.out.println("| RP |  Nome | idade | ");
        System.out.println("----------------------");
        
        for (int rp=0;rp<total;rp++) {
            for (int i=0; i<lista.size();i++) {
                if (lista.get(i).getRegistroPessoal()==rp) 
                    lista.get(i).imprimirJogador();
    }  
            for (int i=0; i<listaPro.size();i++) {
                if (listaPro.get(i).getRegistroPessoal()==rp) 
                    listaPro.get(i).imprimirJogador();     
    }  
        }
        System.out.println("----------------------");
    }
    
    public static void organizarIdade(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        
        System.out.println(">Lista organizada por Idade<");
        System.out.println();
        System.out.println("| idade |  Nome | RP | ");
        System.out.println("-----------------------");
        
        for (int i=0; i<lista.size();i++) {
                    for (int c=0; c<lista.size();c++ ) {
                        if (lista.get(i).getIdade()< lista.get(c).getIdade()) {
                            Jogador a = lista.get(i);
                            Jogador b = lista.get(c);
                            lista.set(c, a);
                            lista.set(i, b);
    } } }
        for (int i=0; i<listaPro.size();i++) {
                    for (int c=0; c<listaPro.size();c++ ) {
                        if (listaPro.get(i).getIdade()< listaPro.get(c).getIdade()) {
                            JogadorProfissional a = listaPro.get(i);
                            JogadorProfissional b = listaPro.get(c);
                            listaPro.set(c, a);
                            listaPro.set(i, b);
    } } }
        for(int i=0;i<lista.size();i++)
                lista.get(i).imprimirIdade();
            System.out.println("-----------------");
            System.out.println("| Jogadores Pro |");
            for(int i=0;i<listaPro.size();i++)
                listaPro.get(i).imprimirIdade();
            System.out.println("-----------------");
    }
    
    public static void organizarAltura(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        
        System.out.println(">Lista Organizada por Altura<");
        System.out.println();
        System.out.println("| altura |  Nome | RP | ");
        System.out.println("-----------------------");
        
        for (int i=0; i<lista.size();i++) {
                    for (int c=0; c<lista.size();c++ ) {
                        if (lista.get(i).getAltura()< lista.get(c).getAltura()) {
                            Jogador a = lista.get(i);
                            Jogador b = lista.get(c);
                            lista.set(c, a);
                            lista.set(i, b);
    } } }
        for (int i=0; i<listaPro.size();i++) {
                    for (int c=0; c<listaPro.size();c++ ) {
                        if (listaPro.get(i).getAltura()< listaPro.get(c).getAltura()) {
                            JogadorProfissional a = listaPro.get(i);
                            JogadorProfissional b = listaPro.get(c);
                            listaPro.set(c, a);
                            listaPro.set(i, b);
    } } }
        for(int i=0;i<lista.size();i++)
            lista.get(i).imprimirAltura();
        System.out.println("-----------------");
        System.out.println("| Jogadores Pro |");
        for(int i=0;i<listaPro.size();i++)
            listaPro.get(i).imprimirAltura();
        System.out.println("-----------------");
    }
}

    
    



