package com.example.sieuthi.homefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sieuthi.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Product> listProduct;

    public ProductAdapter(Context context, List<Product> listProduct) {
        this.context = context;
        this.listProduct = listProduct;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_product, parent, false);

        return new ProductAdapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {
        Product product = (Product) listProduct.get(position);
        if(product != null) {
            holder.imgPhoto.setImageResource(product.getImgPhoto());
            holder.tvName.setText(product.getName());

            String strName = product.getPrice() + "";
            for(int i=strName.length() - 3; i>0; i -= 3) {
                strName = strName.substring(0, i) + "," + strName.substring(i, strName.length());
            }
            holder.tvPrice.setText(strName + "đ");
        }
    }

    @Override
    public int getItemCount() {
        return listProduct .size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvPrice;
        TextView tvName;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = (ImageView) itemView.findViewById(R.id.imageViewProduct);
            tvName = (TextView) itemView.findViewById(R.id.textViewProductName);
            tvPrice = (TextView) itemView.findViewById(R.id.textViewProductPrice);
        }
    }
}
