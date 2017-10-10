package com.lqh.lichao.xfermode_dst;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 倒影图像
 * Created by Administrator on 2017-10-10.
 */

public class InvertedImageView_DSTIN extends View{

    private Paint mBitPaint;
    private Bitmap BmpDST,BmpSRC,BmpRevert;

    public InvertedImageView_DSTIN(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        mBitPaint = new Paint();

        BmpDST = BitmapFactory.decodeResource(getResources(), R.drawable.xyjy6, null);
        BmpSRC = BitmapFactory.decodeResource(getResources(), R.drawable.invert_shade, null);

        Matrix matrix = new Matrix();
        matrix.setScale(1F, -1F);

        // 生成倒影图
        BmpRevert = Bitmap.createBitmap(BmpDST, 0, 0, BmpDST.getWidth(), BmpDST.getHeight(), matrix, true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //先画出原图片
        canvas.drawBitmap(BmpDST, 0, 0, mBitPaint);

        //再画出倒影
        int layerId = canvas.saveLayer(0, 0, getWidth(), getHeight(), null, Canvas.ALL_SAVE_FLAG);
        canvas.translate(0, BmpSRC.getHeight());

        canvas.drawBitmap(BmpRevert, 0, 0, mBitPaint);
        mBitPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(BmpSRC, 0, 0, mBitPaint);

        mBitPaint.setXfermode(null);
        canvas.restoreToCount(layerId);
    }
}
