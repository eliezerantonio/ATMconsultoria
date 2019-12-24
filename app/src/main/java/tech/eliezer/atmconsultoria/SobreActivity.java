package tech.eliezer.atmconsultoria;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_sobre);

        String descricao = "A ATM Consultoria tem como missão apoiar as organizações que desejam alcançar o sucesso através da excelência em gestão e da busca pela Qualidade.\n\n" +
                "Nosso trabalho é dar suporte às empresas que desejam se certificar em padrões de qualidade ou investir no desenvolvimento e evolução de sua gestão, por meio da otimização dos processos e da disseminação dos Fundamentos e Critérios de Excelência.";
        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription( descricao )
                .addGroup("Fale conosco")
                .addEmail("atmconsultoria@gmail.com", "Envie um e-mail")
                .addWebsite("http://google.com.br/", "Acess nosso site")
                .addGroup("Acesse nossas redes sociais")
                .addFacebook("google", "Facebook" )
                .addTwitter("google", "Twitter")
                .addYoutube("google", "Youtube")
                .addPlayStore("com.google.android.apps.plus", "Play Store")
                .addGitHub("google", "Github")
                .addInstagram("google", "Instagram")
                .create();

        setContentView(sobre);
    }
}
