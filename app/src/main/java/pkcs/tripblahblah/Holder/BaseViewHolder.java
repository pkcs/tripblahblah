package pkcs.tripblahblah.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by chacha on 2017-07-03.
 */

public abstract class BaseViewHolder<ITEM> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void onBindView(ITEM item);
}
