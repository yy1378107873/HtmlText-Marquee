package com.song.htmltext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.song.htmltextlibrary.HtmlText;
import com.song.scrolltextlibrary.MarqueeTextView;

public class MainActivity extends AppCompatActivity {

    private String htmlStr = "<p><font color='#0000FF' size='50px'>我是蓝色的文本</font><br><font color='#ff0000' size='40px'>我是红色的文本</font><br><font color='#000000' size='29px'>我是黑色的文本</font>";
    private String marquee1 = "我是滚动的文本我是滚动的文本我是滚动的文本";
    private String marquee2 = "我是改变后滚动的文本我是滚动的文本我是滚动的文本";
    private boolean isMarqueeSwitch = false;
    private MarqueeTextView marqueeTextView;
    private HtmlText htmlText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        htmlText = findViewById(R.id.htmltext);
        htmlText.setHtmlText(htmlStr);

        marqueeTextView = findViewById(R.id.marqueetextview);
        marqueeTextView.setOnClickListener(onClickListener);
        marqueeTextView.setText(marquee1);
        marqueeTextView.startScroll();
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.marqueetextview:
                    marqueeTextView.setText(isMarqueeSwitch?marquee1:marquee2);
                    isMarqueeSwitch = !isMarqueeSwitch;
                    marqueeTextView.startScroll();
                    break;
            }
        }
    };
}
