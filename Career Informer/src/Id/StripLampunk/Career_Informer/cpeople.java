package Id.StripLampunk.Career_Informer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Muhammad Hatta on 06/05/2014.
 */
public class cpeople extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpeople);

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