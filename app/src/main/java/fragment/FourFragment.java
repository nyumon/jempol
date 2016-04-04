package fragment;

/**
 * Created by com.nyumon on 23/03/16.
 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.content.ClipData;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
import android.content.ClipData;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
<<<<<<< HEAD
<<<<<<< HEAD
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
=======
=======
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
<<<<<<< HEAD
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
import android.widget.RadioButton;
import android.widget.TextView;

import com.nyumon.jempol.CustomAdapter;
import com.nyumon.jempol.MainActivity;
import com.nyumon.jempol.NewPostActivity;
import com.nyumon.jempol.R;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.logging.Handler;

>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
import java.util.ArrayList;
import java.util.logging.Handler;

>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da

public class FourFragment extends Fragment{

    String firstString = "";
    String secondString = "";
    private static final String TAG = "RecyclerViewFragment";
    private static final String KEY_LAYOUT_MANAGER = "layoutManager";
    private static final int SPAN_COUNT = 2;
    private static final int DATASET_COUNT = 60;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
    private SwipeRefreshLayout swipeRefresh;
    private ArrayList<ClipData.Item> itemList;


<<<<<<< HEAD
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da

    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }


    protected LayoutManagerType mCurrentLayoutManagerType;

    protected RadioButton mLinearLayoutRadioButton;
    protected RadioButton mGridLayoutRadioButton;

    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataset;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize dataset, this data would usually come from a local content provider or
        // remote server.
<<<<<<< HEAD
<<<<<<< HEAD
        initDataset();
=======

        initDataset();

>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======

        initDataset();

>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
    }

    public FourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fourfragment, container, false);
        rootView.setTag(TAG);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        // Inflate the layout for this fragment
        mLayoutManager = new LinearLayoutManager(getActivity());

        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;

        if (savedInstanceState != null) {
            // Restore saved layout manager type.
            mCurrentLayoutManagerType = (LayoutManagerType) savedInstanceState
                    .getSerializable(KEY_LAYOUT_MANAGER);
        }
        setRecyclerViewLayoutManager(mCurrentLayoutManagerType);

        mAdapter = new CustomAdapter(mDataset);
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        /*mLinearLayoutRadioButton = (RadioButton) rootView.findViewById(R.id.linear_layout_rb);
        mLinearLayoutRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRecyclerViewLayoutManager(LayoutManagerType.LINEAR_LAYOUT_MANAGER);
            }
        });

        mGridLayoutRadioButton = (RadioButton) rootView.findViewById(R.id.grid_layout_rb);
        mGridLayoutRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRecyclerViewLayoutManager(LayoutManagerType.GRID_LAYOUT_MANAGER);
            }
        });*/

        return rootView;
    }

    /**
     * Set RecyclerView's LayoutManager to the one given.
     *
     * @param layoutManagerType Type of layout manager to switch to.
     */
    public void setRecyclerViewLayoutManager(LayoutManagerType layoutManagerType) {
        int scrollPosition = 0;

        // If a layout manager has already been set, get current scroll position.
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager())
                    .findFirstCompletelyVisibleItemPosition();
        }

        switch (layoutManagerType) {
            case GRID_LAYOUT_MANAGER:
                mLayoutManager = new GridLayoutManager(getActivity(), SPAN_COUNT);
                mCurrentLayoutManagerType = LayoutManagerType.GRID_LAYOUT_MANAGER;
                break;
            case LINEAR_LAYOUT_MANAGER:
                mLayoutManager = new LinearLayoutManager(getActivity());
                mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
                break;
            default:
                mLayoutManager = new LinearLayoutManager(getActivity());
                mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
        }

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(scrollPosition);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save currently selected layout manager.
        savedInstanceState.putSerializable(KEY_LAYOUT_MANAGER, mCurrentLayoutManagerType);
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    private void initDataset() {
        mDataset = new String[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataset[i] = "This is element #" + i;
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
=======
}
>>>>>>> d5fc2cfbbcc5f96b2ed7c33893beda9d02a4d5da
