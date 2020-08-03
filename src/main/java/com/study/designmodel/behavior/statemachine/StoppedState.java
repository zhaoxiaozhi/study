package com.study.designmodel.behavior.statemachine;

public class StoppedState extends PlayerState{

    public StoppedState(IPlayer player) {
        super(player);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PlayingState.PLAY_OR_PAUSE:
                mPlayer.playVedio();
                mPlayer.setState(new PlayingState(mPlayer));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:"+action+",current state:"+this.getClass().getSimpleName());
        }
    }


}
