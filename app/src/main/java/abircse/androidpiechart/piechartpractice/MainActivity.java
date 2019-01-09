package abircse.androidpiechart.piechartpractice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.razerdp.widget.animatedpieview.AnimatedPieView;
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import com.razerdp.widget.animatedpieview.data.SimplePieInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawPie();
    }

    private void drawPie() {


        AnimatedPieView mAnimatedPieView = findViewById(R.id.animatedpie);
        AnimatedPieViewConfig config = new AnimatedPieViewConfig();
        config.startAngle(-90)// Starting angle offset
                .addData(new SimplePieInfo(30, Color.parseColor("#00aaee"), "Medical"))
                .addData(new SimplePieInfo(18.0f, Color.parseColor("#000000"), "Health"))
                .drawText(true).textSize(50)
                .canTouch(true)
                .duration(2000);

        mAnimatedPieView.applyConfig(config);
        mAnimatedPieView.start();

    }
}
