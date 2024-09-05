package Behavioural.State.MediaPlayer;

import javax.print.attribute.standard.Media;

public class ResumeState implements State {
    private MediaPlayer mediaPlayer;
    public ResumeState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("You cannot play when you are in resume state...");
    }

    @Override
    public void resume() {
        System.out.println("You are already in resume state....");
    }

    @Override
    public void stop() {
        System.out.println("changing from resume state to stop state");
        mediaPlayer.setState(new StopState(this.mediaPlayer));
    }

    @Override
    public void pause() {
        System.out.println("you are already in the pause state");
    }
}


/***
 * resume - play - not valid
 * resume - resume - not valid
 * resume - pause - not valid
 * resume - stop - valid
 */