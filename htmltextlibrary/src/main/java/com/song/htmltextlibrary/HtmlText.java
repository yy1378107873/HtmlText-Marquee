package com.song.htmltextlibrary;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
/**
 * @author : songjun
 * @create : 2020-03-02
 * 实现html标签的textview，可以识别标签中文字大小，根据需求可自己修改需要实现的功能标签
 */
public class HtmlText extends AppCompatTextView {
    public HtmlText(Context context) {
        super(context);
    }

    public HtmlText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HtmlText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setHtmlText(String htmlStr){
        if (TextUtils.isEmpty(htmlStr)){
            setText(htmlStr);
        }else{
            String replaceHtmlStr = htmlStr.replaceAll("font", HtmlHandler.XFONT);
            setText(Html.fromHtml(replaceHtmlStr, null, new HtmlHandler()));
        }
    }

}
