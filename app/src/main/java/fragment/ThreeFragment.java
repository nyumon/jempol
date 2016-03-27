package fragment;

/**
 * Created by com.nyumon on 23/03/16.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.nyumon.jempol.ImageAdapter;
import com.nyumon.jempol.R;

import java.util.Objects;


public class ThreeFragment extends Fragment{
    public ThreeFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridView GridHariIni = (GridView) getView().findViewById(R.id.GridHariIni);
        GridHariIni.setAdapter(new ImageAdapter(getActivity()));
        GridView GridMingguIni = (GridView) getView().findViewById(R.id.GridMingguIni);
        GridMingguIni.setAdapter(new ImageAdapter(getActivity()));
        GridView GridBulanIni = (GridView) getView().findViewById(R.id.GridBulanIni);
        GridBulanIni.setAdapter(new ImageAdapter(getActivity()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.threefragment, container, false);
    }
}