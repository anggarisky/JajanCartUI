package com.example.anggarisky.jajancartui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView jajanTitle, jajanSubTitle, itemTitleOne, itemSubTitleOne,
    itemTitleTwo, itemSubTitleTwo, itemTitleThree, itemSubTitleThree,
            priceSubTitle, priceTitle, discountTitle, discountSubTitle;
    ;

    Button btnRemoveOne, btnRemoveTwo, btnRemoveThree, btnPay, btnCheckPromo;

    EditText inputPromo;

    LinearLayout linearLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface MLight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(),"fonts/MRegular.ttf");

        jajanTitle = (TextView) findViewById(R.id.jajanTitle);
        jajanSubTitle = (TextView) findViewById(R.id.jajanSubTitle);

        inputPromo = (EditText) findViewById(R.id.inputPromo);

        linearLayout3 = (LinearLayout) findViewById(R.id.linearLayout3);

        itemTitleOne = (TextView) findViewById(R.id.itemTitleOne);
        itemSubTitleOne = (TextView) findViewById(R.id.itemSubTitleOne);
        itemTitleTwo = (TextView) findViewById(R.id.itemTitleTwo);
        itemSubTitleTwo = (TextView) findViewById(R.id.itemSubTitleTwo);
        itemTitleThree = (TextView) findViewById(R.id.itemTitleThree);
        itemSubTitleThree = (TextView) findViewById(R.id.itemSubTitleThree);

        priceSubTitle = (TextView) findViewById(R.id.priceSubTitle);
        priceTitle = (TextView) findViewById(R.id.priceTitle);
        discountTitle = (TextView) findViewById(R.id.discountTitle);
        discountSubTitle = (TextView) findViewById(R.id.discountSubTitle);

        btnRemoveOne = (Button) findViewById(R.id.btnRemoveOne);
        btnRemoveTwo = (Button) findViewById(R.id.btnRemoveTwo);
        btnRemoveThree = (Button) findViewById(R.id.btnRemoveThree);

        btnPay = (Button) findViewById(R.id.btnPay);
        btnCheckPromo = (Button) findViewById(R.id.btnCheckPromo);


        jajanTitle.setTypeface(MRegular);
        jajanSubTitle.setTypeface(MLight);

        itemTitleOne.setTypeface(MRegular);
        itemSubTitleOne.setTypeface(MLight);

        itemTitleTwo.setTypeface(MRegular);
        itemSubTitleTwo.setTypeface(MLight);

        itemTitleThree.setTypeface(MRegular);
        itemSubTitleThree.setTypeface(MLight);

        priceTitle.setTypeface(MRegular);
        priceSubTitle.setTypeface(MLight);

        discountTitle.setTypeface(MRegular);
        discountSubTitle.setTypeface(MLight);

        btnRemoveOne.setTypeface(MLight);
        btnRemoveTwo.setTypeface(MLight);
        btnRemoveThree.setTypeface(MLight);

        btnCheckPromo.setTypeface(MLight);
        btnPay.setTypeface(MRegular);

        inputPromo.setTypeface(MRegular);

        btnCheckPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doCheckPromo();
            }
        });

    }

    public void doCheckPromo(){

        if(inputPromo.getText().toString().equals("GOGOANGGA")) {
            priceTitle.setText("IDR 20.000");
            discountTitle.setText("50%");
            linearLayout3.animate().alpha(0).translationY(-200).setDuration(800).setStartDelay(100).start();
            btnCheckPromo.animate().alpha(0).translationY(-200).setDuration(800).setStartDelay(100).start();
            btnPay.animate().translationY(-100).setDuration(800).setStartDelay(300).start();
        } else {
            Toast.makeText(getApplicationContext(), "Coupon is Wrong", Toast.LENGTH_SHORT).show();
        }


    }

}
