package com.example.tt2.rewards;

import static com.example.tt2.R.id.cardReward3;

import android.media.MediaPlayer;
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

public class Reward3 extends AppCompatActivity implements View.OnClickListener {

    ImageView ivRegresarRew3,
            ivRew3Esc1, ivRew3Esc2, ivRew3Esc3,
            ivRew3C1, ivRew3C2, ivRew3C3, ivRew3C4,
            ivRew3Esp1, ivRew3Esp2, ivRew3Esp3, ivRew3Esp4,
            ivReward3;
    MaterialCardView cardReward3;
    boolean EscLocked1 = false, EscLocked2 = false, EscLocked3 = false, EspLocked1 = false, EspLocked2 = false, EspLocked3 = false, EspLocked4 = false, CLocked1 = false, CLocked2 = false, CLocked3 = false, CLocked4 = false;
    private String NinSelec = "";
    private String EspSelect = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reward3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cardReward3 = findViewById(R.id.cardReward3);

        ivRegresarRew3 = findViewById(R.id.ivRegresarRew3);
        ivRew3Esc1 = findViewById(R.id.ivRew3Esc1);
        ivRew3Esc2 = findViewById(R.id.ivRew3Esc2);
        ivRew3Esc3 = findViewById(R.id.ivRew3Esc3);
        ivRew3C1 = findViewById(R.id.ivRew3C1);
        ivRew3C2 = findViewById(R.id.ivRew3C2);
        ivRew3C3 = findViewById(R.id.ivRew3C3);
        ivRew3C4 = findViewById(R.id.ivRew3C4);
        ivRew3Esp1 = findViewById(R.id.ivRew3Esp1);
        ivRew3Esp2 = findViewById(R.id.ivRew3Esp2);
        ivRew3Esp3 = findViewById(R.id.ivRew3Esp3);
        ivRew3Esp4 = findViewById(R.id.ivRew3Esp4);
        ivReward3 = findViewById(R.id.ivReward3);

        ivRegresarRew3.setOnClickListener(this);
        ivRew3Esc1.setOnClickListener(this);
        ivRew3Esc2.setOnClickListener(this);
        ivRew3Esc3.setOnClickListener(this);
        ivRew3C1.setOnClickListener(this);
        ivRew3C2.setOnClickListener(this);
        ivRew3C3.setOnClickListener(this);
        ivRew3C4.setOnClickListener(this);
        ivRew3Esp1.setOnClickListener(this);
        ivRew3Esp2.setOnClickListener(this);
        ivRew3Esp3.setOnClickListener(this);
        ivRew3Esp4.setOnClickListener(this);
    }

    private void PrimerEspada(){

        switch (NinSelec){

            case "reward3_ninja1":
                ivReward3.setImageResource(R.drawable.reward3_ninja1_esp1);
                break;
            case "reward3_ninja2":
                ivReward3.setImageResource(R.drawable.reward3_ninja2_esp1);
                break;
            case "reward3_ninja3":
                ivReward3.setImageResource(R.drawable.reward3_ninja3_esp1);
                break;
            case "reward3_ninja4":
                ivReward3.setImageResource(R.drawable.reward3_ninja4_esp1);
                break;
        }

    }

    private void SegundaEspada(){

        switch (NinSelec){

            case "reward3_ninja1":
                ivReward3.setImageResource(R.drawable.reward3_ninja1_esp2);
                break;
            case "reward3_ninja2":
                ivReward3.setImageResource(R.drawable.reward3_ninja2_esp2);
                break;
            case "reward3_ninja3":
                ivReward3.setImageResource(R.drawable.reward3_ninja3_esp2);
                break;
            case "reward3_ninja4":
                ivReward3.setImageResource(R.drawable.reward3_ninja4_esp2);
                break;
        }

    }

    private void TercerEspada(){

        switch (NinSelec){

            case "reward3_ninja1":
                ivReward3.setImageResource(R.drawable.reward3_ninja1_esp3);
                break;
            case "reward3_ninja2":
                ivReward3.setImageResource(R.drawable.reward3_ninja2_esp3);
                break;
            case "reward3_ninja3":
                ivReward3.setImageResource(R.drawable.reward3_ninja3_esp3);
                break;
            case "reward3_ninja4":
                ivReward3.setImageResource(R.drawable.reward3_ninja4_esp3);
                break;
        }

    }

    private void CuartaEspada(){

        switch (NinSelec){

            case "reward3_ninja1":
                ivReward3.setImageResource(R.drawable.reward3_ninja1_esp4);
                break;
            case "reward3_ninja2":
                ivReward3.setImageResource(R.drawable.reward3_ninja2_esp4);
                break;
            case "reward3_ninja3":
                ivReward3.setImageResource(R.drawable.reward3_ninja3_esp4);
                break;
            case "reward3_ninja4":
                ivReward3.setImageResource(R.drawable.reward3_ninja4_esp4);
                break;
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivRegresarRew3) {
            finish();
        }
        else if (v.getId() == R.id.ivRew3Esc1) {
            if (EscLocked1) {
                cardReward3.setBackgroundResource(R.drawable.reward3_esc1_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked1 = true;
                    ivRew3Esc1.setImageResource(R.drawable.reward3_esc1_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew3Esc2) {
            if (EscLocked2) {
                cardReward3.setBackgroundResource(R.drawable.reward3_esc2_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked2 = true;
                    ivRew3Esc2.setImageResource(R.drawable.reward3_esc2_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew3Esc3) {
            if (EscLocked3) {
                cardReward3.setBackgroundResource(R.drawable.reward3_esc3_unlocked);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Escenario bloqueado");
                builder.setMessage("Este escenario cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EscLocked3 = true;
                    ivRew3Esc3.setImageResource(R.drawable.reward3_esc3_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
        else if (v.getId() == R.id.ivRew3C1) {
            if (CLocked1) {
                NinSelec = "reward3_ninja1";
                ivReward3.setImageResource(R.drawable.reward3_ninja1);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de traje bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked1 = true;
                    ivRew3C1.setImageResource(R.drawable.reward3_c1_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3C2) {
            if (CLocked2) {
                NinSelec = "reward3_ninja2";
                ivReward3.setImageResource(R.drawable.reward3_ninja2);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de traje bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked2 = true;
                    ivRew3C2.setImageResource(R.drawable.reward3_c2_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3C3) {
            if (CLocked3) {
                NinSelec = "reward3_ninja3";
                ivReward3.setImageResource(R.drawable.reward3_ninja3);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de traje bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked3 = true;
                    ivRew3C3.setImageResource(R.drawable.reward3_c3_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3C4) {
            if (CLocked4) {
                NinSelec = "reward3_ninja4";
                ivReward3.setImageResource(R.drawable.reward3_ninja4);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Color de traje bloqueado");
                builder.setMessage("Este color de traje cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    CLocked4 = true;
                    ivRew3C4.setImageResource(R.drawable.reward3_c4_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3Esp1) {
            if (EspLocked1) {
                PrimerEspada();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Espada bloqueada");
                builder.setMessage("Esta espada cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EspLocked1 = true;
                    ivRew3Esp1.setImageResource(R.drawable.reward3_esp1_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3Esp2) {
            if (EspLocked2) {
                SegundaEspada();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Espada bloqueada");
                builder.setMessage("Esta espada cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EspLocked2 = true;
                    ivRew3Esp2.setImageResource(R.drawable.reward3_esp2_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3Esp3) {
            if (EspLocked3) {
                TercerEspada();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Espada bloqueada");
                builder.setMessage("Esta espada cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EspLocked3 = true;
                    ivRew3Esp3.setImageResource(R.drawable.reward3_esp3_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        } else if (v.getId() == R.id.ivRew3Esp4) {
            if (EspLocked4) {
                CuartaEspada();
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Espada bloqueada");
                builder.setMessage("Esta espada cuesta 10 monedas");

                builder.setPositiveButton("Sí", (dialog, which) -> {
                    EspLocked4 = true;
                    ivRew3Esp4.setImageResource(R.drawable.reward3_esp4_unlocked);
                });

                builder.setNegativeButton("No", (dialog, which) -> {
                    dialog.dismiss();
                });

                builder.show();
            }
        }
    }
}