package sp.senac.br.apprespondermensagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecebeMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recebe_mensagem_layout);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = (TextView ) findViewById(R.id.lblRecebeMensagem);

        textView.setText("Bem vindo "+mensagem);


    }
}
