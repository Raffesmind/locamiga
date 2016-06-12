package locamiga.com.br.locamiga;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Splash();
    }


    public void Splash(){
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {


            @Override
            public void run() {
                i++;
                try {
                    while(i == 1 || i <= 3 ){
                        Thread.sleep(100);
                        i++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(i == 4){
                    Intent intent = new Intent(MainActivity.this, login.class);
                    startActivity(intent);
                    i++;
                }
            }
        }).start();

    }
}
