package com.example.dnd_tabletophelper;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ClassAbilityTableFragment extends Fragment {

    private int whichClass;

    public ClassAbilityTableFragment(int whichClass) {
        this.whichClass = whichClass;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(true);
        View view = inflater.inflate(R.layout.activity_table, container, false);

        String[] lvlStrings;
        String[] featuresTableString;
        String[] proficiencyStrings;
        String[] cantripsKnownTableString;
        String[] spellsKnownTableString;

        switch (whichClass){
            case 0: default:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.barbarianFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.barbarianRagesTable);
                spellsKnownTableString = getResources().getStringArray(R.array.barbarianRageDamageTable);
                break;
            case 1:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.bardFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.bardCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.bardSpellsKnownTable);
                break;
            case 2:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.clericFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.clericCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
            case 3:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.druidFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.druidCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
            case 4:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.fighterFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
            case 5:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.monkFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.monkCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.monkSpellsKnownTable);
                break;
            case 6:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.paladinFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
            case 7:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.rangerFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.rangerCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
            case 8:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.rogueFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.rogueCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
            case 9:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.sorcererFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.sorcererCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.sorcererSpellsKnownTable);
                break;
            case 10:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.warlockFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.warlockCantripKnownTable);
                spellsKnownTableString = getResources().getStringArray(R.array.warlockSpellsKnownTable);
                break;
            case 11:
                lvlStrings = getResources().getStringArray(R.array.levelTable);
                proficiencyStrings = getResources().getStringArray(R.array.profitiencyTable);
                featuresTableString = getResources().getStringArray(R.array.wizardFeaturesTable);
                cantripsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                spellsKnownTableString = getResources().getStringArray(R.array.emptyColumnString);
                break;
        }


        for(int i=0; i<=20; i++){
            fillColumn(view, "abilityTableLvl_TextView_", i, lvlStrings);
            fillColumn(view, "abilityTableProfitiency_TextView_", i, proficiencyStrings);
            fillColumn(view, "abilityTableFeatures_TextView_", i, featuresTableString);
            fillColumn(view, "abilityCantripsKnown_TextView_", i, cantripsKnownTableString);
            fillColumn(view, "abilitySpellsKnown_TextView_", i, spellsKnownTableString);
        }


        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }


    private void fillColumn(View view, String name, int index, String[] stringTable){
        name = name + index;
            int id = getResources().getIdentifier(name,"id", getContext().getPackageName());
            TextView textView = view.findViewById(id);
            textView.setText(stringTable[index]);
    }
}


