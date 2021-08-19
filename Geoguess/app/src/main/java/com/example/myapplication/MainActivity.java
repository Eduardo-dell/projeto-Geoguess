package com.example.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication.R;


public class MainActivity extends Activity {
    
    private Button btnIniciar;
    private Intent intent;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
requestWindowFeature(Window.FEATURE_NO_TITLE);
setContentView(R.layout.activity_main);
Typeface font = Typeface.createFromAsset(getAssets(), "orange-juice.ttf");  
Typeface fontTeko = Typeface.createFromAsset(getAssets(), "Teko-Light.ttf");
TextView txt = (TextView) findViewById(R.id.texto);  
btnIniciar = (Button) findViewById(R.id.botaoIniciar);
btnIniciar.setTypeface(fontTeko);

Button btnParar = (Button) findViewById(R.id.botaoParar);
btnParar.setTypeface(fontTeko);

txt.setTypeface(font);

getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
WindowManager.LayoutParams.FLAG_FULLSCREEN);
  }
 
 
 
 
 
  public void funcao(View view){
    Toast.makeText(MainActivity.this,"Digite o pais ou cidade acima e clique no botão 'Adivinhei!' quando souber.", Toast.LENGTH_LONG).show();
//inicio
    
    intent = new Intent(MainActivity.this,ActivityMaps.class);
    startActivity(intent);
   //fim
	}
  
  public void funcaoParar(View view){
    intent = new Intent(MainActivity.this,ActivityCreditos.class);
    startActivity(intent);
  }
    
}
