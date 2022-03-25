package com.example.sieuthi.productfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sieuthi.R;
import com.example.sieuthi.homefragment.Category;
import com.example.sieuthi.homefragment.CategoryAdapter;
import com.example.sieuthi.homefragment.CategoryHighlightAdapter;
import com.example.sieuthi.homefragment.Product;

import java.util.ArrayList;

public class ProductFragment extends Fragment {

    Context context;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_product, container, false);
        context = view.getContext();

        setRecyclerViewListHighlight();

        setRecyclerViewCategory();

        return view;
    }

    public void setRecyclerViewCategory() {

        // Add database
        ArrayList<Product> listProduct = new ArrayList<>();

        ArrayList<Category> listCategory = new ArrayList<>();
        listCategory.add(new Category(R.drawable.category1,"Bánh ngọt, Bánh mì", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Đồ ăn sẵn", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Rau củ, Đậu hũ", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Trái cây", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Thịt, Hải sản", listProduct));
        listCategory.add(new Category(R.drawable.category1,"TP đông lạnh khác", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Đồ hộp", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Mì gói, TP ăn liền", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Thực phẩm khô", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Nguyên liệu, Gia vị", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Trứng, sữa", listProduct));
        listCategory.add(new Category(R.drawable.category1,"TP chế biến từ sữa", listProduct));

        // init
        RecyclerView rcvCatedory = (RecyclerView) view.findViewById(R.id.recyclerViewListCategory);
        CategoryAdapter categoryAdapter = new CategoryAdapter(context, listCategory);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);

        // set up
        rcvCatedory.setAdapter(categoryAdapter);
        rcvCatedory.setLayoutManager(gridLayoutManager);

    }


    public void setRecyclerViewListHighlight() {

        // Add database
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));
        listProduct.add(new Product(R.drawable.product1, 5000, "Mì tôm Hảo Hảo chua cay"));

        ArrayList<Category> listCategory = new ArrayList<>();
        listCategory.add(new Category(R.drawable.category1,"Hàng mới về", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Bán chạy", listProduct));
        listCategory.add(new Category(R.drawable.category1,"Tất cả sản phẩm", listProduct));

        // init
        RecyclerView rcvCatedory = (RecyclerView) view.findViewById(R.id.recyclerViewListHighlight);
        CategoryHighlightAdapter categoryAdapter = new CategoryHighlightAdapter(context, listCategory);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);

        // set up
        rcvCatedory.setAdapter(categoryAdapter);
        rcvCatedory.setLayoutManager(linearLayoutManager);

    }
}