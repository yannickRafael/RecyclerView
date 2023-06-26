package yannick.pdm.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClientViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView email, name;
    public ClientViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.item_image);
        name = itemView.findViewById(R.id.item_name);
        email = itemView.findViewById(R.id.item_email);
    }
}
