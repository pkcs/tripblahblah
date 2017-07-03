package pkcs.tripblahblah.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import pkcs.tripblahblah.R;

/**
 * Created by bgh29 on 2017-07-02.
 */

public class AttractionFragment extends Fragment implements OnMapReadyCallback {
    private View mRootView;
    private GoogleMap googleMap;
    public static AttractionFragment newInstance() {return new AttractionFragment();}
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView= inflater.inflate(R.layout.fragment_attractions , container, false);
        SupportMapFragment mapFragment = SupportMapFragment.newInstance();
        getChildFragmentManager().beginTransaction().replace(R.id.google_map, mapFragment).commit();
        mapFragment.getMapAsync(this);

        return mRootView;
    }
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        this.googleMap = googleMap;
        LatLng SEOUL = new LatLng(37.56, 126.97);
        LatLng BUSAN = new LatLng(35.10, 129.01);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        markerOptions.title("서울");
        markerOptions.snippet("한국의 수도");
        googleMap.addMarker(markerOptions);

        markerOptions = new MarkerOptions();
        markerOptions.position(BUSAN);
        markerOptions.title("부산");
        markerOptions.snippet("우리가 있는 곳");
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((SEOUL.latitude+BUSAN.latitude)/2, (SEOUL.longitude+BUSAN.longitude)/2)));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(7));
    }
}
