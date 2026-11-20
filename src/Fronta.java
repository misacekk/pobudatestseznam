import java.util.Scanner;

public class Fronta {
    private Node front;
    private Node rear;
    private int size;
    Scanner sc = new Scanner(System.in);

    public Fronta() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void addHrac(Hrac hrac) {
        Node newNode = new Node(hrac);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    public void odebratHrac() {
        if (front == null) {
            System.out.println("Fronta je prázdná.");
            return;
        }
        System.out.println("Obsluhován: " + front.getData());
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void vypisVsech() {
        if (front == null) {
            System.out.println("Fronta je prázdná.");
            return;
        }
        Node currentNode = front;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public void nakouknutiNaDalsiho() {
        if (front == null) {
            System.out.println("Fronta je prázdná.");
            return;
        }
        System.out.println(front.getData());
    }

    public void vypisNadUrcitouMMRHodnotu() {
        if (front == null) {
            System.out.println("Fronta je prázdná.");
            return;
        }
        System.out.println("Zadej MMR hodnotu:");
        int hodnota = sc.nextInt();
        Node currentNode = front;
        if (currentNode.getData().getMMRHrace() > hodnota) {
            while (currentNode != null) {
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }
    }

    public void hledaniPodlePrezdivky(){
        if (front == null) {
            System.out.println("Fronta je prázdná.");
            return;
        }
        System.out.println("Napiš přezdívku hráče.");
        String hledanaPrezdivkaHrace = sc.nextLine();
        boolean nalezeno = false;
        Node currentNode = front;
        while (currentNode != null) {
            if (currentNode.getData().getPrezdivkaHrace().equalsIgnoreCase(hledanaPrezdivkaHrace)) {
                System.out.println(currentNode.getData());
                nalezeno = true;
            }
            currentNode = currentNode.getNext();
        }
        if (!nalezeno) {
            System.out.println("Nenalezeno.");
        }
    }
}
