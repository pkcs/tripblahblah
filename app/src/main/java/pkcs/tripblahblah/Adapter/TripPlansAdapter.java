package pkcs.tripblahblah.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import pkcs.tripblahblah.Holder.TripPlansHolder;
import pkcs.tripblahblah.Model.TripPlans;
import pkcs.tripblahblah.R;

/**
 * Created by chacha on 2017-07-03.
 */

public class TripPlansAdapter extends RecyclerView.Adapter<TripPlansHolder> {
    Context mcon;
    ArrayList<TripPlans> mTripPlansArrayList;

    public TripPlansAdapter(Context mcon, ArrayList<TripPlans> TripPlansArrayList) {
        this.mcon = mcon;
        this.mTripPlansArrayList = TripPlansArrayList;

    }
    @Override
    public TripPlansHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcon);
        View view = layoutInflater.inflate(R.layout.cardview_tripplan, parent, false);
        return new TripPlansHolder(mcon, view);
    }

    @Override
    public void onBindViewHolder(TripPlansHolder holder, int position) {
        TripPlans TripPlans = mTripPlansArrayList.get(position);
        holder.onBindView(TripPlans);
    }

    @Override
    public int getItemCount() {
        return mTripPlansArrayList.size();
    }
}
