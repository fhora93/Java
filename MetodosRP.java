package ProjetoBase;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosRP {
    static Scanner scan = new Scanner(System.in);
    
    
    public static int gerarRP(ArrayList<Jogador> lista,ArrayList<JogadorProfissional> listaPro) {
        
        int list = lista.size();
        int listPro = listaPro.size();
        int total = list+listPro;
        int rp = total+1;
        return rp;
    }
    
    public static int pegarRP() {
        int rp;
        System.out.println(">Informe o numero de registro do jogador a ser buscado:");
        rp = scan.nextInt();
        
        return rp;
    }
    /*
    public static void reduzirRP(ArrayList<Jogador> lista,ArrayList<JogadorProfissional> listaPro) {
        int list = lista.size();
        int listPro = listaPro.size();
        int total = list+listPro;
        
        for (int rp=0;rp<total;rp++) {
            for (int i=0;i<lista.size();i++)
                if (rp>lista.get(i).getRegistroPessoal())
                    for (int c=i;c<lista.size();c++)
                        lista.get(c).setRegistroPessoal(rp-1);
        
            for (int i=0;i<listaPro.size();i++)
                if (rp>listaPro.get(i).getRegistroPessoal())
                    for (int c=i;c<listaPro.size();c++)
                        listaPro.get(i).setRegistroPessoal(rp-1);
    } }
    */
    public static void buscar(ArrayList<Jogador> lista,ArrayList<JogadorProfissional> listaPro) {
        
        int rp = pegarRP();
        
        for (int i=0;i<lista.size();i++) {
            if (rp==lista.get(i).getRegistroPessoal())
                lista.get(i).imprimirBusca();
        }
        for (int i=0;i<listaPro.size();i++) {
            if (rp==listaPro.get(i).getRegistroPessoal())
                listaPro.get(i).imprimirBuscaPro();
        }     
    }
    
    public static void remover(ArrayList<Jogador> lista,ArrayList<JogadorProfissional> listaPro) {
        
        int rp = pegarRP();
        String opcao;
        int lista1=lista.size(),lista2=listaPro.size();
        int total = lista1+lista2;
        
        for (int z=0;z<total;z++) {
            if (rp==lista.get(z).getRegistroPessoal()) {
                
                System.out.println("Deseja remover o jogador "+lista.get(z).getNome()+"?");
                System.out.println("(s | confirmar) / (n | cancelar)");
                opcao = scan.next();
                
                if (opcao.equals("n")) {
                    System.out.println("remoção cancelada");
                    break;
                } else {
                    if (opcao.equals("s")) {
                        System.out.println("o jogador "+lista.get(z).getNome()+" foi removido!");
                        
                        lista.remove(z);
                        } } }
                
            if (rp==listaPro.get(z).getRegistroPessoal()) {
                
                System.out.println("Deseja remover o jogador "+listaPro.get(z).getNome()+"?");
                System.out.println("(s | confirmar) / (n | cancelar)");
                opcao = scan.next();
                
                if (opcao.equals("n")) {
                    System.out.println("remoção cancelada");
                    break;
                } else {
                    if (opcao.equals("s")) {
                        System.out.println("o jogador "+listaPro.get(z).getNome()+" foi removido!");
                        
                        listaPro.remove(z);
                        break;
                } } } } 
        
        //reduzirRP(lista,listaPro);
        System.out.println();
    }
    
    public static void editarJogador(ArrayList<Jogador> lista,ArrayList<JogadorProfissional> listaPro) {
        
        int rp = pegarRP();
        Jogador jogador;
        JogadorProfissional jogadorPro;
        String nom;
        int idd,pes;
        float alt;
        
        
        for (int i=0;i<lista.size();i++) {
            if (rp==lista.get(i).getRegistroPessoal()) {
                System.out.println(" >editar jogador<");
                System.out.println("------------------");
                System.out.println("obs *o registro pessoal do jogador não pode ser alterado*");
                System.out.println();
                System.out.println("|nome atual:"+lista.get(i).getNome()+"|");
                System.out.println("digite o novo nome:");
                nom = scan.next();
                System.out.println("|idade atual:"+lista.get(i).getIdade()+"|");
                System.out.println("digite a nova idade:");
                idd = scan.nextInt();
                System.out.println("|Peso atual:"+lista.get(i).getPeso()+"|");
                System.out.println("digite o novo peso:");
                pes = scan.nextInt();
                System.out.println("|altura atual:"+lista.get(i).getAltura()+"|");
                System.out.println("digite a nova altura:");
                alt = scan.nextFloat();
                
                jogador = new Jogador(nom,idd,rp,pes,alt);  
                lista.set(i,jogador);
            } }
        for (int i=0;i<listaPro.size();i++) {
            if (rp==listaPro.get(i).getRegistroPessoal()) {
                System.out.println(" >editar jogador<");
                System.out.println("------------------");
                System.out.println("obs *o registro pessoal do jogador não pode ser alterado*");
                System.out.println();
                System.out.println("|nome atual:"+listaPro.get(i).getNome()+"|");
                System.out.println("digite o novo nome:");
                nom = scan.next();
                System.out.println("|idade atual:"+listaPro.get(i).getIdade()+"|");
                System.out.println("digite a nova idade:");
                idd = scan.nextInt();
                System.out.println("|Peso atual:"+listaPro.get(i).getPeso()+"|");
                System.out.println("digite o novo peso:");
                pes = scan.nextInt();
                System.out.println("|altura atual:"+listaPro.get(i).getAltura()+"|");
                System.out.println("digite a nova altura:");
                alt = scan.nextFloat();
                
                jogadorPro = new JogadorProfissional(listaPro.get(i).getClube(),listaPro.get(i).getPosicao(),nom,idd,rp,pes,alt);  
                listaPro.set(i, jogadorPro);
            } }
        
    }
    
    
}