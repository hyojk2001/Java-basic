import java.util.*;


abstract class Player {
    int hand; //손 (가위 바위 보)
  }
  
  // 사람 손
  class Human extends Player {
    Scanner sc = new Scanner(System.in);
  
    public int humanHand(){
    do {
      System.out.print("가위바위보!!!0...바위/1...가위/2...보");
      hand = sc.nextInt();
    }while(hand < 0 || hand > 2);
    return hand;
    }
  }
  
  // 컴퓨터 손
  
  class Computer extends Player {
    Random rand = new Random();
  
    public int ComputerHand() {
      return rand.nextInt(3);
    }
  }

  

class quiz13_5{
    public static void main(String[] args){
  
      Human hp = new Human();
      Computer cp = new Computer();
      String[] hands = {"가위","바위","보"};
  
      int humanHand = hp.humanHand();
      int computerHand = cp.ComputerHand();
  
      System.out.println("나는 "+hands[humanHand]+"이고, 당신은"+hands[computerHand]+"입니다. ");
    }
}