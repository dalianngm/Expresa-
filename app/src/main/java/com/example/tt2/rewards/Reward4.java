package com.example.tt2.rewards;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tt2.R;
import com.google.android.material.card.MaterialCardView;

public class Reward4 extends AppCompatActivity implements View.OnClickListener {
    ImageView ivRegresarRew4,
            ivRew4Esc1, ivRew4Esc2, ivRew4Esc3, ivRew4Esc4,
            ivReward4,
            ivRew4C1, ivRew4C2, ivRew4C3, ivRew4C4,
            ivRew4Rp1, ivRew4Rp2, ivRew4Rp3, ivRew4Rp4
    ;
    MaterialCardView cardReward4;

    boolean EscLocked1 = false, EscLocked2 = false, EscLocked3 = false, EscLocked4 = false,
            RLocked1 = false, RLocked2 = false, RLocked3 = false, RLocked4 = false,
            CLocked1 = false, CLocked2 = false, CLocked3 = false, CLocked4 = false;
    private String HadaSelec = "";
    private String RSelec = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reward4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cardReward4 = findViewById(R.id.cardReward4);

        ivRegresarRew4 = findViewById(R.id.ivRegresarRew4);

        ivRew4Esc1 = findViewById(R.id.ivRew4Esc1);
        ivRew4Esc2 = findViewById(R.id.ivRew4Esc2);
        ivRew4Esc3 = findViewById(R.id.ivRew4Esc3);
        ivRew4Esc4 = findViewById(R.id.ivRew4Esc4);

        ivReward4 = findViewById(R.id.ivReward4);

        ivRew4C1 = findViewById(R.id.ivRew4C1);
        ivRew4C2 = findViewById(R.id.ivRew4C2);
        ivRew4C3 = findViewById(R.id.ivRew4C3);
        ivRew4C4 = findViewById(R.id.ivRew4C4);

        ivRew4Rp1 = findViewById(R.id.ivRew4Rp1);
        ivRew4Rp2 = findViewById(R.id.ivRew4Rp2);
        ivRew4Rp3 = findViewById(R.id.ivRew4Rp3);
        ivRew4Rp4 = findViewById(R.id.ivRew4Rp4);

        ivRegresarRew4.setOnClickListener(this);

        ivRew4Esc1.setOnClickListener(this);
        ivRew4Esc2.setOnClickListener(this);
        ivRew4Esc3.setOnClickListener(this);
        ivRew4Esc4.setOnClickListener(this);

        ivRew4C1.setOnClickListener(this);
        ivRew4C2.setOnClickListener(this);
        ivRew4C3.setOnClickListener(this);
        ivRew4C4.setOnClickListener(this);

        ivRew4Rp1.setOnClickListener(this);
        ivRew4Rp2.setOnClickListener(this);
        ivRew4Rp3.setOnClickListener(this);
        ivRew4Rp4.setOnClickListener(this);
    }

    private void Vestido1(){

        switch (HadaSelec){

            case "reward4_hada1":
                ivReward4.setImageResource(R.drawable.reward4_hada1_r1);
                break;
            case "reward4_hada2":
                ivReward4.setImageResource(R.drawable.reward4_hada2_r1);
                break;
            case "reward4_hada3":
                ivReward4.setImageResource(R.drawable.reward4_hada3_r1);
                break;
            case "reward4_hada4":
                ivReward4.setImageResource(R.drawable.reward4_hada4_r1);
                break;
        }

    }

    private void Vestido2(){

        switch (HadaSelec){

            case "reward4_hada1":
                ivReward4.setImageResource(R.drawable.reward4_hada1_r2);
                break;
            case "reward4_hada2":
                ivReward4.setImageResource(R.drawable.reward4_hada2_r2);
                break;
            case "reward4_hada3":
                ivReward4.setImageResource(R.drawable.reward4_hada3_r2);
                break;
            case "reward4_hada4":
                ivReward4.setImageResource(R.drawable.reward4_hada4_r2);
                break;
        }

    }

    private void Vestido3(){

        switch (HadaSelec){

            case "reward4_hada1":
                ivReward4.setImageResource(R.drawable.reward4_hada1_r3);
                break;
            case "reward4_hada2":
                ivReward4.setImageResource(R.drawable.reward4_hada2_r3);
                break;
            case "reward4_hada3":
                ivReward4.setImageResource(R.drawable.reward4_hada3_r3);
                break;
            case "reward4_hada4":
                ivReward4.setImageResource(R.drawable.reward4_hada4_r3);
                break;
        }

    }

    private void Vestido4(){

        switch (HadaSelec){

            case "reward4_hada1":
                ivReward4.setImageResource(R.drawable.reward4_hada1_r4);
                break;
            case "reward4_hada2":
                ivReward4.setImageResource(R.drawable.reward4_hada2_r4);
                break;
            case "reward4_hada3":
                ivReward4.setImageResource(R.drawable.reward4_hada3_r4);
                break;
            case "reward4_hada4":
                ivReward4.setImageResource(R.drawable.reward4_hada4_r4);
                break;
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivRegresarRew4) {
            finish();
        }
        else if (v.getId() == R.id.ivRew4Esc1) {
            if (EscLocked1) {
                cardReward4.setBackgroundResource(R.drawable.reward4_esc1_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked1 = true;
                    ivRew4Esc1.setImageResource(R.drawable.reward4_esc1_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Esc2) {
            if (EscLocked2) {
                cardReward4.setBackgroundResource(R.drawable.reward4_esc2_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked2 = true;
                    ivRew4Esc2.setImageResource(R.drawable.reward4_esc2_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Esc3) {
            if (EscLocked3) {
                cardReward4.setBackgroundResource(R.drawable.reward4_esc3_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked3 = true;
                    ivRew4Esc3.setImageResource(R.drawable.reward4_esc3_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Esc4) {
            if (EscLocked4) {
                cardReward4.setBackgroundResource(R.drawable.reward4_esc4_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked4 = true;
                    ivRew4Esc4.setImageResource(R.drawable.reward4_esc4_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4C1) {
            if (CLocked1) {
                HadaSelec = "reward4_hada1";
                ivReward4.setImageResource(R.drawable.reward4_hada1);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de cabelloo bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked1 = true;
                    ivRew4C1.setImageResource(R.drawable.reward4_c1_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4C2) {
            if (CLocked2) {
                HadaSelec = "reward4_hada2";
                ivReward4.setImageResource(R.drawable.reward4_hada2);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de cabello bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked2 = true;
                    ivRew4C2.setImageResource(R.drawable.reward4_c2_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4C3) {
            if (CLocked3) {
                HadaSelec = "reward4_hada3";
                ivReward4.setImageResource(R.drawable.reward4_hada3);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de cabello bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked3 = true;
                    ivRew4C3.setImageResource(R.drawable.reward4_c3_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4C4) {
            if (CLocked4) {
                HadaSelec = "reward4_hada4";
                ivReward4.setImageResource(R.drawable.reward4_hada4);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de cabello bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked4 = true;
                    ivRew4C4.setImageResource(R.drawable.reward4_c4_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Rp1) {
            if (RLocked1) {
                Vestido1();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Conjunto bloqueado");
                builder.setMessage("Este conjunto cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    RLocked1 = true;
                    ivRew4Rp1.setImageResource(R.drawable.reward4_r1_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Rp2) {
            if (RLocked2) {
                Vestido2();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Conjunto bloqueado");
                builder.setMessage("Este conjunto cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    RLocked2 = true;
                    ivRew4Rp2.setImageResource(R.drawable.reward4_r2_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Rp3) {
            if (RLocked3) {
                Vestido3();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Conjunto bloqueado");
                builder.setMessage("Este conjunto cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    RLocked3 = true;
                    ivRew4Rp3.setImageResource(R.drawable.reward4_r3_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew4Rp4) {
            if (RLocked4) {
                Vestido4();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Conjunto bloqueado");
                builder.setMessage("Este conjunto cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    RLocked4 = true;
                    ivRew4Rp4.setImageResource(R.drawable.reward4_r4_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
    }
}