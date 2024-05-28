package com.example.lugaluga.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lugaluga.view.Produto;
import com.example.lugaluga.R;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.ViewHolder> {

    private List<Produto> produtoList;

    public AdapterProduto(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @NonNull
    @Override
    public AdapterProduto.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View produtos = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_produto, parent, false);

        return new ViewHolder(produtos);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProduto.ViewHolder holder, int position) {
        holder.nomeProd.setText(produtoList.get(position).getNome());
        holder.precoProd.setText(String.valueOf(produtoList.get(position).getPreco()));
        holder.descProd.setText(produtoList.get(position).getDescricao());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nomeProd, precoProd, descProd;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeProd = itemView.findViewById(R.id.tv_nomeProd);
            precoProd = itemView.findViewById(R.id.tv_precoProd);
            descProd = itemView.findViewById(R.id.descProd);

        }
    }
}
