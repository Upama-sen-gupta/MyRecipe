package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgReciepe;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgReciepe=findViewById(R.id.img_recipe);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        //receive data
        String getRecipe=getIntent().getExtras().getString("recipe");

        if(getRecipe.equals("burger"))
        {
            imgReciepe.setImageResource(R.drawable.falafel_burgers);
            txtName.setText("Falafel burger");
            txtDescription.setText(R.string.recipe1);

        }

        else if(getRecipe.equals("biriyani"))
        {
            imgReciepe.setImageResource(R.drawable.chicken_biriyani);
            txtName.setText("Chicken Biriyani");
            txtDescription.setText(R.string.recipe2);

        }

        else if(getRecipe.equals("cake"))
        {
            imgReciepe.setImageResource(R.drawable.cake);
            txtName.setText("Chocklate Cake");
            txtDescription.setText(R.string.recipe3);

        }

        else if(getRecipe.equals("pizza"))
        {
            imgReciepe.setImageResource(R.drawable.pizza);
            txtName.setText("Mexican Pizza");
            txtDescription.setText(R.string.recipe4);

        }




    }
}