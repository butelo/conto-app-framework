package com.muaki.contoapp;



import com.muaki.framework.Screen;
import com.muaki.framework.impl.AndroidGame;



public class ContoAppActivity extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
    
}