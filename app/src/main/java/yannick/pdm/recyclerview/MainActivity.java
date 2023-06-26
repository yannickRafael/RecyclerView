package yannick.pdm.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import yannick.pdm.recyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        List<Client> clients = new ArrayList<Client>();

        clients = get();



        binding.recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        binding.recycler.setAdapter(new Adapter(MainActivity.this, clients));



    }


    public List<Client> get(){
        List<Client> clients = new ArrayList<Client>();
        Client c1 = new Client("Yannick", "yannick@gmail.com", R.drawable.a);
        Client c2 = new Client("Rafael", "rafael@gmail.com", R.drawable.d);
        Client c3 = new Client("Denise", "denise@gmail.com", R.drawable.c);
        Client c4 = new Client("Julia", "julia@gmail.com", R.drawable.b);
        Client c5 = new Client("Melanie", "melanie@gmail.com", R.drawable.e);
        Client c6 = new Client("Antonio", "antonio@gmail.com", R.drawable.f);
        Client c7 = new Client("Cesar", "cesar@gmail.com", R.drawable.g);
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);
        clients.add(c5);
        clients.add(c6);
        clients.add(c7);


        return clients;
    }
}