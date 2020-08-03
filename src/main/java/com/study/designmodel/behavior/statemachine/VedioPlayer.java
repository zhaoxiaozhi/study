package com.study.designmodel.behavior.statemachine;

public class VedioPlayer extends IPlayer{

    private PlayerState mState=new StoppedState(this);

    @Override
    public void request(int flag) {

        System.out.println("before action:" + mState.toString());
        mState.handle(flag);
        System.out.println("after action:" + mState.toString());
    }

    @Override
    public void setState(PlayerState state) {
        mState = state;
    }

    @Override
    public void playVedio() {
        System.out.println("play vedio!");
    }

    @Override
    public void pause() {
        System.out.println("pause vedio!");
    }

    @Override
    public void stop() {
        System.out.println("stop vedio!");
    }

    @Override
    public void showAD() {

    }
}
