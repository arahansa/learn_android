package androidarena.tab;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Human.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Human#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Human extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View mov = inflater.inflate(R.layout.fragment_human, container, false);
        return mov;
    }
}