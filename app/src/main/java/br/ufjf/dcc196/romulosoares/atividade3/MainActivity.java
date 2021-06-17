package br.ufjf.dcc196.romulosoares.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Define as variaveis dos elementos em tela
    private EditText editTextValor1;
    private EditText editTextValor2;
    private TextView textViewResultadoFinal;
    private Button buttonSomar;
    private Button buttonSubtrair;
    private Button buttonMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Busca os ids dos elementos em tela
        editTextValor1 = findViewById(R.id.editTextValor1);
        editTextValor2 = findViewById(R.id.editTextValor2);
        textViewResultadoFinal = findViewById(R.id.textViewResultadoFinal);
        buttonSomar = findViewById(R.id.buttonSomar);
        buttonSubtrair = findViewById(R.id.buttonSubtrair);
        buttonMultiplicar = findViewById(R.id.buttonMultiplicar);

        //Quando o botão for clicado ele chama a função de somar
        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somar(v);
            }
        });

        //Quando o botão for clicado ele chama a função de subtrair
        buttonSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtrair(v);
            }
        });

        //Quando o botão for clicado ele chama a função de multiplicar
        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicar(v);
            }
        });

    }

    //Função para somar
    public void somar(View view){
        //Define as variaveis para armazenar os valores passados
        double valor1 = 0.0;
        double valor2 = 0.0;
        double valorTotal;

        //Valida caso o dado inserido editText seja nulo
        try{
            valor1 = Double.parseDouble(editTextValor1.getText().toString());
            valor2 = Double.parseDouble(editTextValor2.getText().toString());
        } catch (Exception ignored) {}

        //Executa a soma dos valores
        valorTotal = valor1 + valor2;

        //Passa o valor obtido para a tela
        textViewResultadoFinal.setText(Double.toString(valorTotal));
    }

    //Função para subtrair
    public void subtrair(View view){
        //Define as variaveis para armazenar os valores passados
        double valor1 = 0.0;
        double valor2 = 0.0;
        double valorTotal;

        //Valida caso o dado inserido editText seja nulo
        try{
            valor1 = Double.parseDouble(editTextValor1.getText().toString());
            valor2 = Double.parseDouble(editTextValor2.getText().toString());
        } catch (Exception ignored) {}

        //Executa a subtração dos valores
        valorTotal = valor1 - valor2;

        //Passa o valor obtido para a tela
        textViewResultadoFinal.setText(Double.toString(valorTotal));
    }

    //Função para subtrair
    public void multiplicar(View view){
        //Define as variaveis para armazenar os valores passados
        double valor1 = 0.0;
        double valor2 = 0.0;
        double valorTotal;

        //Valida caso o dado inserido editText seja nulo
        try{
            valor1 = Double.parseDouble(editTextValor1.getText().toString());
            valor2 = Double.parseDouble(editTextValor2.getText().toString());
        } catch (Exception ignored) {}

        //Executa a multiplicação dos valores
        valorTotal = valor1 * valor2;

        //Passa o valor obtido para a tela
        textViewResultadoFinal.setText(Double.toString(valorTotal));
    }
}