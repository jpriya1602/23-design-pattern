package Behavioural.State.MediaPlayer;

public class PlayState implements State{

    private MediaPlayer mediaPlayer;

    public PlayState(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void play() {
        System.out.println("Already, you are playing the song");
    }

    @Override
    public void resume() {
        System.out.println("You cannot resume from playing state");
    }

    @Override
    public void stop() {
        System.out.println("stopping the song");
        mediaPlayer.setState(new StopState(mediaPlayer));
    }

    @Override
    public void pause() {
        System.out.println("pausing the song");
        mediaPlayer.setState(new PauseState(mediaPlayer));
    }
}
/**
 * Play - play - not valid
 * Play - resume - not valid
 * Play - stop - valid
 * Play - pause - valid
 */
