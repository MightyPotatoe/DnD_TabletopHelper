package com.example.dnd_tabletophelper;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ChooseClassMenuFragment extends Fragment {

    private int position;

    public ChooseClassMenuFragment(int position) {
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(true);
        View view = inflater.inflate(R.layout.activity_multi_image_menu, container, false);
        ImageView imageView = view.findViewById(R.id.imageMenu_ImageView);

        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.class_image_barbarian);
                break;
            case 1:
                imageView.setImageResource(R.drawable.class_image_bard);
                break;
            case 2:
                imageView.setImageResource(R.drawable.class_image_cleric);
                break;
            case 3:
                imageView.setImageResource(R.drawable.class_image_druid);
                break;
            case 4:
                imageView.setImageResource(R.drawable.class_image_fighter);
                break;
            case 5:
                imageView.setImageResource(R.drawable.class_image_monk);
                break;
            case 6:
                imageView.setImageResource(R.drawable.class_image_paladin);
                break;
            case 7:
                imageView.setImageResource(R.drawable.class_image_ranger);
                break;
            case 8:
                imageView.setImageResource(R.drawable.class_image_rogue);
                break;
            case 9:
                imageView.setImageResource(R.drawable.class_image_sorcerer);
                break;
            case 10:
                imageView.setImageResource(R.drawable.class_image_warlock);
                break;
            case 11:
                imageView.setImageResource(R.drawable.class_image_wizard);
                break;
        }

        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }
}

