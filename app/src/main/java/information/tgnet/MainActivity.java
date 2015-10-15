package information.tgnet;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import information.tgnet.com.ndkdemo.R;

/**
 * Created by zhonghanwen on 2015/10/15.
 */
public class MainActivity extends Activity {

    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvResult = (TextView) findViewById(R.id.textView1);
        mTvResult.setText("2*2=" + MathKit.square(2));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTvResult.setText("2.5+2.5=" + addResult(2.5));
            }
        },5000);
    }

    public static native double addResult(double num);


    static {
        System.loadLibrary("JniDemo");
    }
}
