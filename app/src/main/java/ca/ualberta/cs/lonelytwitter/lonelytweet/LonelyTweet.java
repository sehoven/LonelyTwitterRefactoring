package ca.ualberta.cs.lonelytwitter.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kodak on 2016-11-15.
 */

public abstract class LonelyTweet implements Serializable {

    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    public LonelyTweet() {
        this.tweetDate = new Date();
        this.tweetBody = "Default text";
    }

    public LonelyTweet(String text) {
        this.tweetDate = new Date();
        this.tweetBody = text;
    }

    public Date getTweetDate() {
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
