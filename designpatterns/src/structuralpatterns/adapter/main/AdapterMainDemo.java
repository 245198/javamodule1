package structuralpatterns.adapter.main;

import structuralpatterns.adapter.phone.ifaces.LightingPhone;
import structuralpatterns.adapter.phone.ifaces.MicroUsbPhone;
import structuralpatterns.adapter.phone.impl.Android;
import structuralpatterns.adapter.phone.impl.Iphone;
import structuralpatterns.adapter.wrap.LightingToMicroUsbAdapter;

public class AdapterMainDemo {

	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightingPhone phone) {
		phone.useLighting();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
		System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LightingToMicroUsbAdapter(iPhone));// call goes to  line#11
	}
}
