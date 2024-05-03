package org.example;

import org.example.runnerGame.EndlessRunnerGame;
import org.example.runnerGame.FootballGame;
import org.example.runnerGame.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Game game = new FootballGame();
        game.play();
        System.out.println("==============");
        game = new EndlessRunnerGame();
        game.play();



    }
}