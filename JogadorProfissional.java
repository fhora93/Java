package ProjetoBase;

public class JogadorProfissional extends Jogador {
    private String clube , posicao;

    public JogadorProfissional(String clube, String posicao, String nome, int idade, int registroPessoal, float peso, float altura) {
        super(nome, idade, registroPessoal, peso, altura);
        this.clube = clube;
        this.posicao = posicao;
    }
    
    public void imprimirJogadorPro() { 
        System.out.println("| "+registroPessoal+" |  "+nome+"  |  "+idade+" | ("+clube+")");    
    }
    
    public void imprimirBuscaPro() {
        System.out.println(">Busca de jogador<");
        System.out.println();
        System.out.println("------------------");
        System.out.println("Nome : "+nome);
        System.out.println("Clube : "+clube);
        System.out.println("Posição : "+posicao);
        System.out.println("Idade : "+idade+" anos");
        System.out.println("Modalidade : "+peso+"kg");
        System.out.println("Altura : "+altura+"m");
        System.out.println("Registro : "+registroPessoal);
        System.out.println("------------------");
        System.out.println();  
    }

    
    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    } 
}