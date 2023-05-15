public class question {
    private String question;
	private String reponse;
 
	public question(String question, String reponse) {
		this.question = question;
		this.reponse = reponse;
	}

    //retourne la question 
	public String getQuestion() {
		return question;
	}

    //retourne la reponse de la question
	public String getReponse() {
		return reponse;
	}
}

