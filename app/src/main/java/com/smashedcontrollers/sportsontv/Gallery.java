package com.smashedcontrollers.sportsontv;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Gallery extends SingleFragmentActivity{

    @Override
    public Fragment createFragment(){
        return GalleryFragment.newInstance();
    }
}
