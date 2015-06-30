package androidarena.tab;

import androidarena.tab.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Video extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View vid = inflater.inflate(R.layout.video_frag, container, false);
		((TextView) vid.findViewById(R.id.textView)).setText("Video Section");
		return vid;
	}
}
