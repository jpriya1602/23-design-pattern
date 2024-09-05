package Behavioural.State.MediaPlayer;

public class PauseState implements State{

    public MediaPlayer mediaPlayer;

    PauseState(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void play() {
        System.out.println("You cannot play the paused one...");
    }

    @Override
    public void resume() {
        System.out.println("Changing from pause state to resume");
        mediaPlayer.setState(new ResumeState(mediaPlayer));
    }

    @Override
    public void stop() {
        System.out.println("changing from pause state to stop");
        mediaPlayer.setState(new StopState(mediaPlayer));
    }

    @Override
    public void pause() {
        System.out.println("Already you are in pause state");
    }
}

/***
 * Pause - play - not valid
 * Pause - resume - valid
 * Pause - stop - valid
 * Pause - pause - valid
 */
