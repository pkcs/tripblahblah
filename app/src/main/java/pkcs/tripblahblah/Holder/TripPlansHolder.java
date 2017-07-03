package pkcs.tripblahblah.Holder;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import pkcs.tripblahblah.Model.TripPlans;
import pkcs.tripblahblah.R;

/**
 * Created by chacha on 2017-07-03.
 */

public class TripPlansHolder extends BaseViewHolder<TripPlans> implements View.OnClickListener {
    private Context mContext;
    TripPlans mTripPlans;
    private TextView title;
    private TextView period;

    public TripPlansHolder(Context context,View itemView) {
        super(itemView);
        this.mContext = context;
        itemView.setOnClickListener(this);
        title = (TextView)itemView.findViewById(R.id.textview_tripplan_title);
        period = (TextView)itemView.findViewById(R.id.textview_tripplan_date);

    }

    @Override
    public void onBindView(final TripPlans tripPlans) {
        mTripPlans= tripPlans;
        title.setText(mTripPlans.getTitle());
        period.setText(mTripPlans.getStartDate()+" ~ "+mTripPlans.getFinishDate());
    }

    @Override
    public void onClick(View v){
        Log.i("TripPlanTest", title.getText().toString());
/*        Intent intent =new Intent(mContext, TripPlans.class);
        intent.putExtra("title", mTripPlans.getTitle());
        intent.putExtra("period", mTripPlans.getStartDate()+" ~ "+mTripPlans.getFinishDate());
        mContext.startActivity(intent);*/
    }
}
