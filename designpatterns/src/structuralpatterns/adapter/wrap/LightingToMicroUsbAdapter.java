package structuralpatterns.adapter.wrap;

import structuralpatterns.adapter.phone.ifaces.LightingPhone;
import structuralpatterns.adapter.phone.ifaces.MicroUsbPhone;

public class LightingToMicroUsbAdapter implements MicroUsbPhone {
	
    private final LightingPhone lightingPhone;

    public LightingToMicroUsbAdapter(LightingPhone lightningPhone) {
        this.lightingPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightingPhone.useLighting();
    }

    @Override
    public void recharge() {
        lightingPhone.recharge();
    }
}