package br.ufjf.dcc193.dsnitram.quest;

public class Missao {
  private Heroi heroi;
  
  public Missao(Heroi heroi){
    this.heroi = heroi;    
  }
  public Missao(){}

    public Heroi getHeroi() {
    return heroi;
  }

  public void setHeroi(Heroi heroi) {
    this.heroi = heroi;
  }
public void iniciar() {
  System.out.println("A missão tem inicio...");
  this.heroi.agir();
}
public void concluir() {
  System.out.println("A missão terminou...");
  
}
 

}
