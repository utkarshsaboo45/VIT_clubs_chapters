package hk.ust.cse.comp107x.vit_clubs_chapters.Fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import hk.ust.cse.comp107x.vit_clubs_chapters.HomeEventImages.SimpleFragmentPageAdapterHomeImages;
import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * Created by utkarsh saboo on 14-03-2018.
 */

public class FragmentHome extends Fragment {

    ViewPager viewPager;
    LinearLayout sliderDotsPanel;
    private int dotsCount;
    private ImageView[] dots;

    private Button b1_1, b1_2, b1_3, b2_1, b2_2, b2_3, b3_1, b3_2, b3_3, b4_1, b4_2, b4_3, b5_1, b5_2, b5_3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        final Dialog dialog = new Dialog(getContext());
//        //dialog.setContentView(R.layout.custom);
//        dialog.setTitle("Title...");
//
//        // set the custom dialog components - text and button
//        TextView text = (TextView) dialog.findViewById(R.id.text);
//        text.setText("Your Text");
//
//        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
//        // if button is clicked, close the custom dialog
//        dialogButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//            }
//        });
//        dialog.show();
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        b1_1 = (Button) view.findViewById(R.id.b1_1);
        b1_2 = (Button) view.findViewById(R.id.b1_2);
        b1_3 = (Button) view.findViewById(R.id.b1_3);
        b2_1 = (Button) view.findViewById(R.id.b2_1);
        b2_2 = (Button) view.findViewById(R.id.b2_2);
        b2_3 = (Button) view.findViewById(R.id.b2_3);
        b3_1 = (Button) view.findViewById(R.id.b3_1);
        b3_2 = (Button) view.findViewById(R.id.b3_2);
        b3_3 = (Button) view.findViewById(R.id.b3_3);
        b4_1 = (Button) view.findViewById(R.id.b4_1);
        b4_2 = (Button) view.findViewById(R.id.b4_2);
        b4_3 = (Button) view.findViewById(R.id.b4_3);
        b5_1 = (Button) view.findViewById(R.id.b5_1);
        b5_2 = (Button) view.findViewById(R.id.b5_2);
        b5_3 = (Button) view.findViewById(R.id.b5_3);

        b1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 1.1 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 1.2 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 1.3 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 2.1 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 2.2 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 2.3 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 3.1 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 3.2 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 3.3 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 4.1 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 4.2 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 4.3 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 5.1 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 5.2 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });

        b5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Button 5.3 clicked!");
                builder.setMessage("Details will be displayed here...");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = (ViewPager) view.findViewById(R.id.home_event_images_viewpager);

        sliderDotsPanel = (LinearLayout) view.findViewById(R.id.sliderDots);

        SimpleFragmentPageAdapterHomeImages adapter = new SimpleFragmentPageAdapterHomeImages(getFragmentManager());

        viewPager.setAdapter(adapter);

        dotsCount = adapter.getCount();
        dots = new ImageView[dotsCount];

        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(getContext());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 8, 8, 8);
            sliderDotsPanel.addView(dots[i], params);
        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotsCount; i++) {
                    dots[i].setImageDrawable((ContextCompat.getDrawable(getContext(), R.drawable.nonactive_dot)));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
