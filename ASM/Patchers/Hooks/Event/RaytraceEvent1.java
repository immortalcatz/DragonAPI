package Reika.DragonAPI.ASM.Patchers.Hooks.Event;

import Reika.DragonAPI.ASM.Patchers.RaytracePatcher;


public class RaytraceEvent1 extends RaytracePatcher {

	public RaytraceEvent1() {
		super("net.minecraft.entity.projectile.EntityArrow", "zc");
	}
}
