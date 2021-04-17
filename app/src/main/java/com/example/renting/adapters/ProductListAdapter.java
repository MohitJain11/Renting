package com.example.renting.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.renting.R;
import com.example.renting.models.ProductModel;

import java.util.List;

public class ProductListAdapter  extends RecyclerView.Adapter<ProductListAdapter.MyViewHolder> {

    private List<ProductModel> productModel;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_product_name, tv_product_description, tv_owner_location;
        public TextView tv_product_price;

        public MyViewHolder(View view) {
            super(view);
            tv_product_name = (TextView) view.findViewById(R.id.tv_product_name);
            tv_product_description = (TextView) view.findViewById(R.id.tv_product_description);
            tv_owner_location = (TextView) view.findViewById(R.id.tv_owner_location);
            tv_product_price = (TextView) view.findViewById(R.id.tv_product_price);
        }
    }

    public ProductListAdapter(List<ProductModel> productModel, Context context) {
        this.productModel = productModel;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProductModel ProductModel = productModel.get(position);
        holder.tv_product_name.setText(ProductModel.product_name);
        holder.tv_product_description.setText(ProductModel.product_description);
        holder.tv_owner_location.setText(ProductModel.owner_location);
        holder.tv_product_price.setText(ProductModel.product_rent_price);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_product_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return productModel.size();
    }
}
