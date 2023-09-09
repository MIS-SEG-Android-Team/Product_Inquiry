package org.rmj.g3appdriver.Knox;

import static org.junit.Assert.assertNotNull;

import android.app.Application;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.rmj.g3appdriver.GCircle.Apps.knox.Obj.KnoxActivate;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class TestKnoxActivate {
    private static final String TAG = TestKnoxActivate.class.getSimpleName();

    private Application instance;

    private KnoxActivate poSys;

    @Before
    public void setUp() throws Exception {
        instance = ApplicationProvider.getApplicationContext();
        poSys = new KnoxActivate(instance);
    }

    @Test
    public void test01ActivateDevice() {
        String lsResult = poSys.GetResult("252665215216545", "Test");
        if(lsResult == null){
            Log.d(TAG, poSys.getMessage());
        }

        assertNotNull(lsResult);
    }
}
