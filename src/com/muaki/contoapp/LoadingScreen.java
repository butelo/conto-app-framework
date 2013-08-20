package com.muaki.contoapp;



import com.muaki.framework.Game;
import com.muaki.framework.Graphics;
import com.muaki.framework.Graphics.PixmapFormat;
import com.muaki.framework.Screen;

public class LoadingScreen extends Screen {

	public LoadingScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphicsSD();
		
//        Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
//        Assets.background = g.newPixmap("1aPe.jpg", PixmapFormat.RGB565);
		
		
//        fileName = "muakibooks/contodavaca/landscape/tituloconto.png";
		

        
		Assets.background = g.newPixmap("muakibooks/contodavaca/landscape/splash.png", PixmapFormat.RGB565);
		
        Assets.mainMenu = g.newPixmap("muakibooks/contodavaca/landscape/mainmenu.png", PixmapFormat.RGB565);

        Assets.buttons = g.newPixmap("muakibooks/contodavaca/landscape/tituloconto.png", PixmapFormat.ARGB4444);

        
        Assets.pantallasd = g.newPixmap("muakibooks/contodavaca/landscape/tituloconto.png", PixmapFormat.ARGB4444);
        

		
	       Settings.load(game.getFileIO());
	        game.setScreen(new MainMenuScreen(game));

	}

	@Override
	public void present(float deltaTime) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

}
