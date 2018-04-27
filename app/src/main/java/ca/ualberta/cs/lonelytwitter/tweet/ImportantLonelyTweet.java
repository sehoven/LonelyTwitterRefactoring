package ca.ualberta.cs.lonelytwitter.tweet;

import android.util.Log;

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet() {
    }

    public ImportantLonelyTweet(String text) {
        super(text);
    }

    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = getTweetDate() + " | " + getTweetBody();
        Log.i("important lonely tweet", s);
        return s;
    }


    private String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}
