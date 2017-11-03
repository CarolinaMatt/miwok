/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    //set-up for the ViewPager and PagerAdapter
    private static final int NUM_PAGES = 4;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //instantiate a ViewPager and PagerAdapter
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);


//        *******EXAMPLE OF USING INTENTS FOR MULTIPLE ACTIVITIES INSIDE AN APP*******
        //        // Find the View that shows the numbers category
        //        TextView numbers = (TextView) findViewById(R.id.numbers);
        //        // Set a click listener on that View
        //        numbers.setOnClickListener(new OnClickListener() {
        //            // The code in this method will be executed when the numbers category is clicked on.
        //            @Override
        //            public void onClick(View view) {
        //                // Create a new intent to open the {@link NumbersActivity}
        //                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
        //
        //                // Start the new activity
        //                startActivity(numbersIntent);
        //            }
        //        });

    }

}

