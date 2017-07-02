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

public class GuideFragment  extends Fragment {
    private View mRootView;

    public static GuideFragment newInstance() {
        return new GuideFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_guide, container, false);
        return mRootView;
    }
}