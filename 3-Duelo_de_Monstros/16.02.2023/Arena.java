import java.util.Random;
import java.lang.Math;

public class Arena {

  public void comecarLuta(Monstro a, Monstro b){

    int round = 1;
    
    while(a.getVida() > 0 && b.getVida() > 0) {

      System.out.println("------------ROUND " + round +"------------");

      Random r = new Random();
      int x = r.nextInt(1);

      if(x == 0){

        int dano = b.atacar() - a.defender();
        
        if(dano < 0) {
          b.sofrerImpacto(dano);
          System.out.println(b.getNome() + " sofreu " + Math.abs(dano) + " dano de " + a.getNome());
          round += 1;
        } else {
          a.sofrerImpacto(b.atacar() - a.defender());
          System.out.println(a.getNome() + " sofreu " + Math.abs(dano) + " dano de " + b.getNome());
          round += 1;
        }
        
        x = 1;
        
      } else {

        int dano = a.atacar() - b.defender();
        
        if(a.atacar() - b.defender() < 0) {
          b.sofrerImpacto(b.atacar() - a.defender());
          System.out.println(b.getNome() + " sofreu " + Math.abs(dano) + " dano de " + a.getNome());
          round += 1;
        } else {
          a.sofrerImpacto(b.atacar() - a.defender());
          System.out.println(a.getNome() + " sofreu " + Math.abs(dano) + " dano de " + b.getNome());
          round += 1;
        }
        
        x = 0;
        
      }
      
    }
    
  }
  
}