package lt.vu.wordcounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;
    private Spinner spinnerOptions;
    private Button buttonCount;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = findViewById(R.id.editTextInput);
        spinnerOptions = findViewById(R.id.spinnerOptions);
        buttonCount = findViewById(R.id.buttonCount);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.count_options,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(adapter);

        Counter counter = new Counter();

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = editTextInput.getText().toString();

                if (text.trim().isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            getString(R.string.empty_text_warning),
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                String selectedOption = spinnerOptions.getSelectedItem().toString();

                int result = 0;

                switch (selectedOption) {

                    case "Sentences":
                        result = counter.CountSentences(text);
                        break;

                    case "Words":
                        result = counter.CountWords(text);
                        break;

                    case "Chars":
                        result = counter.CountChars(text);
                        break;

                    case "Numbers":
                        result = counter.CountNumbers(text);
                        break;
                }

                textViewResult.setText("Result: " + result);
            }
        });
    }
}