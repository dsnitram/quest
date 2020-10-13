package br.ufjf.dcc193.dsnitram.quest;

import org.springframework.stereotype.Component;

@Component
public class Guerreiro implements Heroi {

  public Guerreiro() {
    System.out.println("Um novo Paladino chega ao reino");
  }
  @Override
  public void agir(){
  System.out.println("O Gerreiro luta!");    
  }

}
