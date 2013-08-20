package com.muaki.contoapp;


import java.util.List;


import android.os.Handler;
import android.util.Log;

import com.muaki.framework.Game;
import com.muaki.framework.Graphics;
import com.muaki.framework.Input.TouchEvent;
import com.muaki.framework.Screen;

public class MainMenuScreen extends Screen {
	 Graphics g;
	 float seconds = 0;

//	 Handler hnd = new Handler();

	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
//		 Graphics g = game.getGraphics();

//        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
//        game.getInput().getKeyEvents();
//
//        int len = touchEvents.size();
//        for (int i = 0; i < len; i++) {
//            TouchEvent event = touchEvents.get(i);
//            if (event.type == TouchEvent.TOUCH_UP) {
//                if (event.x > 400 && event.y > 250) {
//         
//                    game.setScreen(new Pagina1Screen(game));
//                    return;
//                }
//            }
//        }
    
		
		
		
	}

	@Override
	public void present(float deltaTime) {

//		hnd.postDelayed(new Runnable(){
//
//			@Override
//			public void run() {
		
		seconds += deltaTime;
		Log.d("dispose",
                ""+seconds );
				  g = game.getGraphics();
//			        
			        g.drawPixmap(Assets.background, 0, 0);
			        
			        if (seconds > 6){
			        	game.setScreen(new Pagina1Screen(game));
			        }
			        
			        
//			}
//			
//		}, 2000);

//if (seconds < 6000){
//	game.setScreen(new Pagina1Screen(game));

//}
		
//        g.drawPixmap(Assets.buttons, 10, 250, 64, 64, 64, 64);
//        g.drawPixmap(Assets.buttons, 400, 250, 0, 64, 64, 64);

//        g.drawPixmap(Assets.logo, 32, 20);
//        g.drawPixmap(Assets.mainMenu, 64, 220);
//        if(Settings.soundEnabled)
//            g.drawPixmap(Assets.buttons, 0, 416, 0, 0, 64, 64);
//        else
//            g.drawPixmap(Assets.buttons, 0, 416, 64, 0, 64, 64);
    
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
		Log.d("dispose",
                "liberar recursos" );
//		g.clear(0);
//		Assets.background.dispose();

	}

}
