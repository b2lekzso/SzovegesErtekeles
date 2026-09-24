import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Kérek egy számot: ");
    int szam = sc.nextInt();
    switch (szam) {
        case 1:
            IO.println("Elégtelen");
            break;
        case 2:
            IO.println("Elégséges");
            break;
        case 3:
            IO.println("Közepes");
            break;
        case 4:
            IO.println("Jó");
            break;
        case 5:
            IO.println("Jeles");
            break;
        default:
            IO.println("Nincs ilyen jegy.");
    }
}
