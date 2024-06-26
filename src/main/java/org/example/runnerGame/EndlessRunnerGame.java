package org.example.runnerGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndlessRunnerGame extends Game{

    @Override
    public void initialize() {
        System.out.println("Endless game initializing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Endless runner starting...");
        playerWantsNewCharacter();
    }

    @Override
    public void endPlay() {
        System.out.println("Endless Runner Ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new Character to the game");
    }
    public boolean playerWantsNewCharacter(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to add ne Character to the game y/n ?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException e){
            System.out.println(e);
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }

}
