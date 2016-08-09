package pracc04.metropolitan.fit.rs.pracc04_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button dialogFragmentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onOpenDialogListener();
    }

    private void onOpenDialogListener() {
        dialogFragmentButton = (Button) findViewById(R.id.dialogFragmentButton);

        dialogFragmentButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CustomDialogFragment fraggy = new CustomDialogFragment();
                        fraggy.show(getFragmentManager(), "dialog");
                        Toast.makeText(MainActivity.this, "otvoren dialog", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
