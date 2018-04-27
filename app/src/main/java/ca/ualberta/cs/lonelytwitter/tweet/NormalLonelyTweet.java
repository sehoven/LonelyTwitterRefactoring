package ca.ualberta.cs.lonelytwitter.tweet;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		super(text);
	}

	public boolean isValid() {
		if (getTweetBody().trim().length() == 0
				|| getTweetBody().trim().length() > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody() ;
	}

	private String getTweetBody() {
        return tweetBody;
    }
}