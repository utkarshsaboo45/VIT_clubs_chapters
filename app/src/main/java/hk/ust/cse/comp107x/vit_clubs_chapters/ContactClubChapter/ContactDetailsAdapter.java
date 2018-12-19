package hk.ust.cse.comp107x.vit_clubs_chapters.ContactClubChapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andexert.library.RippleView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;

import java.util.ArrayList;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * Created by utkarsh saboo on 27-03-2018.
 */

public class ContactDetailsAdapter extends ArrayAdapter<ContactDetails>{

    private ImageClickListener mClickListener = null;

    public ContactDetailsAdapter(Context context, ArrayList<ContactDetails> details, ImageClickListener listener)
    {
        super(context, 0, details);
        mClickListener = listener;
    }

    View detailsView;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        detailsView = convertView;

        if(detailsView == null)
        {
            detailsView = LayoutInflater.from(getContext()).inflate(
                    R.layout.aaaaaaaaaacontact_list_view_temp, parent, false);
        }

        //final View tempDetailsView = detailsView;

        final ContactDetails details = getItem(position);


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////THIS IS THE COPIED ONE, EDIT FREELY FOR NOW...

        final Context mContext = getContext();
        final BlurLayout mSampleLayout;

        mSampleLayout = (BlurLayout) detailsView.findViewById(R.id.blur_layout);
        final View hover = LayoutInflater.from(mContext).inflate(R.layout.aaaaaaaahoversample4,null);



        mSampleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView content = (TextView) hover.findViewById(R.id.content);
                content.setText(details.getContent());
            }
        });

        mSampleLayout.setHoverView(hover);

        ImageView imageCall = (ImageView) hover.findViewById(R.id.phone_img);
        if(details.getImageIDCall() == 0)
            imageCall.setVisibility(View.GONE);
        else
            imageCall.setImageResource(details.getImageIDCall());

        imageCall.setTag(position);

        imageCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mClickListener != null)
                    mClickListener.onCallImageClick((Integer) v.getTag());
            }
        });

        ImageView imageMail = (ImageView) hover.findViewById(R.id.mail_img);
        if(details.getImageIDMail() == 0)
            imageMail.setVisibility(View.GONE);
        else
            imageMail.setImageResource(details.getImageIDMail());

        imageMail.setTag(position);

        imageMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mClickListener != null)
                    mClickListener.onMailImageClick((Integer) v.getTag());
            }
        });

        mSampleLayout.addChildAppearAnimator(hover, R.id.phone_img, Techniques.SlideInLeft);
        mSampleLayout.addChildAppearAnimator(hover, R.id.mail_img, Techniques.SlideInRight);

        mSampleLayout.addChildDisappearAnimator(hover, R.id.phone_img, Techniques.SlideOutLeft);
        mSampleLayout.addChildDisappearAnimator(hover, R.id.mail_img, Techniques.SlideOutRight);

        mSampleLayout.addChildAppearAnimator(hover, R.id.content, Techniques.BounceIn);
        mSampleLayout.addChildDisappearAnimator(hover, R.id.content, Techniques.FadeOutUp);

        hover.findViewById(R.id.phone_img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mClickListener != null)
                    mClickListener.onCallImageClick((Integer) v.getTag());
            }
        });

        hover.findViewById(R.id.mail_img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mClickListener != null)
                    mClickListener.onMailImageClick((Integer) v.getTag());
            }
        });


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ImageView imageLogo = (ImageView) detailsView.findViewById(R.id.club_chapter_logo);
        if(details.getImageIDLogo() == 0)
            imageLogo.setVisibility(View.GONE);
        else
            imageLogo.setImageResource(details.getImageIDLogo());

        TextView titleTextView = (TextView) detailsView.findViewById(R.id.club_chapter_title);
        titleTextView.setText(details.getClubChapterTitle());

        TextView detail1TextView = (TextView) detailsView.findViewById(R.id.detail1);
        detail1TextView.setText(details.getClubChapterDetail1());

        TextView detail2TextView = (TextView) detailsView.findViewById(R.id.detail2);
        detail2TextView.setText(details.getClubChapterDetail2());

//        final RippleView phoneRippleView = (RippleView) detailsView.findViewById(R.id.phone_rippleview);
////        if(details.getImageIDCall() == 0)
////            phoneRippleView.setVisibility(View.GONE);
////        else
////            phoneRippleView.setImageResource(details.getImageIDCall());
//        phoneRippleView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //TODO: onRippleViewClick
//                if(mClickListener != null)
//                    mClickListener.onCallImageClick((Integer) v.getTag());
//            }
//        });
//
//        phoneRippleView.setTag(position);
//
//        final RippleView mailRippleView = (RippleView) detailsView.findViewById(R.id.mail_rippleview);
////        if(details.getImageIDCall() == 0)
////            phoneRippleView.setVisibility(View.GONE);
////        else
////            phoneRippleView.setImageResource(details.getImageIDCall());
//        mailRippleView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //TODO: onRippleViewClick
//                if(mClickListener != null)
//                    mClickListener.onMailImageClick((Integer) v.getTag());
//            }
//        });
//
//        mailRippleView.setTag(position);



        //////THIS IS THE  ORIGINAL ONE : DONT ALTER THIS

//        ImageView imageCall = (ImageView) detailsView.findViewById(R.id.image_call);
//        if(details.getImageIDCall() == 0)
//            imageCall.setVisibility(View.GONE);
//        else
//            imageCall.setImageResource(details.getImageIDCall());
//
//        imageCall.setTag(position);
//
//        imageCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mClickListener != null)
//                    mClickListener.onCallImageClick((Integer) v.getTag());
//            }
//        });
//
//        ImageView imageMail = (ImageView) detailsView.findViewById(R.id.image_mail);
//        if(details.getImageIDMail() == 0)
//            imageMail.setVisibility(View.GONE);
//        else
//            imageMail.setImageResource(details.getImageIDMail());
//
//        imageMail.setTag(position);
//
//        imageMail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mClickListener != null)
//                    mClickListener.onMailImageClick((Integer) v.getTag());
//            }
//        });

        return detailsView;
    }



}
