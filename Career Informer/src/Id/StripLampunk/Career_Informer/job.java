package Id.StripLampunk.Career_Informer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Muhammad Hatta on 06/05/2014.
 */
public class job extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job);

        findViewById(R.id.buttonHome).setOnClickListener(this);
        findViewById(R.id.linearLayout).setOnClickListener(this);
        findViewById(R.id.linierLayout2).setOnClickListener(this);
        findViewById(R.id.linierLayout3).setOnClickListener(this);
        findViewById(R.id.linierLayout4).setOnClickListener(this);
        findViewById(R.id.linierLayout5).setOnClickListener(this);
        findViewById(R.id.linierLayout6).setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonHome:
                Intent i = new Intent(this, MyActivity.class);
                startActivity(i);
                break;

            case R.id.linearLayout:
                Intent j = new Intent(this, jobdetail.class);
                startActivity(j);
                break;

            case  R.id.linierLayout2:
                Intent k = new Intent(this, jobdetail2.class);
                startActivity(k);
                break;

            case  R.id.linierLayout3:
                Intent l = new Intent(this, jobdetail.class);
                startActivity(l);
                break;

            case  R.id.linierLayout4:
                Intent m = new Intent(this, jobdetail.class);
                startActivity(m);
                break;

            case  R.id.linierLayout5:
                Intent n = new Intent(this, jobdetail.class);
                startActivity(n);
                break;

            case  R.id.linierLayout6:
                Intent o = new Intent(this, jobdetail.class);
                startActivity(o);
                break;

            default:break;
        }
    }
}
