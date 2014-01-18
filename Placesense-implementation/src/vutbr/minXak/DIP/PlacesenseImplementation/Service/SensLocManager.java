package vutbr.minXak.DIP.PlacesenseImplementation.Service;

import vutbr.minXak.DIP.PlacesenseImplementation.Handlers.AccelerationHandler;
import vutbr.minXak.DIP.PlacesenseImplementation.Handlers.GpsHandler;
import vutbr.minXak.DIP.PlacesenseImplementation.Handlers.IMovementHandler;
import vutbr.minXak.DIP.PlacesenseImplementation.Handlers.IPathHandler;
import vutbr.minXak.DIP.PlacesenseImplementation.Handlers.IPlaceHandler;
import vutbr.minXak.DIP.PlacesenseImplementation.Handlers.WifiHandler;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SensLocManager extends Service implements ISensLocManager {

	private IPathHandler PathHandler;
	private IMovementHandler MovementHandler;
	private IPlaceHandler PlaceHandler;
	
	public SensLocManager(){
		this.PathHandler = new GpsHandler();
		this.PlaceHandler = new WifiHandler(this);
		this.MovementHandler = new AccelerationHandler();
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
