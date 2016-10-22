package book.chapter03.eventbinding;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/*
ֱ�Ӱ󶨵���ǩ

�����¼���������ֵ��void������boolean
*/


public class MainActivity extends Activity {

	private Button myBtn;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myBtn=(Button) this.findViewById(R.id.myBtn);
		myBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "�������еĴ�����", Toast.LENGTH_SHORT).show();
				
			}
			
		});
		
	}

	/*public void clickEventHandler(View source){
		Toast.makeText(this, "�Զ����¼�������", Toast.LENGTH_SHORT).show();
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
