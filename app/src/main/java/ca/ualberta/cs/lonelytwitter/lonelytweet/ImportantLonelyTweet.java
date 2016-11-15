package ca.ualberta.cs.lonelytwitter.lonelytweet;

import android.util.Log;

/**
 * Created by Kodak on 2016-11-15.
 */

public class ImportantLonelyTweet extends LonelyTweet {
    public ImportantLonelyTweet(String text){
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
        Log.i("important tweet",s);
        return s;
    }

    public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}
