package Behavioural.State.MediaPlayer;

public class MediaPlayer {
    private State state;
    public MediaPlayer(){
        state = new StopState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public void play(){
        state.play();
    }

    public void resume(){
        state.resume();
    }

    public void pause(){
        state.pause();
    }

    public void stop(){
        state.stop();
    }


    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.resume();
        mediaPlayer.stop();
    }
}
