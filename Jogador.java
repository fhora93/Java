package ProjetoBase;

public class Jogador {
    
    String nome;
    int idade, registroPessoal;
    float altura,peso;

    public Jogador(String nome,int idade , int registroPessoal ,float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.registroPessoal = registroPessoal;
        this.altura = altura;
    }
    
    public void imprimirJogador() { 
        System.out.println("| "+registroPessoal+" |  "+nome+"  |  "+idade+" | ");    
    }
    public void imprimirIdade() { 
        System.out.println("| "+idade+" |  "+nome+"  |  "+registroPessoal+" | ");    
    }
    public void imprimirAltura() { 
        System.out.println("| "+altura+" |  "+nome+"  |  "+registroPessoal+" | ");    
    }
    
    public void imprimirBusca() {
        System.out.println(">Busca de jogador<");
        System.out.println();
        System.out.println("------------------");
        System.out.println("Nome : "+nome);
        System.out.println("Idade : "+idade+" anos");
        System.out.println("Modalidade : "+peso+"kg");
        System.out.println("Altura : "+altura+"m");
        System.out.println("Registro : "+registroPessoal);
        System.out.println("------------------");
        System.out.println();  
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRegistroPessoal() {
        return registroPessoal;
    }

    public void setRegistroPessoal(int registroPessoal) {
        this.registroPessoal = registroPessoal;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
