package org.example.runnerGame;

public class FootballGame extends Game{
    @Override
    public void initialize() {
        System.out.println("Football game initializing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Football runner starting...");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Runner Ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {

    }
}
