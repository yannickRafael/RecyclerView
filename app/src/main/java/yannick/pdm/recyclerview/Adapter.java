package yannick.pdm.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ClientViewHolder> {


    Context context;
    List<Client> client;

    public Adapter(Context context, List<Client> client) {
        this.context = context;
        this.client = client;
    }

    @NonNull
    @Override
    public ClientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClientViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClientViewHolder holder, int position) {
        holder.name.setText(client.get(position).getName());
        holder.email.setText(client.get(position).getEmail());
        holder.image.setImageResource(client.get(position).getImage());
        int index = position;
        
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alerta.alertar(context, "Informacao",
                        "Nome: "+client.get(index).getName()+"\n"
                                +"Email: "+client.get(index).getEmail()
                );
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.client.size();
    }
}
