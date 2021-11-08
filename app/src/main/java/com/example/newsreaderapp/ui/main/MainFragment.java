package com.example.newsreaderapp.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsreaderapp.R;

public class MainFragment extends Fragment {
    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(final @NonNull LayoutInflater inflater,
                             final @Nullable ViewGroup container,
                             final @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.main_fragment, container, false);

        setVariables(v);

        return v;
    }

    private void setVariables(final View view) {
        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
    }
}