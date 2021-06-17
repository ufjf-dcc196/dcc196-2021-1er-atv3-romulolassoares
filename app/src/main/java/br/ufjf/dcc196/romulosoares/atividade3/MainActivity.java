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
    private Button buttonDividir;

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
        buttonDividir = findViewById(R.id.buttonDividir);

        //Ouvinte para os botões
        View.OnClickListener ouvinteButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonSomar:
                        somar(v);
                        break;
                    case R.id.buttonSubtrair:
                        subtrair(v);
                        break;
                    case R.id.buttonMultiplicar:
                        multiplicar(v);
                        break;
                    case R.id.buttonDividir:
                        dividir(v);
                        break;
                    default:
                }
            }
        };

        //Quando o botão for clicado ele chama a função de somar
        buttonSomar.setOnClickListener(ouvinteButton);

        //Quando o botão for clicado ele chama a função de subtrair
        buttonSubtrair.setOnClickListener(ouvinteButton);

        //Quando o botão for clicado ele chama a função de multiplicar
        buttonMultiplicar.setOnClickListener(ouvinteButton);

        //Quando o botão for clicado ele chama a função de dividir
        buttonDividir.setOnClickListener(ouvinteButton);

    }

    //Função para somar
    public void somar(View view){
        //Define as variáveis para armazenar os valores passados
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
        //Define as variáveis para armazenar os valores passados
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

    //Função para multiplicar
    public void multiplicar(View view){
        //Define as variáveis para armazenar os valores passados
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

    //Função para dividir
    public void dividir(View view){
        //Define as variáveis para armazenar os valores passados
        double valor1 = 0.0;
        double valor2 = 0.0;
        double valorTotal;

        //Valida caso o dado inserido editText seja nulo
        try{
            valor1 = Double.parseDouble(editTextValor1.getText().toString());
            valor2 = Double.parseDouble(editTextValor2.getText().toString());
        } catch (Exception ignored) {}

        if(valor2 != 0){//Se o valor2 for diferente de 0, faz a divisão
            //Executa a divisão dos valores
            valorTotal = valor1 / valor2;
            //Passa o valor obtido para a tela
            textViewResultadoFinal.setText(Double.toString(valorTotal));
        } else{//Se for diferente de 0, informa ao usuário
            textViewResultadoFinal.setText("Insira um valor diferente de 0 para o segundo valor");
        }
    }
}