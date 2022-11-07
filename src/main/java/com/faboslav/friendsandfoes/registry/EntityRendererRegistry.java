package com.faboslav.friendsandfoes.registry;


import com.faboslav.friendsandfoes.client.render.entity.CopperGolemEntityRenderer;
import com.faboslav.friendsandfoes.client.render.entity.GlareEntityRenderer;
import com.faboslav.friendsandfoes.client.render.entity.MoobloomEntityRenderer;
import com.faboslav.friendsandfoes.client.render.entity.model.CopperGolemEntityModel;
import com.faboslav.friendsandfoes.client.render.entity.model.GlareEntityModel;
import com.faboslav.friendsandfoes.config.Settings;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
public class EntityRendererRegistry
{
	public static final EntityModelLayer COPPER_GOLEM_LAYER = new EntityModelLayer(Settings.makeID("copper_golem"), "main");
	public static final EntityModelLayer GLARE_LAYER = new EntityModelLayer(Settings.makeID("glare"), "main");
	public static final EntityModelLayer MOOBLOOM_LAYER = new EntityModelLayer(Settings.makeID("moobloom"), "main");

	public static void init() {
		net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(EntityRegistry.COPPER_GOLEM, CopperGolemEntityRenderer::new);
		net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(EntityRegistry.GLARE, GlareEntityRenderer::new);
		net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(EntityRegistry.MOOBLOOM, MoobloomEntityRenderer::new);

		EntityModelLayerRegistry.registerModelLayer(COPPER_GOLEM_LAYER, CopperGolemEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(GLARE_LAYER, GlareEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(MOOBLOOM_LAYER, CowEntityModel::getTexturedModelData);
	}
}