public class question {
	private String question;
	private String reponse;

	/**
	 * constructeur question
	 *
	 * @param question
	 * @param reponse
	 */
	public question(String question, String reponse) {
		this.question = question;
		this.reponse = reponse;
	}

	/**
	 * retourne la question
	 * 
	 * @return String
	 */
	// retourne la question
	public String getQuestion() {
		return question;
	}

	/**
	 * retourne la reponse de la question
	 * 
	 * @return reponse
	 */
	public String getReponse() {
		return reponse;
	}
}
