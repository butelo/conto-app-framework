package com.muaki.contoapp;


import java.util.List;


import com.muaki.framework.Game;
import com.muaki.framework.Graphics;
import com.muaki.framework.Input.TouchEvent;
import com.muaki.framework.Screen;

public class Pagina1Screen extends Screen {

	public Pagina1Screen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float deltaTime) {
//		 Graphics g = game.getGraphics();

        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();

        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if (event.type == TouchEvent.TOUCH_UP) {
                if (event.x < 64 && event.y > 250) {
         
                    game.setScreen(new MainMenuScreen(game));
                    return;
                }
            }
        }
    
		
		
		
	}

	@Override
	public void present(float deltaTime) {

        Graphics g = game.getGraphics();
        
        g.drawPixmap(Assets.mainMenu, 0, 0);
        g.drawPixmap(Assets.buttons, 10, 250, 64, 64, 64, 64);
        g.drawPixmap(Assets.buttons, 400, 250, 0, 64, 64, 64);

//        g.drawPixmap(Assets.logo, 32, 20);
//        g.drawPixmap(Assets.mainMenu, 64, 220);
//        if(Settings.soundEnabled)
//            g.drawPixmap(Assets.buttons, 0, 416, 0, 0, 64, 64);
//        else
//            g.drawPixmap(Assets.buttons, 0, 416, 64, 0, 64, 64);
    
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
