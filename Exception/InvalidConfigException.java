/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.DragonAPI.Exception;

import net.minecraftforge.common.config.Property;
import Reika.DragonAPI.Base.DragonAPIMod;
import Reika.DragonAPI.Interfaces.Configuration.BoundedConfig;
import Reika.DragonAPI.Interfaces.Configuration.ConfigList;

public class InvalidConfigException extends DragonAPIException {

	public InvalidConfigException(DragonAPIMod mod, ConfigList cfg, String bounds, Property p) {
		this(mod, cfg.getLabel(), bounds, p.getString());
	}

	public InvalidConfigException(DragonAPIMod mod, BoundedConfig cfg, Property p) {
		this(mod, cfg.getLabel(), cfg.getBoundsAsString(), p.getString());
	}

	private InvalidConfigException(DragonAPIMod mod, String name, String bounds, String val) {
		message.append(mod.getDisplayName()+" was not configured correctly:\n");
		message.append("Setting '"+name+"' was set to value '"+val+"', which is invalid. Value must be in the bounds "+bounds+".\n");
		message.append("Try consulting "+mod.getDocumentationSite().toString()+"for information.\n");
		message.append("This is not a "+mod.getDisplayName()+" bug. Do not post it to "+mod.getDocumentationSite().toString()+" unless you are really stuck.");
		this.crash();
	}

}
