package vutbr.minXak.DIP.PlacesenseImplementation.Handlers;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;

public class WifiHandler implements IPlaceHandler {

	WifiManager mWifiManager;
	
	public WifiHandler(Service service){
		this.mWifiManager = (WifiManager) service.getSystemService(Context.WIFI_SERVICE);
	}
	
	@Override
	public void TurnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TurnOff() {
		// TODO Auto-generated method stub		
	}
	
	private void StartScan(){
		
	}
	
	private void MakeScan(){
		this.mWifiManager.startScan();
		this.mWifiManager.SCAN_RESULTS_AVAILABLE_ACTION
	}


}
