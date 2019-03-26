package sp.senac.br.apprespondermensagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "sp.senac.br.apprespondermensagem.MENSAGEM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enviarMensagem(View view) {
        Intent intent = new Intent(MainActivity.this, RecebeMensagemActivity.class);
        EditText editText = (EditText) findViewById(R.id.txtInsereNome);
        String mensagem = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensagem);
        startActivity(intent);
    }

}
