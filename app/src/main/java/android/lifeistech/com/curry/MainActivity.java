package android.lifeistech.com.curry;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String name;
    String[] people = {"まさご", "けんた", "Gotty", "ごてぃお"};
    String[] food = {"かれー", "みそしる", "ちゃーはん", "えびちり"};
    TextView nameTextView;
    TextView foodTextView;
    TextView verbTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView)findViewById(R.id.nameTextView);
        foodTextView = (TextView)findViewById(R.id.foodTextView);
        verbTextView = (TextView)findViewById(R.id.verbTextView);
    }

    public void serveFood(View v) {

        Random randomName = new Random();
        nameTextView.setText(people[randomName.nextInt(4)] + "に");

        Random randomFood = new Random();
        foodTextView.setText(food[randomFood.nextInt(4)] + "を");

        Random random = new Random();
        if(random.nextInt(100) < 50) {
            verbTextView.setText("よそえました！");
        } else {
            verbTextView.setText("どんまい");
        }

    }

}
