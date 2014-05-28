package Id.StripLampunk.Career_Informer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity implements View.OnClickListener
{
    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.main);

        findViewById(R.id.buttonJob).setOnClickListener(this);
        findViewById(R.id.buttonCJob).setOnClickListener(this);
        findViewById(R.id.buttonPeople).setOnClickListener(this);
        findViewById(R.id.buttonCPeople).setOnClickListener(this);
        findViewById(R.id.buttonArticel).setOnClickListener(this);
        findViewById(R.id.buttonHelp).setOnClickListener(this);
        findViewById(R.id.buttonHome).setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonJob :
                Intent i = new Intent(this, job.class );
                startActivity(i);
                break;

            case R.id.buttonCJob :
                Intent j = new Intent(this, cjob.class );
                startActivity(j);
                break;

            case R.id.buttonPeople :
                Intent k = new Intent(this, people.class );
                startActivity(k);
                break;

            case R.id.buttonCPeople :
                Intent l = new Intent(this, cpeople.class );
                startActivity(l);
                break;

            case R.id.buttonArticel :
                Intent m = new Intent(this, articel.class );
                startActivity(m);
                break;

            case R.id.buttonHelp :
                Intent n = new Intent(this, help.class );
                startActivity(n);
                break;

            case R.id.buttonHome :
                Intent o = new Intent(this, MyActivity.class );
                startActivity(o);
                break;

            default:break;
        }
    }
}