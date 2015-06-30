package androidarena.tab;

import androidarena.tab.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Movies extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View mov = inflater.inflate(R.layout.movie_frag, container, false);
        ((TextView) mov.findViewById(R.id.textView)).setText("Movies List");
        return mov;
    }
}
