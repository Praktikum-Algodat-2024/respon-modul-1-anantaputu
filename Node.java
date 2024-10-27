public class Node {
  String nama;
  Node next;
  Node prev;

  public Node(String nama){
    this.nama = nama;
    this.next = null;
    this.prev = null;
  }
}