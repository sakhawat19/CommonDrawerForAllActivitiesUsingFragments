package www.fulldnnsolution.com.samedrawerallactivity_fragments.fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import www.fulldnnsolution.com.samedrawerallactivity_fragments.R;

public class MessageFragment extends Fragment {

    WebView superWebViewMessage;
    ProgressBar superProgressBarMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_message,
                container, false);


        superWebViewMessage = (WebView) view.findViewById(R.id.messageWebView);

        superWebViewMessage.loadUrl("http://www.prothomalo.com/");
        superWebViewMessage.getSettings().setJavaScriptEnabled(true);
        superWebViewMessage.setWebViewClient(new WebViewClient());
        superWebViewMessage.setWebChromeClient(new WebChromeClient());



        return view;

    }
}
