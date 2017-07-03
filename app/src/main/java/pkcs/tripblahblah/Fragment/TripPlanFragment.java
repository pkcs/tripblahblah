package pkcs.tripblahblah.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pkcs.tripblahblah.R;

/**
 * Created by bgh29 on 2017-07-02.
 */

public class TripPlanFragment  extends Fragment {
    private View mRootView;

    public static TripPlanFragment newInstance() {
        return new TripPlanFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_tripplans, container, false);
        return mRootView;
    }
}