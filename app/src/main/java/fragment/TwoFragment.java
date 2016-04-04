package fragment;

/**
 * Created by com.nyumon on 23/03/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.support.v4.app.FragmentTabHost;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
import android.support.v4.app.FragmentTabHost;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyumon.jempol.R;


<<<<<<< HEAD
<<<<<<< HEAD
public class TwoFragment extends Fragment{
=======
public class TwoFragment extends Fragment {
    private FragmentTabHost mTabHost;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
public class TwoFragment extends Fragment {
    private FragmentTabHost mTabHost;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
<<<<<<< HEAD
<<<<<<< HEAD
        return inflater.inflate(R.layout.twofragment, container, false);
=======
        View rootView = inflater.inflate(R.layout.twofragment,container, false);
        return rootView;

>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
        View rootView = inflater.inflate(R.layout.twofragment,container, false);
        return rootView;

>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
    }

}