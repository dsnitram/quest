package br.ufjf.dcc193.dsnitram.quest;

public class Paladino implements Heroi{

  public Paladino(){
    System.out.println("Um novo Paladino chega ao reino");
  }
  @Override
  public void agir(){
  System.out.println("O Paladino luta com fé!");    
  }

}
