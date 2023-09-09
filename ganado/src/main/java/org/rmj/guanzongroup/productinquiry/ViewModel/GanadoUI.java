package org.rmj.guanzongroup.productinquiry.ViewModel;

import android.content.Intent;

import androidx.lifecycle.LiveData;

import org.rmj.g3appdriver.GCircle.room.Entities.EGanadoOnline;

public interface GanadoUI {
    void InitializeApplication(Intent params);
    LiveData<EGanadoOnline> GetApplication();
    void ParseData(EGanadoOnline args, OnParseListener listener);
    void Validate(Object args);
    void SaveData(OnSaveInfoListener listener);
}
