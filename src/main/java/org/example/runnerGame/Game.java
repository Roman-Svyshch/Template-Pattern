package org.example.runnerGame;

public abstract class Game {
    public void initialize(){}
    public void startPlay(){}
    public void endPlay(){}
    public final void play(){
        loadAssets();
        initialize();
        startPlay();
        if (addNewGameCharacter()){
            addNewCharacterToTheGame();
        }
        endPlay();
    }

    protected abstract void addNewCharacterToTheGame();


    void loadAssets(){
        System.out.println("Load game assets");
    }
    boolean addNewGameCharacter(){
        return true;
    }
}
