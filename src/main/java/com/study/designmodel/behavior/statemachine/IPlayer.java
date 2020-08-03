package com.study.designmodel.behavior.statemachine;

public abstract class IPlayer {

    public abstract  void request(int flag);

    public abstract void setState(PlayerState state);

    public abstract void  playVedio();

    public abstract void pause();

    public abstract void stop();

    public abstract void showAD();

}
