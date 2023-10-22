package com.example.stepappv2.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.stepappv2.R;
import com.example.stepappv2.databinding.FragmentHomeBinding;
import com.example.stepappv2.ui.gallery.GalleryViewModel;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class HomeFragment extends Fragment {

    public FragmentHomeBinding binding;
    public static TextView stepCountsView;
    public static int counter = 0;
    public static CircularProgressIndicator progressBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



//        TODO
//        Set the text count to 1000 from here.
//        Remember to define the variable as private for the class above.
            stepCountsView = (TextView) root.findViewById(R.id.counter);
            stepCountsView.setText("0");

//        TODO
//        Set the max and current progress on the CircularProgressIndicator
//        Remember to define the variable as private for the class above.

        progressBar = (CircularProgressIndicator)
                root.findViewById(R.id.progressBar);
        progressBar.setMax(6000);
        progressBar.setProgress(0);

        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}