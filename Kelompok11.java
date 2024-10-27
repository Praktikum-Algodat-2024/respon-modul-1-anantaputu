public class Kelompok11 {
  Node head;

  public Kelompok11(){
    this.head = null;
  }

  public void addFirst(String nama) {
    Node newNode = new Node(nama);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  public void addLast(String nama) {
    Node newNode = new Node(nama);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void delete (String nama) {
    Node current = head;
    while (current.next != null) {
      if ((current.next.nama).equals(nama)) {
        current.next = current.next.next;
        // (current.next.next).prev = current;
        return;
      }
      current = current.next;
    }
  }

  public void display () {
    Node current = head;
    int counter = 1;
    System.out.println("==================================================");
    System.out.println("           Daftar Praktikan Kelompok 11           ");
    System.out.println("==================================================");
    while (current != null) {
      System.out.println(counter + " " + current.nama);
      current = current.next;
      counter += 1;
    }
  }

  public int countList () {
    Node current = head;
    int count = 0;
    while (current != null) {
      current = current.next;
      count += 1;
    }
    return count;
  }

  public Kelompok11 flipped() {
    Kelompok11 list = new Kelompok11();
    Node current = head;
    while (current != null) {
      list.addFirst(current.nama);
      current = current.next;
    }
    return list;
  }

  public Kelompok11 middleFlip() {
    Kelompok11 list = new Kelompok11();
    Node current = head.next;
    
    String namaAwal = head.nama;
    String namaAkhir = "";

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    namaAkhir = temp.nama;

    while (current.next != null) {
      list.addFirst(current.nama);
      current = current.next;
    }

    list.addFirst(namaAwal);
    list.addLast(namaAkhir);

    return list;
  }
}