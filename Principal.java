package ProjetoBase;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<Jogador> lista = new ArrayList<>();
        ArrayList<JogadorProfissional> listaProfissional = new ArrayList<>();
        
        int opcao;
        
        
        
        lista.add(new Jogador("Lucas",17,1,66,1.80f));
        listaProfissional.add(new JogadorProfissional("Corinthians","Atacante","Ronaldo",18,2,63,1.77f));
        lista.add(new Jogador("Leonardo",19,3,72,1.92f));
        lista.add(new Jogador("Ricardo",18,4,60,1.78f));
        lista.add(new Jogador("Felipe",15,5,65,1.84f));
        listaProfissional.add(new JogadorProfissional("Sao Paulo","Lateral","Andre",18,6,59,1.75f));
        lista.add(new Jogador("Vitor",16,7,70,1.86f));
        listaProfissional.add(new JogadorProfissional("Palmeiras","Meia","Thiago",17,8,62,1.73f));
        listaProfissional.add(new JogadorProfissional("Flamengo","Ponta","Messi",19,9,57,1.70f));
        lista.add(new Jogador("Ian",17,10,75,1.91f));
        
        do {
            System.out.println();
            System.out.println("> Sistema de Registro de jogadores <");
            System.out.println("  --------------------------------");
            System.out.println("  | 1- Registrar novo jogador     |");
            System.out.println("  | 2- Promover jogador           |"); 
            System.out.println("  | 3- Listar jogadores           |");
            System.out.println("  | 4- Buscar jogador             |");
            System.out.println("  | 5- remover jogador            |");
            System.out.println("  | 6- editar jogador             |");
            System.out.println("  | 7- organizar jogadores        |");
            System.out.println("  | 8- finalizar sistema          |");
            System.out.println("  --------------------------------");
            System.out.println(">Digite o numero da opção desejada: ");
            opcao = scan.nextInt();
            
            
            switch(opcao) {
                case 1:
                    registrarJogador(lista,listaProfissional);
                    break;
                    
                case 2:
                    promoverJogador(lista,listaProfissional);
                    break;
                
                case 3: 
                    MetodosListar.opcoesDeListagem(lista,listaProfissional);
                    break;
                    
                case 4:
                    MetodosRP.buscar(lista,listaProfissional);
                    break;
                    
                case 5: 
                    MetodosRP.remover(lista, listaProfissional);
                    break;
                    
                case 6: 
                    MetodosRP.editarJogador(lista, listaProfissional);
                    break;
                    
                case 7:
                    MetodosListar.opcoesParaOrganizar(lista, listaProfissional);
                    break;
                
                case 8:
                    System.out.println("Sistema finalizado!");
                    break;
            }
        } while (opcao!=8);
    }
    
    public static void promoverJogador(ArrayList<Jogador> lista, ArrayList<JogadorProfissional> listaPro) {
        
        JogadorProfissional jogadorPro;
        int rp = MetodosRP.pegarRP();
        
            for (int i=0;i<lista.size();i++) {
                if (lista.get(i).getRegistroPessoal()==rp) {
                    System.out.println();
                    System.out.println(" >Promoção de Jogador<");
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("Jogador a ser promovido: "+lista.get(i).getNome());
                    System.out.println(" >Digite o clube que o jogador irá jogar: (ex. Bahia, Flamengo)");
                    String clu = scan.next();
                    System.out.println(" >Digite a posição pela qual o jogador atua: (ex. atacante, zagueiro, goleiro)");
                    String pos = scan.next();
                    System.out.println();
                    System.out.println(">O jogador "+lista.get(i).getNome()+" foi Promovido!");
                    System.out.println("Seu Clube : "+clu);
                    System.out.println("Sua posição : "+pos);
                    
                    jogadorPro = new JogadorProfissional(clu, pos ,lista.get(i).getNome(),lista.get(i).getIdade(),lista.get(i).getRegistroPessoal(),lista.get(i).getPeso(),lista.get(i).getAltura());
                    lista.remove(i);
                    listaPro.add(jogadorPro);
                } }
            for (int i=0;i<listaPro.size();i++) {
                if (listaPro.get(i).getRegistroPessoal()==rp) {
                    System.out.println();
                    System.out.println("Não é possivel promover esse jogador, pois ele já é profissional.");
    } } }
    
    public static void registrarJogador(ArrayList<Jogador> lista,ArrayList<JogadorProfissional> listaPro) {
        
        
        Jogador jogador;
        String nom;
        int idd,pes,rp;
        float alt;
        
        System.out.println(" |Registro de jogador|");
        System.out.println(" ---------------------");
        System.out.println(">Informe o nome do jogador :");
        nom = scan.next();
        System.out.println(">Informe a idade do jogador :");
        idd = scan.nextInt();
        System.out.println(">Informe o peso do jogador :");
        pes = scan.nextInt();
        System.out.println(">Informe a altura do jogador :");
        alt = scan.nextFloat();
        rp = MetodosRP.gerarRP(lista, listaPro);
        System.out.println();
        System.out.println(">O jogador "+nom+" foi registrado!");
        System.out.println("Seu numero de registro é : "+rp);
        
        jogador = new Jogador(nom, idd, rp, pes, alt);
        
        lista.add(jogador);
        
        
    
    }
    
    
}

