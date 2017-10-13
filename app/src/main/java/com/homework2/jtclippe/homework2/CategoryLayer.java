package com.homework2.jtclippe.homework2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.jetbrains.annotations.Nullable;

public class CategoryLayer extends Fragment{

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstance)
    {
        View view = inflater.inflate(R.layout.category, container, false);

        ListView listView = (ListView)view.findViewById(R.id.listView1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View fragmentContainer = (View) getActivity().findViewById(R.id.fragmentContainer);
                switch (position)
                {
                    case 0:
                        if (fragmentContainer != null)
                        {
                            Part1 p1 = new Part1();
                            FragmentTransaction ft = getFragmentManager().beginTransaction();
                            ft.replace(R.id.fragmentContainer, p1);
                            ft.addToBackStack(null);
                            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                            ft.commit();
                        }
                        else {
                            startActivity(new Intent(getActivity(), Part1Activity.class));
                        }
                        break;
                    case 1:
                        if (fragmentContainer != null)
                        {
                            Part2 p2 = new Part2();
                            FragmentTransaction ft = getFragmentManager().beginTransaction();
                            ft.replace(R.id.fragmentContainer, p2);
                            ft.addToBackStack(null);
                            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                            ft.commit();
                        }
                        else {
                            startActivity(new Intent(getActivity(), Part2Activity.class));
                        }
                        break;
                    case 2:
                        if (fragmentContainer != null)
                        {
                            Part3 p3 = new Part3();
                            FragmentTransaction ft = getFragmentManager().beginTransaction();
                            ft.replace(R.id.fragmentContainer, p3);
                            ft.addToBackStack(null);
                            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                            ft.commit();
                        }
                        else {
                            startActivity(new Intent(getActivity(), Part3Activity.class));
                        }
                        break;
                    case 3:
                        if (fragmentContainer != null)
                        {
                            Part4 p4 = new Part4();
                            FragmentTransaction ft = getFragmentManager().beginTransaction();
                            ft.replace(R.id.fragmentContainer, p4);
                            ft.addToBackStack(null);
                            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                            ft.commit();
                        }
                        else {
                            startActivity(new Intent(getActivity(), Part4Activity.class));
                        }
                        break;
                }
            }
        });

        return view;
    }
}
/*
View fragmentContainer = (View) findViewById(R.id.fragmentContainer);
        if (fragmentContainer != null)
        {
            CategoryLayer cl = new CategoryLayer();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragmentContainer, cl);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        else {
            startActivity(new Intent(this, CategoryActivity.class));
        }
 */
