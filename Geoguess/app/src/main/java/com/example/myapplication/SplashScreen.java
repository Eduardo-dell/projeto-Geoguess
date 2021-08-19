package com.example.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.R;

public class SplashScreen extends Activity{
	private final int splashTime = 3000;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_splash);
    new Handler().postDelayed(new Runnable() {
                    /*
                     * Exibindo splash com um timer.
                     */
                    @Override
                    public void run() {
                           // Esse método será executado sempre que o timer acabar
                           // E inicia a activity principal
                           Intent i = new Intent(SplashScreen.this, 
                           MainActivity.class);
                           startActivity(i);
 
                           // Fecha esta activity
                           finish();
                    }
             }, this.splashTime);
             
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	public void mostrarLogin() { 
  Intent intent = new Intent(SplashScreen.this, MainActivity.class); 
  startActivity(intent); 
  finish();
 }
}
