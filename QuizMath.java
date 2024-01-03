import java.util.Scanner;

public class QuizMathematique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue au Quiz Mathématique!");
        System.out.println("Choisissez le niveau :");
        System.out.println("1. Facile");
        System.out.println("2. Difficile");

        int choixNiveau = scanner.nextInt();

        if (choixNiveau == 1) {
            jouerQuizFacile();
        } else if (choixNiveau == 2) {
            jouerQuizDifficile();
        } else {
            System.out.println("Choix invalide. Le programme se termine.");
        }

        scanner.close();
    }

    public static void jouerQuizFacile() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("\nNiveau Facile - Questions d'addition et soustraction");

        if (poserQuestion("2 + 3 =", 5, scanner)) score++;
        if (poserQuestion("8 - 4 =", 4, scanner)) score++;
        if (poserQuestion("7 + 1 =", 8, scanner)) score++;

        afficherResultat(score);

        scanner.close();
    }

    public static void jouerQuizDifficile() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("\nNiveau Difficile - Questions de multiplication et division");

        if (poserQuestion("3 * 5 =", 15, scanner)) score++;
        if (poserQuestion("12 / 4 =", 3, scanner)) score++;
        if (poserQuestion("8 * 7 =", 56, scanner)) score++;

        afficherResultat(score);

        scanner.close();
    }

    public static boolean poserQuestion(String question, int reponseCorrecte, Scanner scanner) {
        System.out.println(question);
        int reponseUtilisateur = scanner.nextInt();

        if (reponseUtilisateur == reponseCorrecte) {
            System.out.println("Correct!\n");
            return true;
        } else {
            System.out.println("Incorrect. La réponse correcte est " + reponseCorrecte + ".\n");
            return false;
        }
    }

    public static void afficherResultat(int score) {
        System.out.println("Votre score : " + score + " sur 3.");
    }
}
