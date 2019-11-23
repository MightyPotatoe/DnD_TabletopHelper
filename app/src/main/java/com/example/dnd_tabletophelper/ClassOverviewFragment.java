package com.example.dnd_tabletophelper;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ClassOverviewFragment extends Fragment {

    private int whichClass;


    public ClassOverviewFragment(int whichClass) {
        this.whichClass = whichClass;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(true);

        View view = inflater.inflate(R.layout.activity_two_text_fields, container, false);
        TextView titleTextView = view.findViewById(R.id.two_textActivity_title);
        TextView section_1_TextView = view.findViewById(R.id.two_section_1_textView);
        TextView section_2_TextView = view.findViewById(R.id.two_section_2_textView);
        ImageView imageView = view.findViewById(R.id.two_section_1_ImageView);

        ArrayList <Integer> imageIdArrayList = new ArrayList<Integer>();

        for(int i =1; i<=12; i++){
            String name = "class_overview_image" + i;
            int id = getResources().getIdentifier(name,"drawable", getContext().getPackageName());
            imageIdArrayList.add(id);
        }

        String[] titleStrings = getResources().getStringArray(R.array.classOverviewTitles);
        String[] section1Strings = getResources().getStringArray(R.array.classOverviewSection1);
        String[] section2Strings = getResources().getStringArray(R.array.classOverviewSection2);

        titleTextView.setText(titleStrings[whichClass]);
        section_1_TextView.setText(section1Strings[whichClass]);
        imageView.setImageResource(imageIdArrayList.get(whichClass));
        section_2_TextView.setText(section2Strings[whichClass]);


        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }
}
