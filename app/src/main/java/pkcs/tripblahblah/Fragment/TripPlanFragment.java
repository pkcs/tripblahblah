<<<<<<< HEAD
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
=======
package pkcs.tripblahblah.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Date;

import pkcs.tripblahblah.Adapter.TripPlansAdapter;
import pkcs.tripblahblah.Model.TripPlans;
import pkcs.tripblahblah.R;


/**
 * Created by bgh29 on 2017-07-02.
 */

public class TripPlanFragment  extends Fragment {
    private RecyclerView mRecyclerView;
    private TripPlansAdapter mAdapter;
    private ArrayList<TripPlans> mTripPlansItems=new ArrayList<>();
    private View mRootView;
    //
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

        mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.recyclerview_tripplan);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        dummyData();

        return mRootView;
    }

    public void updateUI(){
        mAdapter = new TripPlansAdapter(getContext(), mTripPlansItems);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void dummyData() {
        java.util.Date date1 = new Date("Sat Dec 01 00:00:00 GMT 2012");
        java.util.Date date2 = new Date("Sat Dec 01 00:00:00 GMT 2015");

        mTripPlansItems.add(new TripPlans("서울",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("부산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("울산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("김해",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("서울",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("부산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("울산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("김해",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("서울",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("부산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("울산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("김해",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("서울",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("부산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("울산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("김해",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("서울",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("부산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("울산",date1, date2,null,null));
        mTripPlansItems.add(new TripPlans("김해",date1, date2,null,null));
        /*for(TripPlans tripPlans : arrayList){
            mTripPlansItems.add(tripPlans);
        }*/
                mAdapter.notifyDataSetChanged();
    }
>>>>>>> b42772cef7df55d8e0cf539ffe89506f19791dc9
}