package com.example.dnd_tabletophelper;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ClassAbilitiesButtonListFragment extends Fragment {

    private int whichClass;

    public ClassAbilitiesButtonListFragment(int whichClass) {
        this.whichClass = whichClass;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(true);
        View view = inflater.inflate(R.layout.activity_button_list, container, false);

        String[] featuresTableString;

        switch (whichClass){
            case 0: default:
                featuresTableString = getResources().getStringArray(R.array.barbarianAbilityList);
                break;
        }

        TextView titleTextView = view.findViewById(R.id.buttonList_title);
        titleTextView.setText(featuresTableString[0]);
        for(int i=1; i<=20; i++){
            fillButton(view, i, featuresTableString);
        }


        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }

    private void fillButton(View view, int index, String[] stringTable){
        String name = "buttonList_button_" + index;
        int id = getResources().getIdentifier(name,"id", getContext().getPackageName());
        Button button = view.findViewById(id);
        if(index < stringTable.length){
            button.setText(stringTable[index]);
        }
        else{
            name = "buttonList_space_" + index;
            id = getResources().getIdentifier(name,"id", getContext().getPackageName());
            Space space = view.findViewById(id);
            space.getLayoutParams().height = 0;
            button.getLayoutParams().height = 0;
            button.setVisibility(View.INVISIBLE);
        }
    }

}

// TODO: 06.12.2019 dodac "podklasy" w layoucie, dopisac do nich stringi.
// TODO: 06.12.2019 uzupelnic dla pozostalych klas
