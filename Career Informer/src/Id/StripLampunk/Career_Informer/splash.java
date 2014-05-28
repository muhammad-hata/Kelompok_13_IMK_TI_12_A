package Id.StripLampunk.Career_Informer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/**
 * Created by Muhammad Hatta on 06/05/2014.
 */
public class splash extends Activity{
    protected boolean _active = true;
    protected int _splashTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        StartAnimations();//Menjalankan Method Start Animasi

        Thread splashThread = new Thread() {
            //Timer Splash
            public void run() {
                try{
                    int waited = 0;
                    while(_active && (waited < _splashTime)) {
                        sleep(100);
                        if(_active) {
                            waited += 100;
                        }
                    }
                } catch(InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                    Intent newIntent=new Intent(splash.this, MyActivity.class);//pindah Activity Main
                    startActivityForResult(newIntent,0);
                }
            }
        };
        splashThread.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            _active=false;
        }
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.splash, menu);
        return true;
    }


    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        FrameLayout l=(FrameLayout) findViewById(R.id.FrameLayout1);
        l.clearAnimation();
        l.startAnimation(anim);

        //Animasi untuk ProgressBar1 mengunakan alpha.xml
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim1.reset();
        ProgressBar l1=(ProgressBar) findViewById(R.id.progressBar1);
        l1.clearAnimation();
        l1.startAnimation(anim);
    }
}
