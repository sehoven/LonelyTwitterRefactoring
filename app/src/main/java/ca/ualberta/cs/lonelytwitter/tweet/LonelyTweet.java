package ca.ualberta.cs.lonelytwitter.tweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public abstract class LonelyTweet implements Serializable{
    private static final long serialVersionUID = 1L;
    private Date tweetDate;
    String tweetBody;

    LonelyTweet() {
        this.tweetDate = new Date();
        this.tweetBody = "default text";
    }

    LonelyTweet(String text) {
        this.tweetDate = new Date();
        this.tweetBody = text;
    }

    Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();

}
