package tris;

import java.util.Scanner;

public class Tris2 {

	public static void main(String[] args) {

		String[][] campo = new String[3][3]; // matrice stringa 3x3

		int r, c, cont, giocatore;
		Scanner sc = new Scanner(System.in);
		boolean vittoria=false;
		// scorro tutte le righe da 0 a 3 e tutte le colonne da 0 a 3

		for (r = 0; r <= 2; r++) {
			for (c = 0; c <= 2; c++) {
				campo[r][c] = "-";
			}
		}
		cont = 0; // conta quante "X" ci sono nel campo
		giocatore = 1;

		do {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
			for (r = 0; r <= 2; r++) { // per ogni riga
				// stampo la riga
				for (c = 0; c <= 2; c++)
					System.out.print(campo[r][c] + " ");
				// vado a capo
				System.out.println();
			}
			System.out.println("Giocatore: " + giocatore);
			if (giocatore == 1)
				System.out.println("Inserisci la X");
			else
				System.out.println("Inserisci la O");

			r = sc.nextInt();
			c = sc.nextInt();
			sc.nextLine();

			if (campo[r][c].equals("X")) // confronta la casella campo[r][c] con il valore "X"
				System.err.println("Casella già occupata!");
			else {
				if (giocatore == 1) {
					campo[r][c] = "X";
					giocatore = 2;
				} else {
					campo[r][c] = "O";
					giocatore = 1;
				}

				cont = cont + 1; // cont++
			}
			System.out.print("Premi invio per continuare...");
			sc.nextLine();
			
		if ((campo[r][0] == "X" && campo[r][1] == "X" && campo[r][2] == "X")
				|| (campo[0][c] == "X" && campo[1][c] == "X" && campo[2][c] == "X")
				|| (campo[0][0] == "X" && campo[1][1] == "X" && campo[2][2] == "X")
				|| (campo[0][2] == "X" && campo[1][1] == "X" && campo[2][0] == "X")) {
			System.out.println("Giocatore 1 Vince!");
			vittoria=true;
			break;

		}

		else if ((campo[r][0] == "O" && campo[r][1] == "O" && campo[r][1] == "O")
				|| (campo[0][c] == "O" && campo[1][c] == "O" && campo[2][c] == "O")
				|| (campo[0][0] == "O" && campo[1][1] == "O" && campo[2][2] == "O")
				|| (campo[0][2] == "O" && campo[1][1] == "O" && campo[2][0] == "O")) {
			System.out.println("Giocatore 2 Vince! ");
			vittoria=true;
			break;
		}
		
			} while (cont < 9); // torno indietro se cont<9 (non abbiamo ancora occupato tutte le caselle)
		if (vittoria==false)
			System.out.println("E' un pareggio!");
		

	}

}
