package Id.StripLampunk.Career_Informer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Muhammad Hatta on 06/05/2014.
 */
public class cjob extends Activity implements View.OnClickListener
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cjob);

        findViewById(R.id.buttonHome).setOnClickListener(this);

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

            default:break;
        }
    }
}