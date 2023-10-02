package net.minecraft.network.protocol.common.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

public record GameEventDebugPayload(ResourceKey<GameEvent> type, Vec3 pos) implements CustomPacketPayload {
   public static final ResourceLocation ID = new ResourceLocation("debug/game_event");

   public GameEventDebugPayload(FriendlyByteBuf p_299092_) {
      this(p_299092_.readResourceKey(Registries.GAME_EVENT), p_299092_.readVec3());
   }

   public void write(FriendlyByteBuf p_298899_) {
      p_298899_.writeResourceKey(this.type);
      p_298899_.writeVec3(this.pos);
   }

   public ResourceLocation id() {
      return ID;
   }
}