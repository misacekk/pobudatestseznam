import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fronta fronta = new Fronta();

        fronta.addHrac(new Hrac("Eis", "Archer", 100));
        fronta.addHrac(new Hrac("Musil", "Warrior", 60));
        fronta.addHrac(new Hrac("Andr", "Boxer", 20));

        boolean on = true;
        while (on) {
            System.out.println("--- MENU ---");
            System.out.println("--- 1. Nový hráč do fronty ---");
            System.out.println("--- 2. Registrace dalšího hráče ---");
            System.out.println("--- 3. Výpis všech hráčů se všemi informacemi ---");
            System.out.println("--- 4. Nakouknutí, kdo je na řadě ---");
            System.out.println("--- 5. Výpis hráčů nad určitou MMR hodnotu. ---");
            System.out.println("--- 6. Hledání podle přezdívky. ---");
            System.out.println("--- 0. Konec ---");

            int volba = sc.nextInt();
            sc.nextLine();
            switch (volba) {
                case 1:
                    System.out.println("Zadej přezdívku hráče:");
                    String prezdivkaHrace = sc.nextLine();
                    System.out.println("Zadej třídu hráče:");
                    String tridaHrace = sc.nextLine();
                    System.out.println("Zadej MMR hráče:");
                    int mmrHrace = sc.nextInt();
                    if (mmrHrace < 0) {
                        System.out.println("Chybně zadaný formát.");
                    } else {
                        sc.nextLine();
                        Hrac novyHrac = new Hrac(prezdivkaHrace, tridaHrace, mmrHrace);
                        fronta.addHrac(novyHrac);
                        System.out.println("Hráč byl úspěšně přidán.");
                    }
                    break;
                case 2:
                    fronta.odebratHrac();
                    break;
                case 3:
                    fronta.vypisVsech();
                    break;
                case 4:
                    fronta.nakouknutiNaDalsiho();
                    break;
                case 5:
                    fronta.vypisNadUrcitouMMRHodnotu();
                    break;
                case 6:
                    fronta.hledaniPodlePrezdivky();
                    break;
                case 0:
                    System.out.println("Konec programu.");
                    on = false;
                    return;

            }
        }
    }
}