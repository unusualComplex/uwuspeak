package me.uwuspeak;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class UspeakPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(UspeakPlugin.class);
		RuneLite.main(args);
	}
}