import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] board = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		char player = 'x';

		for (int i = 0; i < 9; i++) {
			String[] command = scan.nextLine().split(",");
			int x = Integer.parseInt(command[0]);
			int y = Integer.parseInt(command[1]);

			if (x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == ' ') {
				board[x][y] = player;
			} else {
				System.out.println("Invalid input!");
				i--;
			}

			// change player
			player = (player == 'o') ? 'x' : 'o';

			for (int k = 0; k < 3; k++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(board[k][j] + "|");
				}
				System.out.println();
			}

			for (int k = 0; k < 3; k++) {
				if (board[k][0] == board[k][1] && board[k][0] == board[k][2] && board[k][0] != ' ') {
					System.out.printf("Player %c win!", board[k][0]);
					return;
				}
				if (board[0][k] == board[1][k] && board[0][k] == board[2][k] && board[0][k] != ' ') {
					System.out.printf("Player %c win!", board[0][k]);
					return;
				}
			}
			if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
				System.out.printf("Player %c win!", board[0][0]);
				return;
			}
			if (board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[1][1] != ' ') {
				System.out.printf("Player %c win!", board[1][1]);
				return;
			}
		}
		System.out.println("No winner!");
	}

}


