package com.example.dnd_tabletophelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

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
        String[] featuresDescriptionString;
        String specializationName;
        String specializationDescription;
        ArrayList<String[]> specializationStringsArrayList = new ArrayList<>();
        ArrayList<String[]> specializationDescriptionsArrayList = new ArrayList<>();

        switch (whichClass){
            case 0: default:
                featuresTableString = getResources().getStringArray(R.array.barbarianAbilityList);
                featuresDescriptionString = getResources().getStringArray(R.array.barbarianAbilityDescription);
                specializationName = getResources().getString(R.string.barbarianPrimalPathTitle);
                specializationDescription = getResources().getString(R.string.barbarianPrimalPath);

                specializationStringsArrayList.add(getResources().getStringArray(R.array.barbarianPathOfBerserker));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.barbarianPathOfBerserkerDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.barbarianPathOfTotemWarrior));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.barbarianPathOfTotemWarriorDescription));
                break;
            case 1:
                featuresTableString = getResources().getStringArray(R.array.bardAbilityList);
                featuresDescriptionString = getResources().getStringArray(R.array.bardAbilityDescriptions);
                specializationName = getResources().getString(R.string.bardCollegeTitle);
                specializationDescription = getResources().getString(R.string.bardCollegeDescription);

                specializationStringsArrayList.add(getResources().getStringArray(R.array.bardCollegeOfLoreAbilityList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.bardCollegeOfLoreAbilityDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.bardCollegeOfValorAbilitiesList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.bardCollegeOfValorAbilitiesDescription));
                break;
            case 2:
                featuresTableString = getResources().getStringArray(R.array.clericAbilitiesList);
                featuresDescriptionString = getResources().getStringArray(R.array.clericAbilitiesDescription);
                specializationName = getResources().getString(R.string.clericDivineDomainsTitle);
                specializationDescription = getResources().getString(R.string.clericDivineDomainsDescription);

                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericKnowledgeDomainAbilitiesList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericKnowledgeDomainAbilitiesDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericLifeDomainAbilitiesList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericLifeDomainAbilitiesDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericLightDomainAbilityList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericLightDomainAbilityDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericNatureDomainAbilityList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericNatureDomainAbilityDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericTempestDomainAbilityList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericTempestDomainAbilityDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericTrickeryDomainAbilityList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericTrickeryDomainAbilityDescription));
                specializationStringsArrayList.add(getResources().getStringArray(R.array.clericWarDomainAbilityList));
                specializationDescriptionsArrayList.add(getResources().getStringArray(R.array.clericWarDomainAbilityDescription));
                break;
        }

        TextView titleTextView = view.findViewById(R.id.buttonList_title);

        titleTextView.setText(featuresTableString[0]);
        for(int i=1; i<=20; i++){
            fillButton(view, i, featuresTableString, featuresDescriptionString);
        }

        TextView specializationTextView = view.findViewById(R.id.buttonList_section2_title);
        specializationTextView.setText(specializationName);
        TextView specializationDescriptionTextView = view.findViewById(R.id.buttonList_section2);
        specializationDescriptionTextView.setText(specializationDescription);


        for(int i = 1; i<=7; i++){//for each specialization in UI
            String[] abilityNameArray;
            String[] abilityDescriptionArray;

            String name = "buttonList_subClassTitle_" + i;
            int id = getResources().getIdentifier(name, "id", getContext().getPackageName());
            TextView textView = view.findViewById(id);

            if(specializationStringsArrayList.size() >= i){
                abilityNameArray = specializationStringsArrayList.get(i-1);
                abilityDescriptionArray = specializationDescriptionsArrayList.get(i-1);
                textView.setText(abilityNameArray[0]);
            }
            else {
                abilityNameArray = new String[0];
                abilityDescriptionArray = new String[0];
                textView.setTextSize(0);
                textView.setText("");
            }
            for(int j=1; j<=7; j++){
                fillButton(view, i, j, abilityNameArray, abilityDescriptionArray);
            }
        }

        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }


    private void fillButton(View view,  int index,  String[] stringTable, String[] descriptionTable){
        String buttonName = "buttonList_button_" + index;
        String spaceName = "buttonList_space_" + index;
        fillButton(view, buttonName, spaceName, index, stringTable, descriptionTable);
    }

    private void fillButton(View view, int specNumber, int index, String[] stringTable, String[] descriptionTable){
        String buttonName = "buttonList_button_" + specNumber + "_" + index;
        String spaceName = "buttonList_space_" + specNumber + "_" + index;
        fillButton(view, buttonName, spaceName, index, stringTable, descriptionTable);
    }


    private void fillButton(View view, String buttonName, String spaceName, final int index, final String[] stringTable, final String[] descriptionTable){
        int id = getResources().getIdentifier(buttonName,"id", getContext().getPackageName());
        Button button = view.findViewById(id);
        if(index < stringTable.length){
            button.setText(stringTable[index]);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), AbilityDescriptionActivity.class);
                    intent.putExtra("title", stringTable[index]);
                    intent.putExtra("string", descriptionTable[index]);
                    intent.setFlags(intent.getFlags()| Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                }
            });
        }
        else{
            id = getResources().getIdentifier(spaceName,"id", getContext().getPackageName());
            Space space = view.findViewById(id);
            space.getLayoutParams().height = 0;
            button.getLayoutParams().height = 0;
            button.setVisibility(View.INVISIBLE);
        }
    }
}

// TODO: 18.12.2019   uzupelnic: druid
// TODO: 18.12.2019   uzupelnic: fighter
// TODO: 18.12.2019   uzupelnic: monk
// TODO: 18.12.2019   uzupelnic: paladin
// TODO: 18.12.2019   uzupelnic: ranger
// TODO: 18.12.2019   uzupelnic: rogue
// TODO: 18.12.2019   uzupelnic: sorcerer
// TODO: 18.12.2019   uzupelnic: warlock
// TODO: 18.12.2019   uzupelnic: wizard

