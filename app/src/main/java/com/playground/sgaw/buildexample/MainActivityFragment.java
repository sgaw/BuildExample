package com.playground.sgaw.buildexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private static final String TAG = "MainActivityFragment";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // Display the results of NDK call onscreen
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(Integer.toString(add(123, 9)));
        return view;
    }

    // Define API for calling native functions
    public native int add(int a, int b);

    // Load the static NDK library
    static {
        System.loadLibrary("math-jni");
    }
}
