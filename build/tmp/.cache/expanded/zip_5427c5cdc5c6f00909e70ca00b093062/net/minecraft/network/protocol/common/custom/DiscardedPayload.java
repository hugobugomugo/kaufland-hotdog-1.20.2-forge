package net.minecraft.network.protocol.common.custom;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;

public record DiscardedPayload(ResourceLocation id, @org.jetbrains.annotations.Nullable FriendlyByteBuf data) implements CustomPacketPayload {
   public DiscardedPayload(ResourceLocation id) {
      this(id, null);
   }

   public void write(FriendlyByteBuf p_301050_) {
       if (data != null)
          p_301050_.writeBytes(data.slice());
   }

   public ResourceLocation id() {
      return this.id;
   }
}
