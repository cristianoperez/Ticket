package com.example.ticket;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.ticket.MESSAGE";

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 GridView gridview = (GridView) findViewById(R.id.gridView1);
		 gridview.setAdapter(new ImageAdapter(this));

		 gridview.setOnItemClickListener(new OnItemClickListener() {
			 public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				 Toast.makeText(MainActivity.this, "aa", Toast.LENGTH_SHORT).show();
			 }
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@SuppressLint("NewApi")
	public void consultarSaldo(View view){
		
		StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
		TextView mText = (TextView) findViewById(R.id.textView1);
		EditText mEdit = (EditText) findViewById(R.id.editText1);
		
		try {
			HttpClient client = new DefaultHttpClient();
			HttpGet get = new HttpGet("http://www.ticket.com.br/ticket-corporativo-web/ticket-consultcard?chkProduto=TR&txtNumeroCartao=" + mEdit.getText().toString() + "&txtOperacao=saldo_agendamentos&cardNumber=");
			
	        ResponseHandler<String> responseHandler = new BasicResponseHandler();
			String response = client.execute(get, responseHandler);
			Gson gson = new Gson();
			Ticket t = gson.fromJson(response, Ticket.class);
			
			if(t.getSeeBalance() == null){
				mText.setText("Cartão invalido.");
			} else {
				mText.setText("R$ " + t.getSeeBalance());
			}
			
		} catch (Exception e) {
			mText.setText("Ocorreu um erro, tente novamente.");
		}
	}

}
