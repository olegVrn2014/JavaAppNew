package ru.livemotivation.javaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

   // private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
      //  btnTEST = (Button) view.findViewById(R.id.btnTEST);

      //  btnTEST.setOnClickListener(new View.OnClickListener() {
      //      @Override
       //     public void onClick(View view) {
        //        Toast.makeText(getActivity(), "TESTING BUTTON CLICK 2",Toast.LENGTH_SHORT).show();
       //     }
      //  });

        return view;
    }
}
