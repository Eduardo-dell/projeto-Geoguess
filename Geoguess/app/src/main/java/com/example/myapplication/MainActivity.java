package com.example.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Window;
import android.view.WindowManager;
import com.example.myapplication.R;


public class MainActivity extends Activity {
    
    Button btnIniciar;
    
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
    Toast.makeText(MainActivity.this,"fodasiim", Toast.LENGTH_LONG).show();
//inicio
    
    
   //fim
	}
  
  public void funcaoParar(View view){
    Intent intent = new Intent(MainActivity.this,ActivityCreditos.class);
    startActivity(intent);
  }
    
}
