package com.example.myapplication;

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
import com.example.myapplication.R;


public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
TextView txt = (TextView) findViewById(R.id.texto);  
Typeface font = Typeface.createFromAsset(getAssets(), "orange-juice.ttf");  
txt.setTypeface(font);
  }
 
  public void funcao(View view){
    Toast.makeText(MainActivity.this,"fodasiim", Toast.LENGTH_LONG).show();
//inicio
    

   //fim
	}
  
  public void funcaoParar(View view){
    Intent intent = new Intent(MainActivity.this,ProximaActivity.class);
    startActivity(intent);
  }
    
}
