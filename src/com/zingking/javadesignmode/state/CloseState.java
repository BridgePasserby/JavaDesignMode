package com.zingking.javadesignmode.state;

/**
 * Copyright © 2018, www.zingking.cn All Rights Reserved.
 * Create by Z.kai 2018/12/6
 * Describe:
 */
public class CloseState extends AbstractLiftState {
    @Override
    public void open() {
        stateManager.changeState(StateManager.OPEN_STATE);
        stateManager.getCurrLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("Closed...");
    }

    @Override
    public void run() {
        this.stateManager.changeState(StateManager.RUN_STATE);
        stateManager.getCurrLiftState().run();
    }

    @Override
    public void stop() {
        stateManager.changeState(StateManager.STOP_STATE);
        stateManager.getCurrLiftState().stop();
    }
}
