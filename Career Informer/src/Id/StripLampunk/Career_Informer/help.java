package Id.StripLampunk.Career_Informer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Muhammad Hatta on 06/05/2014.
 */
public class help extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        findViewById(R.id.linierLayout1).setOnClickListener(this);
        findViewById(R.id.linierLayout2).setOnClickListener(this);
        findViewById(R.id.linierLayout3).setOnClickListener(this);
        findViewById(R.id.linierLayout4).setOnClickListener(this);
        findViewById(R.id.linierLayout5).setOnClickListener(this);
        findViewById(R.id.buttonHome).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

    }
}
