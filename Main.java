public class Main {
  public static void main(String[] args) {
    Kelompok11 kelompokAlgodat = new Kelompok11();

    kelompokAlgodat.addFirst("Nayla");
    kelompokAlgodat.addLast("Nini");
    kelompokAlgodat.addLast("Wira");
    kelompokAlgodat.addLast("Ananta");
    kelompokAlgodat.addLast("Salsa");
    kelompokAlgodat.addLast("Raja");
    kelompokAlgodat.addLast("Alfath");
    kelompokAlgodat.addLast("Nopal");

    kelompokAlgodat.display();

    kelompokAlgodat.delete("Wira");

    kelompokAlgodat.display();
    
    kelompokAlgodat = kelompokAlgodat.middleFlip();
    
    kelompokAlgodat.display();
    
    kelompokAlgodat = kelompokAlgodat.flipped();

    kelompokAlgodat.display();
  }
}