import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class console {
	private int score;
	private boolean done = false;
	private int nbreQuestion;
	Scanner clavier = new Scanner(System.in);

	/**
	 * Constructeur de la classe ConsoleQuizz
	 * 
	 * @param nbreQuestion : Le nombre de questions à poser au joueur
	 */
	public console(int nbreQuestion) {
		this.nbreQuestion = nbreQuestion;
	}

	/**
	 * pose les questions, vérifie les reponses et compte le score
	 */
	public void start() {
		try {
			ArrayList<question> questions = generate(nbreQuestion);
			for (int i = 0; i < nbreQuestion; i++) {
				System.out.println(questions.get(i).getQuestion());
				String userAnswer = clavier.nextLine();

				if (userAnswer.equalsIgnoreCase(questions.get(i).getReponse())) {
					score++;
					System.out.println("Bonne Reponse");
				} else {
					System.out.println("Mauvaise Reponse");
					System.out.println("La bonne reponse etait: " + questions.get(i).getReponse());
				}
			}
			done = true;
		} catch (IllegalArgumentException e) {
			done = false;
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Affiche le score final
	 */
	private void displayScore() {
		System.out.printf("Votre score final est de: %d/%d.\n ", score, nbreQuestion);

	}

	/**
	 * Affiche le resultat au joueur, un message d'erreur sinon
	 */
	public void displayResultats() {
		if (done) {
			displayScore();

		} else {
			System.out.println("Vous n'avez rien repondu.");
		}
	}

	/**
	 * Permet de creer un tableau de x questions-reponses, x etant choisit au
	 * lancement du jeu
	 * 
	 * @param nbreQuestions : nombre de question choisit au lancement du jeu
	 * @return : un tableau de questions
	 */
	public ArrayList<question> generate() {
		String[][] data = getData();
		int index = 0;
		ArrayList<question> questions = new ArrayList<question>();
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<Integer>();

		if (nbreQuestion > data.length) {
			throw new IllegalArgumentException("On ne peut generer que: " + data.length + " questions maximun");
		}
		indexesAlreadyTaken.clear();

		for (int i = 0; i < nbreQuestion; i++) {
			do {
				Random random = new Random();
				index = random.nextInt(data.length);
			} while (indexesAlreadyTaken.contains(index));
			indexesAlreadyTaken.add(index);
			String question = data[index][0];
			String reponse = data[index][1];
		}
		return questions;
	}

	/**
	 * Permet de creer un tableau de x questions-reponses, x etant choisit au
	 * lancement du jeu
	 * 
	 * @param nbreQuestions : nombre de question choisit au lancement du jeu
	 * @return : un tableau de questions
	 */
	public ArrayList<question> generate(int nbreQuestion) {
		String[][] data = getData();
		int index = 0;
		ArrayList<question> questions = new ArrayList<question>();
		ArrayList<Integer> indexesAlreadyTaken = new ArrayList<Integer>();

		if (nbreQuestion > data.length) {
			throw new IllegalArgumentException("On ne peut generer que: " + data.length + " questions maximun");
		}
		indexesAlreadyTaken.clear();

		for (int i = 0; i < nbreQuestion; i++) {
			do {
				Random random = new Random();
				index = random.nextInt(data.length);
			} while (indexesAlreadyTaken.contains(index));
			indexesAlreadyTaken.add(index);
			String pays = data[index][0];
			String president = data[index][1];
			String questionText = String.format("Quel est le nom du Président de : %s? ", pays);
			questions.add(new question(questionText, president));
		}
		return questions;
	}

	/**
	 * @return un tableau à deux dimensions contenant les couples pays-president
	 */
	private static String[][] getData() {
		String[][] data = { { "France", "Macron" }, { "Etats Unis", "Biden" }, { "Russie", "Poutine" },
				{ "Ukraine", "Zelensky" } };
		return data;
	}

}
