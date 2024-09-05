package Behavioural.State.MediaPlayer;

import javax.print.attribute.standard.Media;

public class StopState implements State {
    private MediaPlayer mediaPlayer;
    public StopState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("started playing from stop state...");
        mediaPlayer.setState(new PlayState(this.mediaPlayer));
    }

    @Override
    public void resume() {
        System.out.println("You cannot stop from resume state...");
    }

    @Override
    public void stop() {
        System.out.println("You are already in stop state...");
    }

    @Override
    public void pause() {
        System.out.println("You cannot pause from the stop state...");
    }
}

/***
 * stop - play - valid
 * stop - resume - not valid
 * stop - stop  - not valid
 * stop - pause - not valid
 */
