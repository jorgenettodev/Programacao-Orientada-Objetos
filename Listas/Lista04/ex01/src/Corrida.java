public class Corrida {

    String nome;
    int distancia;
    int quantidadeParticipantes;
    
    public void comecar() {
      System.out.println("Foi dada a largada da " + nome + " com " + quantidadeParticipantes);
    }
    
    public void imprimirDetalhes() {
      System.out.println(String.format(
        """
        Nome da corrida: %s 
        Distancia em KM: %s 
        Participantes: %s
        """
      ,nome, distancia, quantidadeParticipantes));
    }
    
    public void celebrarPodio() {
      System.out.println("Terminamos mais uma corrida e gostariamos de parabenizar os atletas pelo empenho!");
    }
  
  }