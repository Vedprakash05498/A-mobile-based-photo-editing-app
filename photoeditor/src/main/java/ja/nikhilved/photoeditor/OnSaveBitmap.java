package ja.nikhilved.photoeditor;

import android.graphics.Bitmap;


public interface OnSaveBitmap {
    void onBitmapReady(Bitmap saveBitmap);

    void onFailure(Exception e);
}
