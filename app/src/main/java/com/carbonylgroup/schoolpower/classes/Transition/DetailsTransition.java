/**
 * Copyright (C) 2016 Gustav Wang
 */

package com.carbonylgroup.schoolpower.classes.Transition;

import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;


public class DetailsTransition extends TransitionSet {

    public DetailsTransition() {
        setOrdering(ORDERING_TOGETHER);
        addTransition(new ChangeBounds()).
                addTransition(new ChangeTransform());
                addTransition(new ChangeImageTransform());
    }

}